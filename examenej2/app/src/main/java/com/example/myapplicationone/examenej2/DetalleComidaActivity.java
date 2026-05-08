package com.example.myapplicationone.examenej2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleComidaActivity extends AppCompatActivity {
    ImageView imgPlato;
    TextView txtDetalleOferta;
    Button btnVolverMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_comida);
        imgPlato = findViewById(R.id.imgPlato);
        txtDetalleOferta = findViewById(R.id.txtDetalleOferta);
        btnVolverMenu = findViewById(R.id.btnVolverMenu);

        String platoRecibido = getIntent().getStringExtra("PLATO");

        if (platoRecibido != null) {
            switch (platoRecibido) {
                case "Ceviche":
                    imgPlato.setImageResource(R.drawable.ceviche);
                    txtDetalleOferta.setText("Clásico Ceviche de pescado fresco.\n OFERTA: Llévatelo hoy con chicharrón de pota a mitad de precio.");
                    break;
                case "Lomo Saltado":
                    imgPlato.setImageResource(R.drawable.lomo_saltado);
                    txtDetalleOferta.setText("Jugozo lomo con papas fritas y arroz.\n OFERTA: Incluye chicha morada de litro gratis.");
                    break;
                case "Pollo a la Brasa":
                    imgPlato.setImageResource(R.drawable.pollo_brasa);
                    txtDetalleOferta.setText("1/4 de pollo con papas y ensalada.\n OFERTA: Por S/5 más, agrandas tus papas y cremas.");
                    break;
                case "Ají de Gallina":
                    imgPlato.setImageResource(R.drawable.aji_gallina);
                    txtDetalleOferta.setText("Cremoso ají de gallina con pecanas.\n OFERTA: 2x1 solo por el día de hoy.");
                    break;
                case "Arroz con Pollo":
                    imgPlato.setImageResource(R.drawable.arroz_pollo);
                    txtDetalleOferta.setText("Arroz con pollo verde y su sarsa criolla.\n OFERTA: Viene con porción de papa a la huancaína de cortesía.");
                    break;
                case "Causa Rellena":
                    imgPlato.setImageResource(R.drawable.causa_rellena);
                    txtDetalleOferta.setText("Causa de pollo con palta y mayonesa.\n OFERTA: Pide 2 porciones y la tercera es gratis.");
                    break;
                case "Anticuchos":
                    imgPlato.setImageResource(R.drawable.anticuchos);
                    txtDetalleOferta.setText("3 palitos de anticucho con rachi y papas.\n OFERTA: Picarones de regalo con tu compra.");
                    break;
                case "Tallarines Verdes":
                    imgPlato.setImageResource(R.drawable.tallarines_verdes);
                    txtDetalleOferta.setText("Tallarines verdes con apanado de res.\n OFERTA: 15% de descuento presentando tu carnet universitario.");
                    break;
                case "Papa a la Huancaína":
                    imgPlato.setImageResource(R.drawable.papa_huancaina);
                    txtDetalleOferta.setText("Entrada clásica con huevo y aceituna.\n OFERTA: Promoción 2x1 para empezar bien el almuerzo.");
                    break;
                case "Arroz Chaufa":
                    imgPlato.setImageResource(R.drawable.arroz_chaufa);
                    txtDetalleOferta.setText("Arroz chaufa de pollo con su sillao.\n OFERTA: Porción de wantán frito gratis por tu compra.");
                    break;
            }
        }

        btnVolverMenu.setOnClickListener(v -> finish());
    }
}
