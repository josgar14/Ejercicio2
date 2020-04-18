package com.example.e2_interactuando_varias_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class configuracion extends AppCompatActivity {

    Button verde;
    Button amarillo;
    Button morado ;
    Button azul;
    Button gris;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        verde = (Button) findViewById(R.id.btn_verde);
        amarillo = (Button) findViewById(R.id.btn_Ama2);
        morado = (Button) findViewById(R.id.btn_morado);
        azul = (Button) findViewById(R.id.btn_azul);
        gris = (Button) findViewById(R.id.btn_gris);





        //enviar color verde
        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("color", "#03DAC5");
                editor.commit();

               aceptar();

            }
        });


        amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("color", "#FFFC33");
                editor.commit();

                aceptar();


            }
        });


        morado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("color", "#B88CE2");
                editor.commit();

                aceptar();
            }
        });

        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("color", "#0F3DF5");
                editor.commit();

                aceptar();
            }
        });


        gris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("color", "#BBB2B8");
                editor.commit();

                aceptar();
            }
        });




    }

    private void aceptar() {
        Toast t=Toast.makeText(this,"Tema Aplicado", Toast.LENGTH_SHORT);
        t.show();

    }
}
