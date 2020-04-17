package clases;
import java.util.ArrayList;
public class Hospitales {
    private ArrayList<Persona>Paciente_por_Atender;
    private ArrayList<Persona>Pacientes_siendo_Atendidos;
    private String Nombre_Hospital;
    private ArrayList<Persona>Pacientes_Atendidos;
    private ArrayList<Persona>Doctores_Atendiendo;
    private int Camas_Disponibles;

    public Hospitales(String nombre_HospitalN, int Camas_DisponiblesN){
        this.Nombre_Hospital=nombre_HospitalN;
        this.Camas_Disponibles=Camas_DisponiblesN;
    }

    public String getNombre_Hospital(){
        return Nombre_Hospital;
    }
    public int getCamas_Disponibles(){
        return Camas_Disponibles;
    }
    public void setNombre_Hospital(String nombre_HospitalN){
        this.Nombre_Hospital=nombre_HospitalN;
    }
    public void setCamas_Disponibles(int Camas_DisponiblesN){
        this.Camas_Disponibles=Camas_DisponiblesN;
    }


    public int CantTotalPacientesAtendidos(Hospitales x){
        int Cant_Atendidos=x.Pacientes_Atendidos.size();
        return Cant_Atendidos;
    }
    public void PacientesSiendoAtendidos(){

    }

    public void AgregarPacientesPorAtender(Persona x, Hospitales y){
        y.Paciente_por_Atender.add(x);
    }

    public void EliminarPacientesPorAtender(Persona x, Hospitales y){
        int indice;
        for(int i=1;i<=y.Paciente_por_Atender.size();i++){
            if(y.Paciente_por_Atender(i)==x){

            }
        }
        y.Paciente_por_Atender.remove(x);
    }



    public int CamasDisponibles(Hospitales x){
        int CamasDisp= x.Camas_Disponibles;
        return CamasDisp;
    }


}

// - método que retorne la cantidad total de pacientes atendidos
// - método que retorne el nombre, apellido y edad de los pacientes que están siendo atendidos actualmente
// - método que agregue nuevos pacientes por atender
// - método que elimine pacientes atendidos de la lista "pacientes por atender"
//- método para agregar pacientes atendidos a la lista "pacientes atendidos"
//- método que indique el número de camas disponibles en el hospital
