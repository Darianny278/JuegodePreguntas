package com.example.renglones.LogInRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.renglones.R;
import com.example.renglones.Welcome;

public class LogIn extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    TextView textViewRegister;
    DatabaseHelper db;

    @SuppressLint("CutPasteId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        db = new DatabaseHelper(this);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        textViewRegister = findViewById(R.id.textViewRegister);
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogIn.this, RegisterActivity.class));
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();


                Boolean res = db.checkUser(email, password);
                User user = new User();
                Log.d("IDdetails", String.valueOf(user.getId()));

                try {
                    if (res == true) {
                        //Toast.makeText(LogIn.this, "Log in correcto", Toast.LENGTH_SHORT).show();
                        Intent HomePage = new Intent(LogIn.this, Welcome.class);

                        Bundle b = new Bundle();
                    b.putString("textViewEmail", editTextEmail.getText().toString());
                    b.putString("textViewPassword", editTextPassword.getText().toString());

                    String y = db.selectOneUserSendUserName(email, password);
                    int x = db.selectOneUserSendId(email,password);
                    Log.d("TAG" , "ID =  " + x);

                    b.putString("textViewUsername",y);
                    b.putString("textViewId", String.valueOf(x));

                         HomePage.putExtras(b);
                        startActivity(HomePage);
                    } else {
                        Toast.makeText(LogIn.this, "Login Error", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    Toast.makeText(LogIn.this, "Error:" + e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
