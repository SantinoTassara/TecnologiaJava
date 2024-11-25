package utils;

public class AlternadorDeStrings {
    // Atributos
    private String primario;
    private String secundario;
    private boolean usarPrimario;

    // Constructor
    public AlternadorDeStrings() {
        this.usarPrimario = true;
    }

    // Metodos
    public String getActivo() {
        return usarPrimario ? primario : secundario;
    }

    public void alternar() {
        this.usarPrimario = !this.usarPrimario;
    }

    // getters and setters

    public String getPrimario() {
        return primario;
    }

    public void setPrimario(String primario) {
        this.primario = primario;
    }

    public String getSecundario() {
        return secundario;
    }

    public void setSecundario(String secundario) {
        this.secundario = secundario;
    }

}
