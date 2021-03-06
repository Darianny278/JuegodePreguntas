package com.example.renglones.Ciencia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.renglones.R;

public class QuizCiencia5 extends AppCompatActivity {

    private PreguntasCiencia mPreguntasCiencia = new PreguntasCiencia();


    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    TextView time;
    private String mAnswer;
    private int puntaje;
    private int puntos = 0;
    private int mQuestionNumber = 20;
    CountDownTimer cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_ciencia5);


        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        time = (TextView) findViewById(R.id.tiempo);
        String valor = Ciencia.mScoreView.getText().toString();
        puntaje= Integer.parseInt(valor);

       // Tiempo tm = new Tiempo(50000,1000);
        //tm.start();
        cm = new CountDownTimer(50000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time.setText(millisUntilFinished/1000 + "");
            }

            @Override
            public void onFinish() {
                if(mQuestionNumber==25 ){
                    cm.cancel();
                }else {
                        AlertTimeOff();

                }
            }
        };

        cm.start();
        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice1.getText() == mAnswer) {
                    puntaje=puntaje+1;
                    puntos = puntos + 1;
                    updateQuestion();



                } else {

                    updateQuestion();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText() == mAnswer) {
                    puntaje=puntaje+1;
                    puntos = puntos + 1;
                    updateQuestion();



                } else {

                    updateQuestion();
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText() == mAnswer) {
                    puntaje=puntaje+1;
                    puntos = puntos + 1;
                    updateQuestion();


                } else {

                    updateQuestion();
                }
            }
        });



    }

    private void updateQuestion() {
        try {
            if (mQuestionNumber < 25) {
                mQuestionView.setText(mPreguntasCiencia.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(mPreguntasCiencia.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(mPreguntasCiencia.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(mPreguntasCiencia.getChoice3(mQuestionNumber));

                mAnswer = mPreguntasCiencia.getCorrectAnswer(mQuestionNumber);
                mQuestionNumber++;
            } else {
                if (puntos > 4) {
                    cm.cancel();
                    AlertGano();
                } else {
                    cm.cancel();
                    AlertPerdio();
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void AlertGano() {
        CharSequence[] texto = {"Felicidades, pasaste de nivel"};
        AlertDialog.Builder alerta = new AlertDialog.Builder(QuizCiencia5.this);
        alerta.setTitle("En hora buena!!!");
        alerta.setItems(texto, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Bundle bundle = new Bundle();
                String values = String.valueOf(puntaje);
                bundle.putString("Puntaje", values);
                Intent i = new Intent(QuizCiencia5.this, Ciencia.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        alerta.show();


    }

    private void AlertPerdio() {
        CharSequence[] texto = {"Intentalo de nuevo, Suerte!!!"};
        AlertDialog.Builder alerta = new AlertDialog.Builder(QuizCiencia5.this);
        alerta.setTitle("Oh, sorry!!!");
        alerta.setItems(texto, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent i = new Intent(QuizCiencia5.this, Ciencia.class);
                startActivity(i);
            }
        });
        alerta.show();


    }

    private void AlertTimeOff() {
        CharSequence[] texto = {"Se ha agotado el tiempo, Intentalo de nuevo, Suerte!!!"};
        AlertDialog.Builder alerta = new AlertDialog.Builder(QuizCiencia5.this);
        alerta.setTitle("Oh, Time Off!!!");
        alerta.setItems(texto, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent i = new Intent(QuizCiencia5.this, Ciencia.class);
                startActivity(i);
            }
        });
        alerta.show();


    }
    }



