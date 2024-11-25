package mains;

import models.Gato;
import utils.AlternadorMagico;

public class Main02 {
    public static void main(String[] args) {
        // -------- Instancio el AlternadorMagico --------//
        AlternadorMagico alternador = new AlternadorMagico();

        // -------- Le seteo coomo primero un Objeto de tipo Perro --------//
        alternador.setPrimario(new Gato("Pepin", 10));

        // -------- Le seteo como segundo el mismo objeto de tipo AlternadorMagico
        // -------- //
        alternador.setSecundario(alternador);

        // -------- Creo una ruleta donde me va a alternar entre los dos objetos de
        // forma random -------- //
        int numero = (int) (Math.random() * 10);

        for (int i = 0; i < numero; i++) {
            alternador.alternar();
        }

        // -------- Una vez que terminó la ruleta, QUIERO obtener un <Gato> -------- //
        Gato g = (Gato) alternador.getActivo();

        // -------- Quiero imprimir el nombre -------- //
        System.out.println(g.getNombre()); // Va a saltar error
    }
}
