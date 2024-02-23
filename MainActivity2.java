package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView Mnombre, Mapellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void irAMainActivity(View view) {
        Button btnVolverMain = findViewById(R.id.regresar);
        if (btnVolverMain != null) {
            btnVolverMain.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            });
        }
    }

    public void irATerceraActivity(View view) {
        Button btnSiguiente = findViewById(R.id.adelante);
        if (btnSiguiente != null) {
            btnSiguiente.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                finish();
            });
        }
    }
    public void irManzana(View view) {
        Button btnmanzana = findViewById(R.id.compra1);
        if (btnmanzana != null) {
            btnmanzana.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                finish();
            });
        }
    }

    public void irnaranja(View view) {
        Button btnnaranja = findViewById(R.id.compra2);
        if (btnnaranja != null) {
            btnnaranja.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                finish();
            });
        }
    }
}