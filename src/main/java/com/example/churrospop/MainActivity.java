package com.example.churrospop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.churrospop.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final EditText etchurro = findViewById(R.id.etchurro);
        Button btnpop = findViewById(R.id.btnpop);

        btnpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String churro = etchurro.getText().toString();
                if(churro.isEmpty()){
                    return;
                }
                Intent intent = new Intent(MainActivity.this, ChurroActivity.class);
                intent.putExtra("pop", churro);
                startActivity(intent);
            }
        });
    }

}