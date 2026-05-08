package com.example.myapplicationone.examenej_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerPaises;
    Button btnVerDetalle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        spinnerPaises = findViewById(R.id.spinnerPaises);
        btnVerDetalle = findViewById(R.id.btnVerDetalle);

        String[] paises = {"Perú", "Argentina", "Colombia", "Chile", "México", "Brasil"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, paises);
        spinnerPaises.setAdapter(adapter);

        btnVerDetalle.setOnClickListener(v -> {
            String paisSeleccionado = spinnerPaises.getSelectedItem().toString();
            Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
            intent.putExtra("PAIS", paisSeleccionado);
            startActivity(intent);
        });
    }
}