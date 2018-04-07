package com.sapp.prueba.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Created by dell on 07/04/2018.
 */

public class cuadroDialog {
    public  cuadroDialog(final Context contexto){

        final Dialog dialogo = new Dialog(contexto);
        dialogo.setCancelable(false);
        dialogo.setContentView(R.layout.redwin);

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
