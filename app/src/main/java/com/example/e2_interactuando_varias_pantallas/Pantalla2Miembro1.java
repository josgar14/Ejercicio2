package com.example.e2_interactuando_varias_pantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import yuku.ambilwarna.AmbilWarnaDialog;

import static android.graphics.Color.parseColor;


public class Pantalla2Miembro1 extends AppCompatActivity {

    private Window window;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2_miembro1);

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
