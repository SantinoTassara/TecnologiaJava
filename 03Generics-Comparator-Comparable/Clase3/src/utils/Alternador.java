package utils;

// A la clase Alternador le agrego un Generic
public class Alternador<T> {
    // como vemos los tipos de datos tanto en los metodos como en los atributos se
    // adaptan al generic

    // atributos
    private T primario;
    private T secundario;
    private boolean usarPrimario;

    // constructor
    public Alternador() {
        this.usarPrimario = true;
    }

    // metodos
    public T getActivo() {
        return usarPrimario ? primario : secundario;
    }

    public void alternar() {
        this.usarPrimario = !this.usarPrimario;
    }

    // getters y setters
    public T getPrimario() {
        return primario;
    }

    public void setPrimario(T primario) {
        this.primario = primario;
    }

    public T getSecundario() {
        return secundario;
    }

    public void setSecundario(T secundario) {
        this.secundario = secundario;
    }

}
