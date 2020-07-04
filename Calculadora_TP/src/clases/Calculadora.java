package clases;

import java.util.ArrayList;
import java.util.HashSet;
public class Calculadora {
    private Programa programa;
    private ArrayList<Integer> pilaDeValores;
    private ArrayList<DatoAlmacenado> memoria;

    public Calculadora(Programa programa, ArrayList<Integer> pilaDeValores, ArrayList<DatoAlmacenado> memoria) {
        this.programa = programa;
        this.pilaDeValores = pilaDeValores;
        this.memoria = memoria;
    }

    public Programa getPrograma() { return programa; }
    public void setPrograma(Programa programa) { this.programa = programa; }

    public ArrayList<Integer> getPilaDeValores() { return pilaDeValores; }
    public void setPilaDeValores(ArrayList<Integer> pilaDeValores) { this.pilaDeValores = pilaDeValores; }

    public ArrayList<DatoAlmacenado> getMemoria() { return memoria; }
    public void setMemoria(ArrayList<DatoAlmacenado> memoria) { this.memoria = memoria; }

    public void push(int val){
        pilaDeValores.add(val);
    }
    public void add(){
        if (pilaDeValores.size() == 0){
            pilaDeValores.add(0);
        }
        else if (pilaDeValores.size() == 1){
            int val = pilaDeValores.get(0);
            pilaDeValores.add(val);
        }
        else{
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
        else if (pilaDeValores.size() == 1){
            int val = pilaDeValores.get(0);
            pilaDeValores.add(val);
        }
        else{
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
        else if (pilaDeValores.size() == 1){
            int val = pilaDeValores.get(0);
            pilaDeValores.add(val);
        }
        else{
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
            if(dato.getNombreValor()==variable){
                if(dato.getNumeroValor()<= 0 || dato.getNumeroValor()>0){

                }
                else{
                    dato.setNumeroValor(0);
                }
                pilaDeValores.add(dato.getNumeroValor());
            }
        }
    }
    public void cargarPrograma(Programa prog){
        setPrograma(prog);
    }
    public void ejecutar(String rutina){
        Programa prog = getPrograma();
        ArrayList<Rutina> rutinas = prog.getRutinaPorNombre(rutina);
        ArrayList<Instruccion> instructs = new ArrayList<Instruccion>();
        for (int i = 0; i < rutinas.size(); i++){
            Rutina rutAux = rutinas.get(i);
            for(int j = 0; j < rutAux.getInstrucciones().size(); j++){
                instructs.add(rutAux.getInstrucciones().get(j));
            }
        }
        for (int i = 0; i<instructs.size(); i++){
            String operation = instructs.get(i).getOperacion();
            switch(operation){
                case "push":
                    push(instructs.get(i).getValor());
                    break;
                case "add":
                    add();
                    break;
                case "sub":
                    sub();
                    break;
                case "mul":
                    mul();
                    break;
                case "read":
                    read(instructs.get(i).getNombreVariable());
                    break;
                case "write":
                    write(instructs.get(i).getNombreVariable());
                    break;
            }
        }
    }
}