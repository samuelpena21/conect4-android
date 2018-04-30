package com.sapp.prueba.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Objetivo extends AppCompatActivity {
MediaPlayer reproducir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetivo);

        reproducir=MediaPlayer.create(this,R.raw.jazz);
        reproducir.setLooping(true);
        reproducir.start();}
    protected void onResume(){
        super.onResume();
        reproducir.start();


    }

    protected void onStop(){
        super.onStop();
        reproducir.pause();

    }

    protected void onRestart(){
        super.onRestart();
        reproducir.start();

    }


}
