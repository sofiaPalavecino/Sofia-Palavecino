package clases;
import java.util.ArrayList;
import java.util.Scanner;
public class Programa {
    private ArrayList<Rutina> rutinas;

    public Programa(){
        this.rutinas=new ArrayList<>();
    }
    public Programa(ArrayList<Rutina>rutinas){
        this.rutinas=rutinas;
    }

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(ArrayList<Rutina> rutinas) {
        this.rutinas = rutinas;
    }
}
