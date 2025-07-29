package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio9Activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton rbtnEfectivo, rbtnTarjeta, rbtnTransferencia;
    private Button btnConfirmar;
    private TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        radioGroup = findViewById(R.id.radioGroup);
        rbtnEfectivo = findViewById(R.id.rbtnEfectivo);
        rbtnTarjeta = findViewById(R.id.rbtnTarjeta);
        rbtnTransferencia = findViewById(R.id.rbtnTransferencia);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        lblMensaje = findViewById(R.id.lblMensaje);

        btnConfirmar.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == rbtnEfectivo.getId()) {
                lblMensaje.setText("Seleccionaste: Efectivo");
            } else if (selectedId == rbtnTarjeta.getId()) {
                lblMensaje.setText("Seleccionaste: Tarjeta");
            } else if (selectedId == rbtnTransferencia.getId()) {
                lblMensaje.setText("Seleccionaste: Transferencia");
            } else {
                lblMensaje.setText("No se seleccionó ningún método de pago");
            }
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio9Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
