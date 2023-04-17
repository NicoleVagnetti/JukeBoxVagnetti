package com.example.simoniandreacalcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double temp=0;
    char operator='n';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void number(View v)
    {
        Button b=(Button)v;
        Log.d("numero","il numero è"+ b.getText().toString());
        EditText input = findViewById(R.id.editTextNumber);
        input.setText("0");
        temp=0;
        operator='n';
        if(input.getText().toString().equals("0"))
        {
            input.setText(b.getText());
        }else{
        input.getText().append(b.getText());
        }
    }
    public void operation(View v){
        Button b=(Button)v;
        Log.d("numero","il numero è"+ b.getText().toString());
        EditText input = findViewById(R.id.editTextNumber);
        if(operator=='n') {
            operator = ((Button) v).getText().charAt(0);
            double numero = Double.parseDouble(input.getText().toString());
            temp = numero;
            if(operator!='='){
                input.setText("0");
            }
        }else{

        }
    }
    public void clear(View v){
        Button b=(Button)v;
        Log.d("numero","il numero è"+ b.getText().toString());
        EditText input = findViewById(R.id.editTextNumber);
        input.setText("0");
        temp=0;
        operator='n';
    }
    public void point(View v){
        Button b=(Button)v;
        Log.d("numero","il numero è"+ b.getText().toString());
        EditText input = findViewById(R.id.editTextNumber);
        if(!input.getText().toString().contains(".")){
            input.setText(input.getText()+".");
        }

    }
}