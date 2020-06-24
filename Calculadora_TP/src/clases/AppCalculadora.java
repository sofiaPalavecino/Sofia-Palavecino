package clases;
import java.util.ArrayList;
import java.util.Scanner;
public class AppCalculadora {
    private Programa programa;
    private ArrayList<Integer> pilaDeValores;
    private ArrayList<DatoAlmacenado> memoria;

    public AppCalculadora(Programa programa,ArrayList<Integer>pilaDeValores,ArrayList<DatoAlmacenado>memoria){
        this.programa=programa;
        this.pilaDeValores=pilaDeValores;
        this.memoria=memoria;
    }
    public AppCalculadora(Programa programa){
        this.programa=programa;
        this.pilaDeValores=new ArrayList<>();
        this.memoria=new ArrayList<>();
    }

    public Programa getPrograma() {
        return programa;
    }

    public ArrayList<Integer> getPilaDeValores() {
        return pilaDeValores;
    }

    public ArrayList<DatoAlmacenado> getMemoria() {
        return memoria;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public void setPilaDeValores(ArrayList<Integer> pilaDeValores) {
        this.pilaDeValores = pilaDeValores;
    }

    public void setMemoria(ArrayList<DatoAlmacenado> memoria) {
        this.memoria = memoria;
    }

    public void push(int val){
        pilaDeValores.add(val);
    }
    public void add(){
        if (pilaDeValores.size() == 0){
            pilaDeValores.add(0);
        }
        else if(pilaDeValores.size()>1){
            int valA = pilaDeValores.get(0);
            int valB = pilaDeValores.get(1);
            valA = valA + valB;
            pilaDeValores.add(valA);
        }
    }
    public void sub(){
        if (pilaDeValores.size() == 0){
            pilaDeValores.add(0);
        }
        else if(pilaDeValores.size()>1){
            int valA = pilaDeValores.get(0);
            int valB = pilaDeValores.get(1);
            valA = valB - valA;
            pilaDeValores.add(valA);
        }
    }
    public void mul(){
        if (pilaDeValores.size() == 0){
            pilaDeValores.add(0);
        }
        else if(pilaDeValores.size()>1){
            int valA = pilaDeValores.get(0);
            int valB = pilaDeValores.get(1);
            valA = valB * valA;
            pilaDeValores.add(valA);
        }
    }
    public void write(String variable){
        if (pilaDeValores.size() == 0){
            DatoAlmacenado dato = new DatoAlmacenado(0,variable);
            memoria.add(dato);
        }
        else{
            int valor = pilaDeValores.get(0);
            DatoAlmacenado dato = new DatoAlmacenado(valor,variable);
            memoria.add(dato);
        }
    }
    public void read(String variable){
        for(DatoAlmacenado dato:memoria){
            if(dato.getNombreDato()==variable){
                if(dato.getNombreDato()==null){
                    dato.setValorDato(0);
                }
                pilaDeValores.add(dato.getValorDato());
            }
        }
    }
}
