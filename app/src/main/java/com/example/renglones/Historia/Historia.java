package com.example.renglones.Historia;

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

public class Historia extends AppCompatActivity {
  Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
  ImageView img;
    public static TextView mScoreView;

    private int activarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
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
        img=(ImageView)findViewById(R.id.imageView);
        try {
            Bundle parametros = this.getIntent().getExtras();
            String datos = parametros.getString("Puntaje");
            mScoreView.setText(datos);
        }catch (Exception e){
            //Toast.makeText(this, "Error "+ e, Toast.LENGTH_LONG).show();
        }
        String textView= mScoreView.getText().toString();
        activarButton= Integer.parseInt(textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Historia.this, QuizHistoria1.class);
                startActivity(i);
            }
        });
        if(!(activarButton>4)){
            btn2.setEnabled(false);
            btn2.setTextColor(Color.parseColor("#9E9E9E"));}
        else {
            btn2.setEnabled(true);

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Historia.this, QuizHistoria2.class);
                    startActivity(i);
                }
            });}
            if (!(activarButton > 8)) {
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#9E9E9E"));
            } else {
                btn3.setEnabled(true);
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Historia.this, QuizHistoria3.class);
                        startActivity(i);
                    }
                });}
                if (!(activarButton > 12)) {
                    btn4.setEnabled(false);
                    btn4.setTextColor(Color.parseColor("#9E9E9E"));
                } else {
                    btn4.setEnabled(true);

                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, QuizHistoria4.class);
                            startActivity(i);
                        }
                    });}
                    if(!(activarButton>16)){
                        btn5.setEnabled(false);
                        btn5.setTextColor(Color.parseColor("#9E9E9E"));}

                    else{
                        btn5.setEnabled(true);
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, QuizHistoria5.class);
                            startActivity(i);
                        }
                    });}
                        if(!(activarButton>20)){
                            btn6.setEnabled(false);
                            btn6.setTextColor(Color.parseColor("#9E9E9E"));}
                        else{
                            btn6.setEnabled(true);
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, QuizHistoria6.class);
                            startActivity(i);
                        }
                    });}
                            if(!(activarButton>24)){
                                btn7.setEnabled(false);
                                btn7.setTextColor(Color.parseColor("#9E9E9E"));}
                            else{
                                btn7.setEnabled(true);
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, QuizHistoria7.class);
                            startActivity(i);
                        }
                    });}
                                if(!(activarButton>28)){
                                    btn8.setEnabled(false);
                                    btn8.setTextColor(Color.parseColor("#9E9E9E"));}
                                else{
                                    btn8.setEnabled(true);
                    btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, QuizHistoria8.class);
                            startActivity(i);
                        }
                    });}
                                    if(!(activarButton>32)){
                                        btn9.setEnabled(false);
                                        btn9.setTextColor(Color.parseColor("#9E9E9E"));}
                                    else{
                                        btn9.setEnabled(true);
                    btn9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, QuizHistoria9.class);
                            startActivity(i);
                        }
                    });}
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Historia.this, ActivityBienvenida.class);
                            startActivity(i);

                        }
                    });


                }
            }


