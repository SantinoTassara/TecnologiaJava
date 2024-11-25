package mains;

import utils.AlternadorDeStrings;

public class Main01 {
    public static void main(String[] args) {
        AlternadorDeStrings alternador = new AlternadorDeStrings();

        alternador.setPrimario("Bien");
        alternador.setSecundario("Mal");

        alternador.alternar();
        String valor = alternador.getActivo();

        System.out.println(valor);

        System.out.println("Hola");
    }
}
