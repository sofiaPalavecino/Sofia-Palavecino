package clases;

public class DatoAlmacenado {
    private String nombreDato;
    private int valorDato;

    public DatoAlmacenado(int valorDato,String nombreDato){
        this.nombreDato=nombreDato;
        this.valorDato=valorDato;
    }

    public String getNombreDato() {
        return nombreDato;
    }

    public int getValorDato() {
        return valorDato;
    }

    public void setNombreDato(String nombreDato) {
        this.nombreDato = nombreDato;
    }

    public void setValorDato(int valorDato) {
        this.valorDato = valorDato;
    }
}

