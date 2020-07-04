package clases;

public class DatoAlmacenado {
    private String nombreValor;
    private int numeroValor;

    public DatoAlmacenado(int numeroValor, String nombreValor) {
        this.nombreValor = nombreValor;
        this.numeroValor = numeroValor;
    }
    public String getNombreValor() {
        return nombreValor;
    }

    public void setNombreValor(String nombreValor) {
        this.nombreValor = nombreValor;
    }

    public int getNumeroValor() {
        return numeroValor;
    }

    public void setNumeroValor(int numeroValor) {
        this.numeroValor = numeroValor;
    }

    public int MetodoParaRead(String nombre){
        if(nombre == nombreValor){
            return numeroValor;
        }
        else{
            return 0;
        }
    }
}
