package clases;

public class Instruccion {
    private String operacion;
    private int valor;
    private String nombreVariable;

    public Instruccion(String operacion,int valor,String nombreVariable){
        this.operacion=operacion;
        this.valor=valor;
        this.nombreVariable=nombreVariable;
    }

    public String getOperacion() {
        return operacion;
    }

    public int getValor() {
        return valor;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNombreVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }
}
