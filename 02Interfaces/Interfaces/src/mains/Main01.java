package mains;

import interfaces.Pesable;
import models.BotellaDeAgua;
import models.Perro;
import utils.Balanza;

public class Main01 {
    public static void main(String[] args) {
        Pesable pesable_1 = new Perro("Pippo", 5);

        System.out.println(pesable_1.getPesoEnkg());
        System.out.println(pesable_1.getPesoEnGr());
        System.out.println(pesable_1.getPesoEnMg());

        Pesable pesable_2 = new BotellaDeAgua(20);

        System.out.println(pesable_2.getPesoEnkg());
        System.out.println(pesable_2.getPesoEnGr());
        System.out.println(pesable_2.getPesoEnMg());

        Balanza bal = new Balanza();

        Pesable masPesado = bal.getMasPesado(pesable_1, pesable_2);
        System.out.println("Mas pesado: " + masPesado.getPesoEnkg());
    }
}
