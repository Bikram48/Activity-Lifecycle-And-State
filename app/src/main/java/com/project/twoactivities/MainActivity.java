package com.project.twoactivities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 1;
    private TextView[] textViews;
    private ArrayList<String> itemLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViews=new TextView[10];
        textViews[0]=findViewById(R.id.item1);
        textViews[1]=findViewById(R.id.item2);
        textViews[2]=findViewById(R.id.item3);
        textViews[3]=findViewById(R.id.item4);
        textViews[4]=findViewById(R.id.item5);
        textViews[5]=findViewById(R.id.item6);
        textViews[6]=findViewById(R.id.item7);
        textViews[7]=findViewById(R.id.item8);
        textViews[8]=findViewById(R.id.item9);
        textViews[9]=findViewById(R.id.item10);
        for(TextView textView:textViews){
            textView.setVisibility(View.GONE);
        }
        itemLists=new ArrayList<>();
        if(savedInstanceState!=null){
            itemLists=savedInstanceState.getStringArrayList("items");
            for(int i=0;i<itemLists.size();i++){
                textViews[i].setText(itemLists.get(i));
                textViews[i].setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList("items",itemLists);
    }

    public void addItems(View view) {
        Intent intent=SecondActivity.makeIntent(MainActivity.this);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                if(!itemLists.contains(data.getStringExtra("item_name"))) {
                    itemLists.add(data.getStringExtra("item_name"));
                }
                else
                    Toast.makeText(this, "Sorry your item is already exists.Please select new one!!", Toast.LENGTH_SHORT).show();
                for(int i=0;i<itemLists.size();i++){
                    textViews[i].setText(itemLists.get(i));
                    textViews[i].setVisibility(View.VISIBLE);
                }
            }
        }
    }
}