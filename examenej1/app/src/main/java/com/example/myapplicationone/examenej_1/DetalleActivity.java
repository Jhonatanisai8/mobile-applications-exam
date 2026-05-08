package com.example.myapplicationone.examenej_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {
    ImageView imgBandera;
    TextView txtDescripcion;
    Button btnRegresar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imgBandera = findViewById(R.id.imgBandera);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        btnRegresar = findViewById(R.id.btnRegresar);

        String paisRecibido = getIntent().getStringExtra("PAIS");

        if (paisRecibido != null) {
            switch (paisRecibido) {
                case "Perú":
                    imgBandera.setImageResource(R.drawable.bandera_peru);
                    txtDescripcion.setText("Perú: Conocido por Machu Picchu y su increíble gastronomía. ");
                    break;

                case "Argentina":
                    imgBandera.setImageResource(R.drawable.bandera_argentina);
                    txtDescripcion.setText("Argentina: Famosa por el tango, el asado y el fútbol.");
                    break;

                case "Colombia":
                    imgBandera.setImageResource(R.drawable.bandera_colombia);
                    txtDescripcion.setText("Colombia: Destaca por su café de alta calidad y la cumbia.");
                    break;

                case "Chile":
                    imgBandera.setImageResource(R.drawable.bandera_chile);
                    txtDescripcion.setText("Chile: País largo y estrecho, hogar de la cordillera de los Andes.");
                    break;

                case "México":
                    imgBandera.setImageResource(R.drawable.bandera_mexico);
                    txtDescripcion.setText("México: Rico en cultura maya y azteca, y tacos deliciosos.");
                    break;

                case "Brasil":
                    imgBandera.setImageResource(R.drawable.bandera_brasil);
                    txtDescripcion.setText("Brasil: El país de la samba, el carnaval y el Amazonas.");
                    break;

            }
        }

        btnRegresar.setOnClickListener(v -> {
            finish();
        });

    }
}

