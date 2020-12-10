package com.example.renglones;

import android.content.Context;
import android.content.Intent;

public class GeografiaRenglon implements Renglones {
    @Override
    public void getClass(Context contexto) {
        Intent inten = new Intent("com.example.renglones.Geografia.Geografia");
        contexto.startActivity(inten);
    }
}
