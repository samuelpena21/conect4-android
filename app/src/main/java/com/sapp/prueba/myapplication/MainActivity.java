package com.sapp.prueba.myapplication;

import android.content.Context;
//import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer reproducir, mp, aplauso,boing;


    ImageView imageView0_0, imageView0_1, imageView0_2, imageView0_3, imageView0_4, imageView0_5, imageView0_6,
            imageView1_0, imageView1_1, imageView1_2, imageView1_3, imageView1_4, imageView1_5, imageView1_6,
            imageView2_0, imageView2_1, imageView2_2, imageView2_3, imageView2_4, imageView2_5, imageView2_6,
            imageView3_0, imageView3_1, imageView3_2, imageView3_3, imageView3_4, imageView3_5, imageView3_6,
            imageView4_0, imageView4_1, imageView4_2, imageView4_3, imageView4_4, imageView4_5, imageView4_6,
            imageView5_0, imageView5_1, imageView5_2, imageView5_3, imageView5_4, imageView5_5, imageView5_6;

    TextView txtInformacion; //muestra el turno del jugador en la parte de arriba de la pantalla

    Button newGameButton;
    Context contexto;


    boolean turno = false; //variable que controla el turno del jugador: si es false es azul. si es true roja.
    int totalMovimientos = 42;
    int column = 0; //Variable que dice que columna se esta presionando
    int[][] board = new int[6][7]; //Matriz que hace los calculos numericos
    ImageView[][] boardImagenes; //Matriz con la imagenes


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contexto = this;
        //Referencia de todos los ImageVIews del cuadro
        //Cada ficha es un ImageView
        imageView0_0 = findViewById(R.id.imageView0_0);
        imageView0_1 = findViewById(R.id.imageView0_1);
        imageView0_2 = findViewById(R.id.imageView0_2);
        imageView0_3 = findViewById(R.id.imageView0_3);
        imageView0_4 = findViewById(R.id.imageView0_4);
        imageView0_5 = findViewById(R.id.imageView0_5);
        imageView0_6 = findViewById(R.id.imageView0_6);
        imageView1_0 = findViewById(R.id.imageView1_0);
        imageView1_1 = findViewById(R.id.imageView1_1);
        imageView1_2 = findViewById(R.id.imageView1_2);
        imageView1_3 = findViewById(R.id.imageView1_3);
        imageView1_4 = findViewById(R.id.imageView1_4);
        imageView1_5 = findViewById(R.id.imageView1_5);
        imageView1_6 = findViewById(R.id.imageView1_6);
        imageView2_0 = findViewById(R.id.imageView2_0);
        imageView2_1 = findViewById(R.id.imageView2_1);
        imageView2_2 = findViewById(R.id.imageView2_2);
        imageView2_3 = findViewById(R.id.imageView2_3);
        imageView2_4 = findViewById(R.id.imageView2_4);
        imageView2_5 = findViewById(R.id.imageView2_5);
        imageView2_6 = findViewById(R.id.imageView2_6);
        imageView3_0 = findViewById(R.id.imageView3_0);
        imageView3_1 = findViewById(R.id.imageView3_1);
        imageView3_2 = findViewById(R.id.imageView3_2);
        imageView3_3 = findViewById(R.id.imageView3_3);
        imageView3_4 = findViewById(R.id.imageView3_4);
        imageView3_5 = findViewById(R.id.imageView3_5);
        imageView3_6 = findViewById(R.id.imageView3_6);
        imageView4_0 = findViewById(R.id.imageView4_0);
        imageView4_1 = findViewById(R.id.imageView4_1);
        imageView4_2 = findViewById(R.id.imageView4_2);
        imageView4_3 = findViewById(R.id.imageView4_3);
        imageView4_4 = findViewById(R.id.imageView4_4);
        imageView4_5 = findViewById(R.id.imageView4_5);
        imageView4_6 = findViewById(R.id.imageView4_6);
        imageView5_0 = findViewById(R.id.imageView5_0);
        imageView5_1 = findViewById(R.id.imageView5_1);
        imageView5_2 = findViewById(R.id.imageView5_2);
        imageView5_3 = findViewById(R.id.imageView5_3);
        imageView5_4 = findViewById(R.id.imageView5_4);
        imageView5_5 = findViewById(R.id.imageView5_5);
        imageView5_6 = findViewById(R.id.imageView5_6);


        newGameButton = findViewById(R.id.newGameButton);
        //btnHome = findViewById(R.id.botonhome);
        txtInformacion = findViewById(R.id.txtInformacion);


        //Activa el metodo de Onclick implementado mas arriba
        imageView0_0.setOnClickListener(this);
        imageView0_1.setOnClickListener(this);
        imageView0_2.setOnClickListener(this);
        imageView0_3.setOnClickListener(this);
        imageView0_4.setOnClickListener(this);
        imageView0_5.setOnClickListener(this);
        imageView0_6.setOnClickListener(this);
        imageView1_0.setOnClickListener(this);
        imageView1_1.setOnClickListener(this);
        imageView1_2.setOnClickListener(this);
        imageView1_3.setOnClickListener(this);
        imageView1_4.setOnClickListener(this);
        imageView1_5.setOnClickListener(this);
        imageView1_6.setOnClickListener(this);
        imageView2_0.setOnClickListener(this);
        imageView2_1.setOnClickListener(this);
        imageView2_2.setOnClickListener(this);
        imageView2_3.setOnClickListener(this);
        imageView2_4.setOnClickListener(this);
        imageView2_5.setOnClickListener(this);
        imageView2_6.setOnClickListener(this);
        imageView3_0.setOnClickListener(this);
        imageView3_1.setOnClickListener(this);
        imageView3_2.setOnClickListener(this);
        imageView3_3.setOnClickListener(this);
        imageView3_4.setOnClickListener(this);
        imageView3_5.setOnClickListener(this);
        imageView3_6.setOnClickListener(this);
        imageView4_0.setOnClickListener(this);
        imageView4_1.setOnClickListener(this);
        imageView4_2.setOnClickListener(this);
        imageView4_3.setOnClickListener(this);
        imageView4_4.setOnClickListener(this);
        imageView4_5.setOnClickListener(this);
        imageView4_6.setOnClickListener(this);
        imageView5_0.setOnClickListener(this);
        imageView5_1.setOnClickListener(this);
        imageView5_2.setOnClickListener(this);
        imageView5_3.setOnClickListener(this);
        imageView5_4.setOnClickListener(this);
        imageView5_5.setOnClickListener(this);
        imageView5_6.setOnClickListener(this);
        newGameButton.setOnClickListener(this);
        //btnHome.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.boton);
        aplauso = MediaPlayer.create(this, R.raw.aplauso);
        boing = MediaPlayer.create(this,R.raw.boing);
        //Asigna cada imagen al array bidimensional de imagenes
        boardImagenes = new ImageView[][]{
                {imageView0_0, imageView0_1, imageView0_2, imageView0_3, imageView0_4, imageView0_5, imageView0_6},
                {imageView1_0, imageView1_1, imageView1_2, imageView1_3, imageView1_4, imageView1_5, imageView1_6},
                {imageView2_0, imageView2_1, imageView2_2, imageView2_3, imageView2_4, imageView2_5, imageView2_6},
                {imageView3_0, imageView3_1, imageView3_2, imageView3_3, imageView3_4, imageView3_5, imageView3_6},
                {imageView4_0, imageView4_1, imageView4_2, imageView4_3, imageView4_4, imageView4_5, imageView4_6},
                {imageView5_0, imageView5_1, imageView5_2, imageView5_3, imageView5_4, imageView5_5, imageView5_6}
        };

        //Reproduce la musica del juego
        reproducir = MediaPlayer.create(this, R.raw.jazz);
        reproducir.setLooping(true);
        reproducir.start();
    }


    protected void onStop() {
        super.onStop();
        reproducir.pause();

    }

    protected void onRestart() {
        super.onRestart();
        reproducir.start();


    }


    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.imageView0_0:
                column = 0;
                juego();
                break;

            case R.id.imageView0_1:
                column = 1;
                juego();
                break;

            case R.id.imageView0_2:
                column = 2;
                juego();
                break;
            case R.id.imageView0_3:
                column = 3;
                juego();
                break;
            case R.id.imageView0_4:
                column = 4;
                juego();
                break;

            case R.id.imageView0_5:
                column = 5;
                juego();
                break;

            case R.id.imageView0_6:
                column = 6;
                juego();
                break;
            case R.id.imageView1_0:
                column = 0;
                juego();
                break;

            case R.id.imageView1_1:
                column = 1;
                juego();
                break;

            case R.id.imageView1_2:
                column = 2;
                juego();
                break;
            case R.id.imageView1_3:
                column = 3;
                juego();
                break;
            case R.id.imageView1_4:
                column = 4;
                juego();
                break;

            case R.id.imageView1_5:
                column = 5;
                juego();
                break;
            case R.id.imageView1_6:
                column = 6;
                juego();
                break;
            case R.id.imageView2_0:
                column = 0;
                juego();
                break;

            case R.id.imageView2_1:
                column = 1;
                juego();
                break;

            case R.id.imageView2_2:
                column = 2;
                juego();
                break;

            case R.id.imageView2_3:
                column = 3;
                juego();
                break;

            case R.id.imageView2_4:
                column = 4;
                juego();
                break;

            case R.id.imageView2_5:
                column = 5;
                juego();
                break;

            case R.id.imageView2_6:
                column = 6;
                juego();
                break;

            case R.id.imageView3_0:
                column = 0;
                juego();
                break;

            case R.id.imageView3_1:
                column = 1;
                juego();
                break;

            case R.id.imageView3_2:
                column = 2;
                juego();
                break;

            case R.id.imageView3_3:
                column = 3;
                juego();
                break;

            case R.id.imageView3_4:
                column = 4;
                juego();
                break;

            case R.id.imageView3_5:
                column = 5;
                juego();
                break;

            case R.id.imageView3_6:
                column = 6;
                juego();
                break;

            case R.id.imageView4_0:
                column = 0;
                juego();
                break;

            case R.id.imageView4_1:
                column = 1;
                juego();
                break;

            case R.id.imageView4_2:
                column = 2;
                juego();
                break;

            case R.id.imageView4_3:
                column = 3;
                juego();
                break;

            case R.id.imageView4_4:
                column = 4;
                juego();
                break;

            case R.id.imageView4_5:
                column = 5;
                juego();
                break;

            case R.id.imageView4_6:
                column = 6;
                juego();
                break;

            case R.id.imageView5_0:
                column = 0;
                juego();
                break;

            case R.id.imageView5_1:
                column = 1;
                juego();
                break;

            case R.id.imageView5_2:
                column = 2;
                juego();
                break;

            case R.id.imageView5_3:
                column = 3;
                juego();
                break;

            case R.id.imageView5_4:
                column = 4;
                juego();
                break;

            case R.id.imageView5_5:
                column = 5;
                juego();
                break;

            case R.id.imageView5_6:
                column = 6;
                juego();
                break;

            case R.id.newGameButton:
                juegoNuevo();
                mp.start();
                break;

            /*
            case R.id.botonhome:
                Intent btnhome = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(btnhome);
                mp.start();
                break;
                */

            default:
                //o\  /
                //o \/
                break;
        }

    }


    //cambia las fichas de color
    public void juego() {

        Runnable changeColor = new Runnable() {
            @Override
            public void run() {

                if (totalMovimientos > 0 && !checkWinner(board)) {

                    if (turno) {
                        soltarRoja(board, column);

                        if (checkWinner(board)) {
                            new DialogRojo(contexto);
                            txtInformacion.setText(R.string.red_wins);

                            aplauso.start();


                        }

                    } else {
                        soltarAzul(board, column);
                        if (checkWinner(board)) {
                            new DialogAzul(contexto);
                            txtInformacion.setText(R.string.blue_wins);
                            aplauso.start();
                        }

                    }
                //Si ya no quedan movimientos muestra el mensaje if (totalMovimientos == 0) {
                    new DialogEmpate(contexto);
                    boing.start();//juegoNuevo();}
                }
            }
        };
        changeColor.run();
    }


    public void soltarRoja(int[][] board, int column) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][column] == 0) {
                mp.start();
                totalMovimientos--;
                writeTurnInTextBox(turno);
                turno = !turno;
                board[i][column] = 1;
                boardImagenes[i][column].setImageResource(R.drawable.ficha_roja);
                break;
            }
        }
    }

    public void soltarAzul(int[][] board, int column) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][column] == 0) {
                mp.start();
                totalMovimientos--;
                writeTurnInTextBox(turno);
                turno = !turno;
                board[i][column] = 2;
                boardImagenes[i][column].setImageResource(R.drawable.ficha_azul);
                break;
            }
        }
    }

    //El algoritmo del connect 4 en java es de:
    //http://www.javaproblems.com/2013/01/creating-connect-four-game-in-java.html
    public boolean checkWinner(int[][] board) {
        //Horizontal
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ((board[i][j] != 0)
                        && (board[i][j + 1] != 0)
                        && (board[i][j + 2] != 0)
                        && (board[i][j + 3] != 0)
                        && ((board[i][j] == board[i][j + 1])
                        && (board[i][j + 1] == board[i][j + 2])
                        && (board[i][j + 2] == board[i][j + 3])))
                    return true;
            }
        }
        //Vertical
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if ((board[j][i] != 0)
                        && (board[j + 1][i] != 0)
                        && (board[j + 2][i] != 0)
                        && (board[j + 3][i] != 0)
                        && ((board[j][i] == board[j + 1][i])
                        && (board[j + 1][i] == board[j + 2][i])
                        && (board[j + 2][i] == board[j + 3][i])))
                    return true;
            }
        }
        //Diagonal de izquierdaaa a derechaaa
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if ((board[i][j] != 0)
                        && (board[i + 1][j + 1] != 0)
                        && (board[i + 2][j + 2] != 0)
                        && (board[i + 3][j + 3] != 0)
                        && ((board[i][j] == board[i + 1][j + 1])
                        && (board[i + 1][j + 1] == board[i + 2][j + 2])
                        && (board[i + 2][j + 2] == board[i + 3][j + 3])))
                    return true;
            }
        }
        //Diagonal de derecha a izquierda
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if ((board[i][j] != 0)
                        && (board[i + 1][j - 1] != 0)
                        && (board[i + 2][j - 2] != 0)
                        && (board[i + 3][j - 3] != 0)
                        && ((board[i][j] == board[i + 1][j - 1])
                        && (board[i + 1][j - 1] == board[i + 2][j - 2])
                        && (board[i + 2][j - 2] == board[i + 3][j - 3])))
                    return true;
            }
        }
        return false;
    }

    public void writeTurnInTextBox(boolean turno) {

        if (!turno) {
            txtInformacion.setText(R.string.red_turn);
        } else {

            txtInformacion.setText(R.string.blue_turn);
        }

    }


    public void limpiarTablero() {

        Runnable resetear = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (board[i][j] != 0) {
                            board[i][j] = 0;
                            boardImagenes[i][j].setImageResource(0);
                        }
                    }
                }
            }
        };
        resetear.run();

    }

    public void juegoNuevo() {

        totalMovimientos = 42;
        limpiarTablero();
        turno = false;
        txtInformacion.setText(R.string.blue_turn);


    }


}




