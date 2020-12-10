package com.example.renglones.Ciencia;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renglones.ActivityBienvenida;
import com.example.renglones.R;
import com.example.renglones.deportes.Deportes;
import com.example.renglones.deportes.QuizDeporte1;
import com.example.renglones.deportes.QuizDeporte2;
import com.example.renglones.deportes.QuizDeporte3;
import com.example.renglones.deportes.QuizDeporte4;
import com.example.renglones.deportes.QuizDeporte5;
import com.example.renglones.deportes.QuizDeporte6;
import com.example.renglones.deportes.QuizDeporte7;
import com.example.renglones.deportes.QuizDeporte8;
import com.example.renglones.deportes.QuizDeporte9;

public class Ciencia extends AppCompatActivity {
  Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    public static TextView mScoreView;
    private int puntajevalor;
  ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciencia);
       mScoreView=(TextView) findViewById(R.id.score);
        btn1= (Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        img=findViewById(R.id.imageView);

        try {
            Bundle parametros = this.getIntent().getExtras();
            String datos = parametros.getString("Puntaje");
            mScoreView.setText(datos);
        }catch (Exception e){
            //Toast.makeText(this, "Error "+ e, Toast.LENGTH_LONG).show();
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ciencia.this, QuizCiencia1.class);
                startActivity(i);
            }
        });
        puntajevalor=Integer.parseInt(mScoreView.getText().toString());
        if(!(puntajevalor>4)){
            btn2.setEnabled(false);
            btn2.setTextColor(Color.parseColor("#9E9E9E"));
        }else{

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia2.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>8)){
            btn3.setEnabled(false);
            btn3.setTextColor(Color.parseColor("#9E9E9E"));
        }else{

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(Ciencia.this, QuizCiencia3.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>12)){
            btn4.setEnabled(false);
            btn4.setTextColor(Color.parseColor("#9E9E9E"));
        }else{

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia4.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>16)){
            btn5.setEnabled(false);
            btn5.setTextColor(Color.parseColor("#9E9E9E"));
        }else{

            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia5.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>20)){
            btn6.setEnabled(false);
            btn6.setTextColor(Color.parseColor("#9E9E9E"));
        }else{
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia6.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>24)){
            btn7.setEnabled(false);
            btn7.setTextColor(Color.parseColor("#9E9E9E"));
        }else{

            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia7.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>28)){
            btn8.setEnabled(false);
            btn8.setTextColor(Color.parseColor("#9E9E9E"));
        }else{

            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia8.class);
                    startActivity(i);
                }
            });}
        if(!(puntajevalor>32)){
            btn9.setEnabled(false);
            btn9.setTextColor(Color.parseColor("#9E9E9E"));
        }else {

            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Ciencia.this, QuizCiencia9.class);
                    startActivity(i);
                }
            });
        }

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ciencia.this, ActivityBienvenida.class);
                startActivity(i);

            }
        });


    }


    }
