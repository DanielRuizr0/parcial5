package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
     TextView nume1, nume2, nume3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }


    public void irASecondActivity(View view) {
        Button btnVolver1 = findViewById(R.id.regresar1);
        if (btnVolver1 != null) {
            btnVolver1.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
                finish();
            });
        }
    }
}