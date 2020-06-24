package clases;
import java.util.ArrayList;
import java.util.Scanner;
public class Rutina {
    private String nombre;
    private ArrayList<Instruccion> instrucciones;

    public Rutina(String nombre){
        this.nombre=nombre;
        this.instrucciones=new ArrayList<>();
    }
    public Rutina(String nombre,ArrayList<Instruccion>instrucciones){
        this.nombre=nombre;
        this.instrucciones=instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstrucciones(ArrayList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
