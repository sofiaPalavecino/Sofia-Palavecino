import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Programa {
    private HashSet<Rutina> rutinas;

    public Programa(HashSet<Rutina> rutinas) {
        this.rutinas = rutinas;
    }

    public HashSet<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(HashSet<Rutina> rutinas) {
        this.rutinas = rutinas;
    }

    public void AgregarInstruccion(String nombre, Instruccion instruction){
        ArrayList<Instruccion> instrucciones = new ArrayList<Instruccion>();
        instrucciones.add(instruction);
        Rutina newRut = new Rutina(nombre,instrucciones);
        HashSet<Rutina> rutinas = new HashSet<Rutina>();
        rutinas.add(newRut);
        setRutinas(rutinas);
    }
    public ArrayList<Rutina> getRutinaPorNombre(String nombre){
        ArrayList<Rutina> ruts = new ArrayList<Rutina>();
        for (Rutina i : rutinas){
            if (i.getNombre() == nombre){
                ruts.add(i);
            }
        }
        return ruts;
    }
}
