package com.project.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button cheeseItem, riceItem, appleItem, orangeItem, sausageItem, potatoItem, noodlesItem, buscuitItem, dairymilkItem, chocopieItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        cheeseItem = findViewById(R.id.cheeseItem);
        cheeseItem.setOnClickListener(this);
        /*
        riceItem = findViewById(R.id.riceItem);
        riceItem.setOnClickListener(this::onClick);
        appleItem = findViewById(R.id.appleItem);
        appleItem.setOnClickListener(this);
        orangeItem = findViewById(R.id.orangeItem);
        orangeItem.setOnClickListener(this);
        sausageItem = findViewById(R.id.sausageItem);
        potatoItem.setOnClickListener(this);
        potatoItem = findViewById(R.id.potatoItem);
        noodlesItem.setOnClickListener(this);
        noodlesItem = findViewById(R.id.noodlesItem);
        buscuitItem.setOnClickListener(this::onClick);
        buscuitItem = findViewById(R.id.biscuitItem);
        dairymilkItem.setOnClickListener(this);
        dairymilkItem = findViewById(R.id.dairymilkItem);
        chocopieItem.setOnClickListener(this);
        chocopieItem = findViewById(R.id.chocopieItem);

         */
    }

    public static Intent makeIntent(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        return intent;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.cheeseItem:
                intent = new Intent();
                intent.putExtra("item1", cheeseItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
                /*
            case R.id.riceItem:
                intent = new Intent();
                intent.putExtra("item1", riceItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.appleItem:
                intent = new Intent();
                intent.putExtra("item1", appleItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.orangeItem:
                intent = new Intent();
                intent.putExtra("item1", orangeItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.sausageItem:
                intent = new Intent();
                intent.putExtra("item1", sausageItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.potatoItem:
                intent = new Intent();
                intent.putExtra("item1", potatoItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.noodlesItem:
                intent = new Intent();
                intent.putExtra("item1", noodlesItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.biscuitItem:
                intent = new Intent();
                intent.putExtra("item1", buscuitItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.dairymilkItem:
                intent = new Intent();
                intent.putExtra("item1", dairymilkItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;

            case R.id.chocopieItem:
                intent = new Intent();
                intent.putExtra("item1", chocopieItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            */
            default:
                break;

        }
    }
}