package models;

import javax.swing.*;

public class Impresora {
    private int cantidadImpresiones;
    private static Impresora instance;

    private Impresora() {
        this.cantidadImpresiones = 0;
    }

    public void imprimir(String impresor, String message) {
        this.cantidadImpresiones++;
        System.out.println(
                impresor + " está imprimiendo:\n"
                        + "Impresion: " + message + ". \n"
                        + "Cantidad de impresiones:  " + this.cantidadImpresiones);
    }

    public static Impresora getInstance() {
        if (instance == null) {
            instance = new Impresora();
        }
        return instance;
    }

}
