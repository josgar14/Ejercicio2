package com.example.e2_interactuando_varias_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton miembro1;
    ImageButton miembro2;
    ImageButton miembro3;
   ImageButton confi;

    // agregado hoy






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miembro1 = (ImageButton) findViewById(R.id.btn_miembro1);
        miembro2 = (ImageButton) findViewById(R.id.btn_miembro2);
        miembro3 = (ImageButton) findViewById(R.id.btn_miembro3);
        confi = (ImageButton) findViewById(R.id.btn_configuracion);


        confi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, configuracion.class);


                startActivity(c);


            }
        });

        miembro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m1 = new Intent(MainActivity.this, Pantalla2Miembro1.class);
                startActivity(m1);
            }
        });

        miembro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent m2 = new Intent(MainActivity.this, Pantalla3Miembro2.class);
                startActivity(m2);

            }
        });

        miembro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent m3 = new Intent(MainActivity.this, Pantalla4Miembro3.class);
                startActivity(m3);

            }
        });













    }

}


