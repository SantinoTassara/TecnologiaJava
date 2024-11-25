package models;

import interfaces.Pesable;

public class BotellaDeAgua implements Pesable {

    private double cantLitros;

    public BotellaDeAgua(double cantLitros) {
        super();
        this.cantLitros = cantLitros;
    }

    public double getCantLitros() {
        return cantLitros;
    }

    public void setCantLitros(double cantLitros) {
        this.cantLitros = cantLitros;
    }

    @Override
    public double getPesoEnGr() {
        return this.cantLitros * 1000 + 20;
    }
}
