package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio3Activity extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto;
    private Button btnVaciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        txtTexto = findViewById(R.id.txtTexto);
        lblTexto = findViewById(R.id.lblTexto);
        btnVaciar = findViewById(R.id.btnVaciar);

        // Actualizar lblTexto mientras escribes en txtTexto
        txtTexto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // No se usa
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                lblTexto.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // No se usa
            }
        });

        btnVaciar.setOnClickListener(v -> {
            txtTexto.setText("");
            lblTexto.setText("");
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio3Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
