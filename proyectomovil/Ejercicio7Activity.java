package com.example.proyectomovil;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio7Activity extends AppCompatActivity {

    private Button btnColor;
    private LinearLayout layoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        btnColor = findViewById(R.id.btnColor);
        layoutRoot = findViewById(R.id.layoutRoot);

        btnColor.setOnClickListener(v -> {
            // Cambiar el color de fondo a CYAN (similar a Color.CYAN en Java Swing)
            layoutRoot.setBackgroundColor(Color.CYAN);
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio7Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
