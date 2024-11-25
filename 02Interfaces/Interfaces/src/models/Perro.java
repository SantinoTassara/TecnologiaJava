package models;

import interfaces.Pesable;

public class Perro implements Pesable {
    private String nombre;
    private double pesoEnkg;

    public Perro(String nombre, double peso) {
        super();
        this.nombre = nombre;
        this.pesoEnkg = peso;
    }

    // getters And Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoEnkg() {
        return pesoEnkg;
    }

    public void setPesoEnkg(double pesoEnkg) {
        this.pesoEnkg = pesoEnkg;
    }

    // Implementacion del metodo abstracto

    @Override
    public double getPesoEnGr() {
        return this.pesoEnkg * 1000;
    }

}
