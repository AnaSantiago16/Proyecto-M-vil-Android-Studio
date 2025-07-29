package com.example.proyectomovil;
// MainActivity.java


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int TOTAL_EJERCICIOS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i <= TOTAL_EJERCICIOS; i++) {
            int resID = getResources().getIdentifier("btnEjercicio" + i, "id", getPackageName());
            Button btn = findViewById(resID);
            int finalI = i;

            btn.setOnClickListener(v -> {
                try {
                    Class<?> clase = Class.forName("com.example.proyectomovil.Ejercicio" + finalI + "Activity");
                    startActivity(new Intent(MainActivity.this, clase));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
