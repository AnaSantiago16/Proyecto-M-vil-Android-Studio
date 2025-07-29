package com.example.proyectomovil;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio5Activity extends AppCompatActivity {

    private EditText txtUnidades, txtPrecio;
    private TextView lblTotalSinIva, lblIva, lblTotalMasIva;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        txtUnidades = findViewById(R.id.txtUnidades);
        txtPrecio = findViewById(R.id.txtPrecio);
        lblTotalSinIva = findViewById(R.id.lblTotalSinIva);
        lblIva = findViewById(R.id.lblIva);
        lblTotalMasIva = findViewById(R.id.lblTotalMasIva);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(v -> {
            String unidadesStr = txtUnidades.getText().toString();
            String precioStr = txtPrecio.getText().toString();

            if (TextUtils.isEmpty(unidadesStr) || TextUtils.isEmpty(precioStr)) {
                Toast.makeText(this, "Por favor ingresa unidades y precio", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                int unidades = Integer.parseInt(unidadesStr);
                int precio = Integer.parseInt(precioStr);

                if (unidades == 0) {
                    Toast.makeText(this, "Unidades no puede ser cero", Toast.LENGTH_SHORT).show();
                    return;
                }

                int totalSinIva = unidades * precio;
                double iva = totalSinIva * 0.16;
                double totalMasIva = totalSinIva + iva;

                lblTotalSinIva.setText(String.format("%.2f", (double)totalSinIva));
                lblIva.setText(String.format("%.2f", iva));
                lblTotalMasIva.setText(String.format("%.2f", totalMasIva));
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Valores inválidos", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio5Activity.this, MainActivity.class);
            // Limpia el backstack para evitar que al presionar atrás vuelva a esta actividad
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });

    }
}
