package com.sapp.prueba.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
Button jugar;
Button info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
info=findViewById(R.id.button4);
info.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent info = new Intent(MenuActivity.this,Objetivo.class);
        startActivity(info);
    }
});
        jugar=findViewById(R.id.button3);
        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jugar = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(jugar);
            }
        });
    }
}
