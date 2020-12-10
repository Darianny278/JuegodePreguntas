package com.example.renglones;

import android.content.Context;
import android.content.Intent;

public class DeportesRenglon implements Renglones {
    @Override
    public void getClass(Context contexto) {
        Intent inten = new Intent("com.example.renglones.deportes.Deportes");
        contexto.startActivity(inten);

    }
}
