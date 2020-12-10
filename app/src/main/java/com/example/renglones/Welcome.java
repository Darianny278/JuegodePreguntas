package com.example.renglones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.renglones.LogInRegister.LogIn;
import com.example.renglones.Practicar.QuizPracticar;

public class Welcome extends AppCompatActivity {


    Button btnJugar, btnPracticar;
    TextView txvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnJugar = (Button) findViewById(R.id.btnJugar);
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Welcome.this, ActivityBienvenida.class);
                startActivity(i);
            }
        });

        btnPracticar = (Button) findViewById(R.id.btnPracticar);
        btnPracticar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Welcome.this, QuizPracticar.class);
                startActivity(i);
            }
        });

        txvNombre = (TextView) findViewById(R.id.txtNombre);
        String nombre = getIntent().getStringExtra("textViewUsername");
        txvNombre.setText(nombre);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.opciones, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id== R.id.comoJugar){

            Intent itnt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SF95PjZNTXk"));
            startActivity(itnt);
        }

        else if(id == R.id.acercaDe) {
            Intent i = new Intent(this, acerca_de.class );
            startActivity(i);
        }

        else if(id == R.id.compartir) {

            CompartirApp();

        }
        else if(id == R.id.cerrarSesion) {

            Toast.makeText(this, "Gracias por jugar 'PEGASUS 5', vuelva pronto!", Toast.LENGTH_LONG).show();
            Cerrar_Sesion();

        }

        return super.onOptionsItemSelected(item);
    }


    private void CompartirApp(){
        try{
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
            String aux = "Descarga la app Pegasus 5 aqui\n";
            aux = aux + "https://fil.email/odPoALYy";
            intent.putExtra(Intent.EXTRA_TEXT, aux);
            startActivity(intent);
        }
        catch(Exception err){

        }
    }

    public void Cerrar_Sesion(){
        Intent intent = new Intent(Welcome.this, LogIn.class);
        startActivity(intent);
    }

}
