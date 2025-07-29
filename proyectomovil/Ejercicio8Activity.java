package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio8Activity extends AppCompatActivity {

    private CheckBox chkFutbol, chkBasquet, chkNatacion;
    private TextView lblSeleccion;
    private Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);

        chkFutbol = findViewById(R.id.chkFutbol);
        chkBasquet = findViewById(R.id.chkBasquet);
        chkNatacion = findViewById(R.id.chkNatacion);
        lblSeleccion = findViewById(R.id.lblSeleccion);
        btnMostrar = findViewById(R.id.btnMostrar);

        btnMostrar.setOnClickListener(v -> {
            StringBuilder deportes = new StringBuilder();

            if (chkFutbol.isChecked()) {
                deportes.append("Fútbol ");
            }
            if (chkBasquet.isChecked()) {
                deportes.append("Basquetbol ");
            }
            if (chkNatacion.isChecked()) {
                deportes.append("Natación ");
            }

            if (deportes.length() == 0) {
                lblSeleccion.setText("No se seleccionó ningún deporte.");
            } else {
                lblSeleccion.setText("Seleccionado: " + deportes.toString());
            }
        });
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio8Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
