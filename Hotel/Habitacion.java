package clases;
import java.util.ArrayList;
public class Habitacion {
    private int NumeroHabitacion;
    private int CapacidadHabitacion;
    private boolean DisponibilidadHabitacion;
    private int VecesOcupadaHabitacion;

    public Habitacion(){
        this.NumeroHabitacion=1;
        this.CapacidadHabitacion=1;
        this.DisponibilidadHabitacion=false;
        this.VecesOcupadaHabitacion=3;
    }
    public Habitacion(int NumeroHabitacionN,int CapacidadHabitacionN,boolean DisponibilidadHabitacionN,int VecesOcupadaHabitacionN){
        this.NumeroHabitacion=NumeroHabitacionN;
        this.CapacidadHabitacion=CapacidadHabitacionN;
        this.DisponibilidadHabitacion=DisponibilidadHabitacionN;
        this.VecesOcupadaHabitacion=VecesOcupadaHabitacionN;
    }

    public int getNumeroHabitacion(){
        return NumeroHabitacion;
    }
    public int getCapacidadHabitacion(){
        return CapacidadHabitacion;
    }
    public boolean getDisponibilidadHabitacion(){
        return  DisponibilidadHabitacion;
    }
    public int getVecesOcupadaHabitacion(){
        return  VecesOcupadaHabitacion;
    }

    public void setNumeroHabitacion(int NumeroHabitacionN){
        this.NumeroHabitacion=NumeroHabitacionN;
    }
    public void setCapacidadHabitacion(int CapacidadHabitacionN){
        this.CapacidadHabitacion=CapacidadHabitacionN;
    }
    public void setDisponibilidadHabitacion(boolean DisponibilidadHabitacionN){
        this.DisponibilidadHabitacion=DisponibilidadHabitacionN;
    }
    public void  setVecesOcupadaHabitacion(int VecesOcupadaHabitacionN){
        this.VecesOcupadaHabitacion=VecesOcupadaHabitacionN;
    }
}

