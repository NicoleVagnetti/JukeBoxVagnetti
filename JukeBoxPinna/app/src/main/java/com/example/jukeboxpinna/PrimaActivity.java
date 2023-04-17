package com.example.jukeboxpinna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PrimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mostrare il titolo
        int numerocanzone =10; //numero da recuperare dal'intent

        TextView titolo = findViewById(R.id.IdTitolo);
        ImageView cover = findViewById(R.id.IdImmmagine);

        if(numerocanzone == 10) {
            titolo.setText("Stars");
            cover.setImageResource(R.drawable.Stars);
        }
        else {
            titolo.setText("Pomodoro");
            cover.setImageResource(R.drawable.Pomodoro);
        }


    }
}