
import clases.Persona;
import clases.Hospitales;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> Paciente_por_Atender = new ArrayList<>();
        ArrayList<Persona> Pacientes_siendo_Atendidos = new ArrayList<>();
        ArrayList<Persona> Pacientes_Atendidos = new ArrayList<>();
        ArrayList<Persona> Doctores_Atendiendo = new ArrayList<>();
        Hospitales hospital1= new Hospitales();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Persona p7 = new Persona();
        Persona p8 = new Persona();
        Paciente_por_Atender.add(p1);
        Pacientes_siendo_Atendidos.add(p3);
        Pacientes_siendo_Atendidos.add(p4);
        Pacientes_Atendidos.add(p5);
        Pacientes_Atendidos.add(p6);
        Doctores_Atendiendo.add(p7);
        Doctores_Atendiendo.add(p8);
    }
}
