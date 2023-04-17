package com.example.calcolatrice_5cinf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double temp = 0;
    EditText input = findViewById(R.id.editTextNumber);
    char operator = '+';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear(View v){
        input.setText("0");
        temp = 0;
        operator = '+';
    }
}