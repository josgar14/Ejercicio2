package com.example.e2_interactuando_varias_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import static android.graphics.Color.parseColor;

public class Pantalla3Miembro2 extends AppCompatActivity {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3_miembro2);


        this.window = getWindow();

        SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
        String color = prefs.getString("color", "default");


        //validar si la variable esta vacia
        if (color=="default")  {

            Toast.makeText(this, "Fondo ", Toast.LENGTH_SHORT).show();

        } else  {

            cambiar(color);
        }


    }

    public void  cambiar(String color ){

        window.setBackgroundDrawable(new ColorDrawable(parseColor(color)));




    }
}
