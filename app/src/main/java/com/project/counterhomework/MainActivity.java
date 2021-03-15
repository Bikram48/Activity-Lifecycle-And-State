package com.project.counterhomework;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private TextView mCount;
    private EditText mMessageEditText;
    private Button buttonCount;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount=(TextView) findViewById(R.id.text_count);
        buttonCount=(Button) findViewById(R.id.button_count);
        if (savedInstanceState != null) {
            count=savedInstanceState.getInt("count");
            mCount.setText(String.valueOf(count));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count);
    }

    public void incrementCount(View view) {
        count++;
        mCount.setText(String.valueOf(count));
    }
}