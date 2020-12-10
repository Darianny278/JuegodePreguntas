package com.example.renglones.Practicar;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renglones.LogInRegister.DatabaseHelper;
import com.example.renglones.R;
import com.example.renglones.Ruleta.PreguntasRuleta;
import com.example.renglones.Ruleta.Ruleta;
import com.example.renglones.Welcome;

import java.util.Random;

public class QuizPracticar extends AppCompatActivity {

    private PreguntasPracticar mPreguntasPracticar = new PreguntasPracticar();


    private TextView mQuestionView, time;
    private Button mButtonChoice1, volver;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mQuestionNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicar_question);

        time = (TextView) findViewById(R.id.tiempo);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        volver = (Button) findViewById(R.id.volver);

        updateQuestion();
        mQuestionNumber= NumeroAleatorio(27);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuizPracticar.this, Welcome.class);
                startActivity(i);
            }
        });

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice1.getText() == mAnswer) {
                    try{
                        updateQuestion();

                        Toast.makeText(QuizPracticar.this, "correcta", Toast.LENGTH_SHORT).show();

                    }
                    catch (Exception e){
                        Toast.makeText(QuizPracticar.this, "Error "+e, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    updateQuestion();
                    Toast.makeText(QuizPracticar.this, "Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText() == mAnswer) {
                    try{

                        updateQuestion();

                        Toast.makeText(QuizPracticar.this, "correcta", Toast.LENGTH_SHORT).show();
                        }
                    catch (Exception e){
                        Toast.makeText(QuizPracticar.this, "Error "+e, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    updateQuestion();
                    Toast.makeText(QuizPracticar.this, "Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText() == mAnswer) {
                    try{
                    updateQuestion();

                    Toast.makeText(QuizPracticar.this, "correcta", Toast.LENGTH_SHORT).show();
                      }
                    catch (Exception e){
                        Toast.makeText(QuizPracticar.this, "Error "+e, Toast.LENGTH_SHORT).show();
                    }

                } else {
                    updateQuestion();
                    Toast.makeText(QuizPracticar.this, "Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }
        });



    }

    private void updateQuestion() {
        try {

                mQuestionView.setText(mPreguntasPracticar.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(mPreguntasPracticar.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(mPreguntasPracticar.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(mPreguntasPracticar.getChoice3(mQuestionNumber));

                mAnswer = mPreguntasPracticar.getCorrectAnswer(mQuestionNumber);
                mQuestionNumber = NumeroAleatorio(27);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private int NumeroAleatorio(int max){

        Random random= new Random();
        random.setSeed(System.currentTimeMillis());
        int numero= random.nextInt(max);

        return numero;
    }


    }

