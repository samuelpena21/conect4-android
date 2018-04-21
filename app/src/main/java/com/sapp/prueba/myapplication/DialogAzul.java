package com.sapp.prueba.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

class DialogAzul {
    DialogAzul(final Context contexto){

        final Dialog dialogo = new Dialog(contexto);
        dialogo.setCancelable(false);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setContentView(R.layout.bluewin_dialog);

        Button refresh = dialogo.findViewById(R.id.button5);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogo.dismiss();
                Intent intent = new Intent(contexto,MainActivity.class);
                contexto.startActivity(intent);
            }
        });
        dialogo.show();


    }
}
