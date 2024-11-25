package utils;

import interfaces.Pesable;

public class Balanza {
    public Pesable getMasPesado(Pesable pesable1, Pesable pesable2) {
        // Obtengo los pesos de los pesables
        double peso1 = pesable1.getPesoEnkg();
        double peso2 = pesable2.getPesoEnkg();

        return peso1 > peso2 ? pesable1 : pesable2;
    }
}
