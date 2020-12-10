package com.example.renglones.Ruleta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.adefruandta.spinningwheel.SpinningWheelView;
import com.example.renglones.R;
import com.example.renglones.Welcome;


import java.util.Random;


public class Ruleta extends AppCompatActivity {
    public static int mQuestionNumber;

    private SpinningWheelView wheelView;
    private int spinRemain = 5;
    TextView textView;
    Button button;
    RelativeLayout rotate;

    private Button btnWithdrawRequest;
    private static final float FACTOR = 4.86f;
    int degree = 0,degree_old = 0;
    Random r;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruleta);

       // button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        rotate = findViewById(R.id.rotate);
        textView.setTextSize(24);
        r = new Random();
        wheelView = (SpinningWheelView) findViewById(R.id.wheel);
        img = (ImageView) findViewById(R.id.imgHome);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ruleta.this, Welcome.class);
                startActivity(intent);
            }
        });

initUI();

    }

    private void initUI() {
        wheelView = (SpinningWheelView) findViewById(R.id.wheel);
        rotate = (RelativeLayout) findViewById(R.id.rotate);
        // Can be array string or list of object
        wheelView.setItems(R.array.dummy2);
        wheelView.setEnabled(false);

        // Set listener for rotation event
        wheelView.setOnRotationListener(new SpinningWheelView.OnRotationListener<String>() {
            // Call once when start rotation
            @Override

            public void onRotation() {
                Log.d("XXXX", "On Rotation");



            }

            @Override

            public void onStopRotation(final String item) {

                //Toast.makeText(Ruleta.this, item, Toast.LENGTH_LONG).show();
                   textView.setText(item);
                if(item.equalsIgnoreCase("CINE")){
                    mQuestionNumber=0;
                    Intent i = new Intent(Ruleta.this, QuizRuleta.class);
                    startActivity(i);
                }
                else if (item.equalsIgnoreCase("CIENCIAS")){
                    mQuestionNumber=1;
                    Intent i = new Intent(Ruleta.this, QuizRuleta.class);
                    startActivity(i);
                }
                else if (item.equalsIgnoreCase("GEOGRAFIA")){
                    mQuestionNumber=2;
                    Intent i = new Intent(Ruleta.this, QuizRuleta.class);
                    startActivity(i);
                }
                else if (item.equalsIgnoreCase("DEPORTES")){
                    mQuestionNumber=3;
                    Intent i = new Intent(Ruleta.this, QuizRuleta.class);
                    startActivity(i);
                }
                else if (item.equalsIgnoreCase("HISTORIA")){
                    mQuestionNumber=4;
                    Intent i = new Intent(Ruleta.this, QuizRuleta.class);
                    startActivity(i);
                }


            }
        });


        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (spinRemain > 0) {
                    wheelView.rotate(50, generateRandom(2000, 3000), generateRandom(30, 60));
                } else {
                    Toast.makeText(Ruleta.this, "No Spin Remain. Check Tomorrow", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private int generateRandom(int min, int max) {

        return new Random().nextInt(max - min + 1) + min;
    }
}
