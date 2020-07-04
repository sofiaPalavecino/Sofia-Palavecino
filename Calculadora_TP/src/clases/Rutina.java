import java.util.ArrayList;
public class Rutina {
    private String nombre;
    private ArrayList<Instruccion> instrucciones;

    public Rutina(String nombre, ArrayList<Instruccion> instrucciones) {
        this.nombre = nombre;
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
