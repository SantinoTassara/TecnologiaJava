package utils;

public class AlternadorMagico {
    // atributos
    private Object primario;
    private Object secundario;
    private boolean usarPrimario;

    // constructor
    public AlternadorMagico() {
        this.usarPrimario = true;
    }

    // metodos
    public Object getActivo() {
        return usarPrimario ? primario : secundario;
    }

    public void alternar() {
        this.usarPrimario = !this.usarPrimario;
    }

    // getters y setters
    public Object getPrimario() {
        return primario;
    }

    public void setPrimario(Object primario) {
        this.primario = primario;
    }

    public Object getSecundario() {
        return secundario;
    }

    public void setSecundario(Object secundario) {
        this.secundario = secundario;
    }

}
