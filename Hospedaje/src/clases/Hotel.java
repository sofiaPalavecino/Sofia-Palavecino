package clases;
import clases.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel {
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Pasajero> totalHuespedesIngresados;
    private float ingresoTotal;

    public Hotel() {
        this.habitaciones = new ArrayList();

        int i;
        Habitacion habitacionDeUnHuesped;
        for(i = 1; i <= 8; ++i) {
            habitacionDeUnHuesped = new Habitacion(i, 1);
            this.habitaciones.add(habitacionDeUnHuesped);
        }

        for(i = 9; i <= 13; ++i) {
            habitacionDeUnHuesped = new Habitacion(i, 2);
            this.habitaciones.add(habitacionDeUnHuesped);
        }

        this.totalHuespedesIngresados = new ArrayList();
        this.ingresoTotal = 0.0F;
    }

    public Hotel(ArrayList<Habitacion> habitaciones, ArrayList<Pasajero> totalHuespedesIngresados, float ingresoTotal) {
        this.habitaciones = habitaciones;
        this.totalHuespedesIngresados = totalHuespedesIngresados;
        this.ingresoTotal = ingresoTotal;
    }

    public ArrayList getHabitaciones(){return habitaciones;}
    public ArrayList getTotalHuespedesIngresados(){return totalHuespedesIngresados;}
    public float getIngresoTotal(){return ingresoTotal;}

    public void setHabitaciones(ArrayList habitacionesN){this.habitaciones=habitacionesN;}
    public void setTotalHuespedesIngresados(ArrayList totalHuespedesIngresadosN){ this.totalHuespedesIngresados=totalHuespedesIngresadosN;}
    public void setIngresoTotal(float ingresoTotalN){this.ingresoTotal=ingresoTotalN;}

    public void ocuparHabitacion(Hotel hotel1,ArrayList<Pasajero>pasajerosNuevos){
        int i=0;
        boolean x=false;
        if(pasajerosNuevos.size()==2){
            while(x!=true){
                Habitacion habitacionx= (Habitacion) hotel1.getHabitaciones().get(i);
                if(habitacionx.getCantidadDeHuespedes()==2 && habitacionx.getHuespedes().size()==0){
                    x=true;
                    Habitacion habitacionSeleccionada=habitacionx;
                }
                i++;
            }
        }
        else{
            while(x!=true){
                Habitacion habitacionx= (Habitacion) hotel1.getHabitaciones().get(i);
                if(habitacionx.getCantidadDeHuespedes()==1 && habitacionx.getHuespedes().size()==0){
                    x=true;
                    Habitacion habitacionSeleccionada=habitacionx;
                }
                i++;
            }
        }
    }
    public void guardadoDeHuesped(Hotel hotel1,ArrayList<Pasajero> pasajerosNuevos,String nombre, String apellido,int edad,int dni){
        Pasajero pasajeroNuevo=new Pasajero();
        pasajeroNuevo.setNombrePasajero(nombre);
        pasajeroNuevo.setApellidoPasajero(apellido);
        pasajeroNuevo.setEdadPasajero(edad);
        pasajeroNuevo.setDniPasajero(dni);
        hotel1.getTotalHuespedesIngresados().add(pasajeroNuevo);
        pasajerosNuevos.add(pasajeroNuevo);
    }
    public void registroDeHuesped(Hotel hotel1, ArrayList<Pasajero> pasajerosNuevos) {
        Scanner ingresoNombre = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = ingresoNombre.nextLine();
        Scanner ingresoApellido = new Scanner(System.in);
        System.out.println("Ingrese apellido: ");
        String apellido = ingresoApellido.nextLine();
        Scanner ingresoEdad = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = ingresoEdad.nextInt();
        Scanner ingresoDni = new Scanner(System.in);
        System.out.println("Ingrese dni: ");
        int dni = ingresoDni.nextInt();
        guardadoDeHuesped(hotel1,pasajerosNuevos,nombre,apellido,edad,dni);
    }
    public void ingresoHotel(Hotel hotel1){
        ArrayList<Pasajero>pasajerosNuevos=new ArrayList<>();
        Scanner ingresoCantidadHuespedes = new Scanner(System.in);
        System.out.println("Ingrese cantidad de huéspedes");
        int cantidadHuespedes=ingresoCantidadHuespedes.nextInt();
        while(cantidadHuespedes<1 || cantidadHuespedes>2){
            cantidadHuespedes=ingresoCantidadHuespedes.nextInt();
        }
        for(int i=0;i<=cantidadHuespedes;i++){
            registroDeHuesped(hotel1,pasajerosNuevos);
        }
        ocuparHabitacion(hotel1,pasajerosNuevos);
    }

    public void pasajerosFrecuentes(Hotel hotel1){

    }
}
