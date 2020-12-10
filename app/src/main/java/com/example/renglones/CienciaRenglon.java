package com.example.renglones;

import android.content.Context;
import android.content.Intent;

public class CienciaRenglon implements Renglones {
    @Override
    public void getClass(Context contexto) {
        Intent inten = new Intent("com.example.renglones.Ciencia.Ciencia");
        contexto.startActivity(inten);
    }
}
