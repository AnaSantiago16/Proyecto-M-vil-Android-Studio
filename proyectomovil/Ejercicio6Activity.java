package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio6Activity extends AppCompatActivity {

    private Button btnActualizar;
    private TextView lblTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        btnActualizar = findViewById(R.id.btnActualizar);
        lblTexto = findViewById(R.id.lblTexto);

        lblTexto.setText("Esperando...");

        btnActualizar.setOnClickListener(v -> {
            String mensaje = "¡Texto actualizado correctamente!";
            lblTexto.setText(mensaje);
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio6Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
