package com.example.myapplicationone.examenej2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listViewComidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listViewComidas = findViewById(R.id.listViewComidas);

        String[] platos = {
                "Ceviche", "Lomo Saltado", "Pollo a la Brasa", "Ají de Gallina",
                "Arroz con Pollo", "Causa Rellena", "Anticuchos", "Tallarines Verdes",
                "Papa a la Huancaína", "Arroz Chaufa"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platos);
        listViewComidas.setAdapter(adapter);

        listViewComidas.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String platoElegido = platos[i];
                Intent intent = new Intent(MainActivity.this, DetalleComidaActivity.class);
                intent.putExtra("PLATO", platoElegido);
                startActivity(intent);
            }
        });
    }
}