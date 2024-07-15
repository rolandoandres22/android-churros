package com.example.churrospop;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChurroActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_churro);

        String msg = getIntent().getStringExtra("pop");

        TextView pop = findViewById(R.id.pop);

        Log.e("debug", msg);

        pop.setText("Usted pidio: " + msg + " Churros");
    }
}
