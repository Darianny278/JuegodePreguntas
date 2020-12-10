package com.example.renglones;

import android.content.Context;
import android.content.Intent;

public class HistoriaRenglon implements Renglones {
    @Override
    public void getClass(Context contexto) {
        Intent inten = new Intent("com.example.renglones.Historia.Historia");
        contexto.startActivity(inten);
    }
}
