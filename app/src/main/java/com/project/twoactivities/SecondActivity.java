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
    Button[] buttons=new Button[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttons[0] = findViewById(R.id.cheeseItem);
        buttons[1] = findViewById(R.id.riceItem);
        buttons[2] = findViewById(R.id.appleItem);
        buttons[3] = findViewById(R.id.orangeItem);
        buttons[4] = findViewById(R.id.sausageItem);
        buttons[5] = findViewById(R.id.potatoItem);
        buttons[6] = findViewById(R.id.noodlesItem);
        buttons[7] = findViewById(R.id.biscuitItem);
        buttons[8] = findViewById(R.id.dairymilkItem);
        buttons[9] = findViewById(R.id.chocopieItem);
        for(Button button:buttons){
            button.setOnClickListener(this::onClick);
        }
    }

    public static Intent makeIntent(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        return intent;
    }

    @Override
    public void onClick(View v) {
        for(int i=0;i<buttons.length;i++){
            if(v.getId()==buttons[i].getId()){
                Intent intent=new Intent();
                intent.putExtra("item_name",buttons[i].getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        }
    }
}