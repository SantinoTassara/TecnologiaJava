package mains;

import utils.Alternador;
import utils.Comunicador;
import utils.ComunicadorMayus;
import utils.ComunicadorMinus;

public class Main03 {
    public static void main(String[] args) {

        Alternador<Comunicador> alter = new Alternador<Comunicador>();

        alter.setPrimario(new ComunicadorMayus());
        alter.setSecundario(new ComunicadorMinus());

        while (true) {
            alter.getActivo().enviar("Hola");
            String op = alter.getActivo().recibir();
            if (op.equals("1")) {
                alter.getActivo().enviar("Que tal?");
            } else if (op.equals("2")) {
                alter.alternar();
            } else {
                alter.getActivo().enviar("Opcion invalida");
            }

        }

    }
}
