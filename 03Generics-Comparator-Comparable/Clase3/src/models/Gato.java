package models;

public class Gato {
    // atributos
    private String nombre;
    private double pesoEnKg;

    // constructor
    public Gato(String nombre, double pesoEnKg) {
        super();
        this.nombre = nombre;
        this.pesoEnKg = pesoEnKg;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoEnKg() {
        return pesoEnKg;
    }

    public void setPesoEnKg(double pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }

}
