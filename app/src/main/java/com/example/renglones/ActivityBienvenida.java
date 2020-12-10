package com.example.renglones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.renglones.Ciencia.Ciencia;
import com.example.renglones.Geografia.Geografia;
import com.example.renglones.Historia.Historia;
import com.example.renglones.cine.Cine;
import com.example.renglones.deportes.Deportes;

public class ActivityBienvenida extends AppCompatActivity {

    Button btnModoClasico, btnCine, btnDeportes, btnCiencia, btnHistoria, btnGeografia;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        btnModoClasico = (Button) findViewById(R.id.btnModoClasico);
        btnCine = (Button) findViewById(R.id.btnCine);
        btnDeportes = (Button) findViewById(R.id.btnDeportes);
        btnCiencia = (Button) findViewById(R.id.btnCiencia);
        btnHistoria = (Button) findViewById(R.id.btnHistoria);
        btnGeografia = (Button) findViewById(R.id.btnGeografia);
        img=findViewById(R.id.imageView);

        btnModoClasico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factoria fa = new Factoria();
                ModoClasicoRenglon modoClasicoRenglon = (com.example.renglones.ModoClasicoRenglon) fa.ObtenerRenglon(btnModoClasico.getText().toString());
                modoClasicoRenglon.getClass(ActivityBienvenida.this);
            }
        });

        btnCine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factoria fa = new Factoria();
                CineRenglon cine = (com.example.renglones.CineRenglon) fa.ObtenerRenglon(btnCine.getText().toString());
                cine.getClass(ActivityBienvenida.this);
            }
        });
        btnDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factoria fa = new Factoria();
                DeportesRenglon deportes = (com.example.renglones.DeportesRenglon) fa.ObtenerRenglon(btnDeportes.getText().toString());
                deportes.getClass(ActivityBienvenida.this);
            }
        });
        btnCiencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factoria fa = new Factoria();
                CienciaRenglon ciencia = (com.example.renglones.CienciaRenglon) fa.ObtenerRenglon(btnCiencia.getText().toString());
                ciencia.getClass(ActivityBienvenida.this);
            }
        });
        btnHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factoria fa = new Factoria();
                HistoriaRenglon historia = (com.example.renglones.HistoriaRenglon) fa.ObtenerRenglon(btnHistoria.getText().toString());
                historia.getClass(ActivityBienvenida.this);
            }
        });
        btnGeografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factoria fa = new Factoria();
                GeografiaRenglon geografia = (com.example.renglones.GeografiaRenglon) fa.ObtenerRenglon(btnGeografia.getText().toString());
                geografia.getClass(ActivityBienvenida.this);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityBienvenida.this, Welcome.class);
                startActivity(i);
            }
        });

    }
}
