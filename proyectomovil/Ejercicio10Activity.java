package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio10Activity extends AppCompatActivity {

    private Spinner spinnerCiudades;
    private Button btnMostrar;
    private TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);

        spinnerCiudades = findViewById(R.id.spinnerCiudades);
        btnMostrar = findViewById(R.id.btnMostrar);
        lblMensaje = findViewById(R.id.lblMensaje);

        // Lista de ciudades
        String[] ciudades = {"Ciudad de Mexico", "Guadalajara", "Monterrey", "Cancún", "Tijuana"};

        // Adaptador para el spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ciudades);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCiudades.setAdapter(adapter);

        btnMostrar.setOnClickListener(v -> {
            String ciudadSeleccionada = (String) spinnerCiudades.getSelectedItem();
            if (ciudadSeleccionada != null && !ciudadSeleccionada.isEmpty()) {
                lblMensaje.setText("Seleccionaste: " + ciudadSeleccionada);
            } else {
                lblMensaje.setText("No se seleccionó ninguna ciudad.");
            }
        });
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio10Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
