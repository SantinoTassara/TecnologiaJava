package Mains;

import java.util.function.Predicate;

import interfaces.Pesable;

public class Main01_LAMBDA {
    public static void main(String[] args) {

        Pesable pesable1 = new Pesable() {
            @Override
            public double getPesoEnGr() {
                return 1874;
            }
        };

        // ----- Creamos otra clase anonima con la interfaz Pesable pero usando la
        // funcion lambda ----- //
        Pesable pesableLambda = () -> 1453;

        System.out.println(pesableLambda.getPesoEnGr());

        // ----- Creamos una clase anonima con la interfaz Predicate ----- //

        Predicate<Integer> esPar = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        };

        // ----- Creamos otra clase anonima con la interfaz Predicate usando la funcion
        // lambda ----- //
        Predicate<Integer> esParLamda = (Integer i) -> {
            return i % 2 == 0;
        };

        // ----- Creamos otra clase anonima simplificando mas la funcion lambda ----- //
        Predicate<Integer> esParLambaClean = (Integer i) -> i % 2 == 0;

        // ----- Creamos otra clase anonima simplificando lo maximo posible la funcion
        // lambda ----- //
        Predicate<Integer> esParPerfecta = i -> i % 2 == 0;

        // La funcion negate() devuelve el valor booleano invertido.
        System.out.println(esParPerfecta.negate());
    }
}
