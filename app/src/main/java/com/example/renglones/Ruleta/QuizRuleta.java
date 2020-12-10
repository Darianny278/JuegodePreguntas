package com.example.renglones.Ruleta;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renglones.Geografia.Geografia;
import com.example.renglones.Geografia.PreguntasGeografia;
import com.example.renglones.LogInRegister.DatabaseHelper;
import com.example.renglones.R;

public class QuizRuleta extends AppCompatActivity {

    private PreguntasRuleta mPreguntasRuleta = new PreguntasRuleta();


    private TextView mQuestionView, time;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    //private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruletaquestion);

        time = (TextView) findViewById(R.id.tiempo);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        Tiempo tm = new Tiempo(12000,1000);
        tm.start();
       final DatabaseHelper db= new DatabaseHelper(this);
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice1.getText() == mAnswer) {
                    try{
                        updateQuestion();

                        Toast.makeText(QuizRuleta.this, "correcta", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                        startActivity(i);
                    }
                    catch (Exception e){
                        Toast.makeText(QuizRuleta.this, "Error "+e, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(QuizRuleta.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                    startActivity(i);
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText() == mAnswer) {
                    try{

                        updateQuestion();

                        Toast.makeText(QuizRuleta.this, "correcta", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                        startActivity(i);}
                    catch (Exception e){
                        Toast.makeText(QuizRuleta.this, "Error "+e, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(QuizRuleta.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                    startActivity(i);
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText() == mAnswer) {
                    try{
                    updateQuestion();

                    Toast.makeText(QuizRuleta.this, "correcta", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                        startActivity(i);}
                    catch (Exception e){
                        Toast.makeText(QuizRuleta.this, "Error "+e, Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(QuizRuleta.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                    startActivity(i);
                }
            }
        });



    }

    private void updateQuestion() {
        try {
            //if (mQuestionNumber < 5) {
                mQuestionView.setText(mPreguntasRuleta.getQuestion(Ruleta.mQuestionNumber));
                mButtonChoice1.setText(mPreguntasRuleta.getChoice1(Ruleta.mQuestionNumber));
                mButtonChoice2.setText(mPreguntasRuleta.getChoice2(Ruleta.mQuestionNumber));
                mButtonChoice3.setText(mPreguntasRuleta.getChoice3(Ruleta.mQuestionNumber));

                mAnswer = mPreguntasRuleta.getCorrectAnswer(Ruleta.mQuestionNumber);
          //  Ruleta.mQuestionNumber++;
            /*} else {
                Intent i = new Intent(QuizRuleta.this, Geografia.class);
                startActivity(i);

            }*/
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
       /* private void updateScore ( int point) {
            try {
                Geografia.mScoreView.setText("" + Geografia.mScore);
            }catch (Exception e){
                Toast.makeText(this, "Error" + e, Toast.LENGTH_SHORT).show();
            }
        }*/

        public class Tiempo extends CountDownTimer {

            /**
             * @param millisInFuture    The number of millis in the future from the call
             *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
             *                          is called.
             * @param countDownInterval The interval along the way to receive
             *                          {@link #onTick(long)} callbacks.
             */
            public Tiempo(long millisInFuture, long countDownInterval) {
                super(millisInFuture, countDownInterval);
            }

            @Override
            public void onTick(long millisUntilFinished) {
                time.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(QuizRuleta.this, Ruleta.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext() , "Se ha acabado el tiempo", Toast.LENGTH_LONG);
                toast.show();

            }
        }



    }

