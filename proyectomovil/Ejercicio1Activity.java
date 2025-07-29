package com.example.proyectomovil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class Ejercicio1Activity extends AppCompatActivity {

    private TextView lblNombre, lblCiudad;
    private Button btnOcultarNombre, btnVisualizarNombre, btnOcultarCiudad, btnVisualizarCiudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        // Referencias
        lblNombre = findViewById(R.id.lblNombre);
        lblCiudad = findViewById(R.id.lblCiudad);
        btnOcultarNombre = findViewById(R.id.btnOcultarNombre);
        btnVisualizarNombre = findViewById(R.id.btnVisualizarNombre);
        btnOcultarCiudad = findViewById(R.id.btnOcultarCiudad);
        btnVisualizarCiudad = findViewById(R.id.btnVisualizarCiudad);

        // Acciones
        btnOcultarNombre.setOnClickListener(v -> lblNombre.setVisibility(View.INVISIBLE));
        btnVisualizarNombre.setOnClickListener(v -> lblNombre.setVisibility(View.VISIBLE));
        btnOcultarCiudad.setOnClickListener(v -> lblCiudad.setVisibility(View.INVISIBLE));
        btnVisualizarCiudad.setOnClickListener(v -> lblCiudad.setVisibility(View.VISIBLE));

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio1Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
