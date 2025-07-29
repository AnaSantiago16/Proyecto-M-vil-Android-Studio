package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio4Activity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtCiudad;
    private TextView txtFrase;
    private Button btnAceptar, btnDesactivar, btnActivar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        txtNombre = findViewById(R.id.txtNombre);
        txtCiudad = findViewById(R.id.txtCiudad);
        txtFrase = findViewById(R.id.txtFrase);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnDesactivar = findViewById(R.id.btnDesactivar);
        btnActivar = findViewById(R.id.btnActivar);

        btnAceptar.setOnClickListener(v -> {
            String nombre = txtNombre.getText().toString();
            String ciudad = txtCiudad.getText().toString();
            txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad);
        });

        btnDesactivar.setOnClickListener(v -> {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
            txtFrase.setText("");
        });

        btnActivar.setOnClickListener(v -> {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
            txtFrase.setText("");
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio4Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
