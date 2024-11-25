package interfaces;

public interface Pesable {
    // metodo abstracto
    public double getPesoEnGr();

    // metodos concretos
    public default double getPesoEnkg() {
        return this.getPesoEnGr() / 1000;
    }

    public default double getPesoEnMg() {
        return this.getPesoEnGr() * 1000;
    }
}
