package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio2Activity extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto, lblTexto2;
    private Button btnTraspasa1, btnTraspasa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        txtTexto = findViewById(R.id.txtTexto);
        lblTexto = findViewById(R.id.lblTexto);
        lblTexto2 = findViewById(R.id.lblTexto2);
        btnTraspasa1 = findViewById(R.id.btnTraspasa1);
        btnTraspasa2 = findViewById(R.id.btnTraspasa2);

        btnTraspasa1.setOnClickListener(v -> {
            String texto = txtTexto.getText().toString();
            lblTexto.setText(texto);
        });

        btnTraspasa2.setOnClickListener(v -> {
            String texto = txtTexto.getText().toString();
            lblTexto2.setText(texto);
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio2Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
