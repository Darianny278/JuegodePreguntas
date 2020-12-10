package com.example.renglones;

import android.content.Context;
import android.content.Intent;

public class CineRenglon implements Renglones {
    @Override
    public void getClass(Context contexto) {
        Intent inten = new Intent("com.example.renglones.cine.Cine");
        contexto.startActivity(inten);
    }
}
