package com.sapp.prueba.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
Button jugar;
Button info;
MediaPlayer reproducir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //mostrar informacion
info=findViewById(R.id.button4);
info.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent info = new Intent(MenuActivity.this,Objetivo.class);
        startActivity(info);
    }
});
//Mostrar juego
        jugar=findViewById(R.id.button3);
        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jugar = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(jugar);
            }
        });



    //musica de fondo
        reproducir=MediaPlayer.create(this,R.raw.musica);
        reproducir.setLooping(true);
        reproducir.start();
    }
}
