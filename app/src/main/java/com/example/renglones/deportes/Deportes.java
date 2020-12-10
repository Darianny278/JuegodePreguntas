package com.example.renglones.deportes;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renglones.ActivityBienvenida;
import com.example.renglones.Geografia.Geografia;
import com.example.renglones.R;
import com.example.renglones.cine.Cine;
import com.example.renglones.cine.QuizCine1;
import com.example.renglones.cine.QuizCine2;
import com.example.renglones.cine.QuizCine3;
import com.example.renglones.cine.QuizCine4;
import com.example.renglones.cine.QuizCine5;
import com.example.renglones.cine.QuizCine6;
import com.example.renglones.cine.QuizCine7;
import com.example.renglones.cine.QuizCine8;
import com.example.renglones.cine.QuizCine9;

public class Deportes extends AppCompatActivity {
  Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
  ImageView img;
  public static TextView mScoreView;
private int puntajevalor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);
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
                Intent i = new Intent(Deportes.this, QuizDeporte1.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte2.class);
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

                    Intent i = new Intent(Deportes.this, QuizDeporte3.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte4.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte5.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte6.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte7.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte8.class);
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
                    Intent i = new Intent(Deportes.this, QuizDeporte9.class);
                    startActivity(i);
                }
            });
        }

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Deportes.this, ActivityBienvenida.class);
                startActivity(i);

            }
        });

    }
}
