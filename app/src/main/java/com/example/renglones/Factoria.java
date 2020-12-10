package com.example.renglones;

public class Factoria {
    public Renglones ObtenerRenglon(String renglon) {

        if (renglon.equalsIgnoreCase("Geografia")) {
            return new GeografiaRenglon();
        }
        else if(renglon.equalsIgnoreCase("Deportes")){
            return new DeportesRenglon();
        }
        else if(renglon.equalsIgnoreCase("Historia")) {
            return new HistoriaRenglon();
        }
        else if(renglon.equalsIgnoreCase("Cine")) {
            return new CineRenglon();
        }
        else if(renglon.equalsIgnoreCase("Ciencia")) {
            return new CienciaRenglon();
        }
        else if(renglon.equalsIgnoreCase("Modo Clasico")) {
            return new ModoClasicoRenglon();
        }
        return null;
    }
}
