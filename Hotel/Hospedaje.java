package clases;
import java.util.ArrayList;
public class Hospedaje {
    private ArrayList<Pasajero>PasajerosHospedados;
    private String FechaIngresoHospedaje;
    private String FechaSalidaHospedaje;
    private int TiempoDeEstadiaHospedaje;
    private int HabitacionHospedaje;
    private float CostoHospedaje;

    public Hospedaje(){
        this.PasajerosHospedados=new ArrayList<>();
        this.FechaIngresoHospedaje="28/07/2019";
        this.FechaSalidaHospedaje="29/07/2019";
        this.TiempoDeEstadiaHospedaje=1;
        this.HabitacionHospedaje=1;
        this.CostoHospedaje=545f;
    }

    public Hospedaje(ArrayList<Pasajero>PasajerosHospedadosN,String FechaIngresoHospedajeN,String FechaSalidaHospedajeN,int TiempoDeEstadiaHospedajeN, int HabitacionHospedajeN,float CostoHospedajeN){
        this.PasajerosHospedados=new ArrayList<>();
        this.FechaIngresoHospedaje=FechaIngresoHospedajeN;
        this.FechaSalidaHospedaje=FechaSalidaHospedajeN;
        this.TiempoDeEstadiaHospedaje=TiempoDeEstadiaHospedajeN;
        this.HabitacionHospedaje=HabitacionHospedajeN;
        this.CostoHospedaje=CostoHospedajeN;
    }

    public ArrayList<Pasajero> getPasajerosHospedados() {
        return PasajerosHospedados;
    }

    public String getFechaIngresoHospedaje() {
        return FechaIngresoHospedaje;
    }

    public String getFechaSalidaHospedaje() {
        return FechaSalidaHospedaje;
    }

    public int getTiempoDeEstadiaHospedaje() {
        return TiempoDeEstadiaHospedaje;
    }

    public int getHabitacionHospedaje() {
        return HabitacionHospedaje;
    }

    public float getCostoHospedaje() {
        return CostoHospedaje;
    }

    public void setPasajerosHospedados(ArrayList<Pasajero> PasajerosHospedadosN) {
        this.PasajerosHospedados = PasajerosHospedadosN;
    }

    public void setFechaIngresoHospedaje(String FechaIngresoHospedajeN) {
        this.FechaIngresoHospedaje = FechaIngresoHospedajeN;
    }

    public void setFechaSalidaHospedaje(String FechaSalidaHospedajeN) {
        this.FechaSalidaHospedaje = FechaSalidaHospedajeN;
    }

    public void setTiempoDeEstadiaHospedaje(int TiempoDeEstadiaHospedajeN) {
        this.TiempoDeEstadiaHospedaje = TiempoDeEstadiaHospedajeN;
    }

    public void setHabitacionHospedaje(int HabitacionHospedajeN) {
        this.HabitacionHospedaje = HabitacionHospedajeN;
    }

    public void setCostoHospedaje(float CostoHospedajeN) {
        this.CostoHospedaje = CostoHospedajeN;
    }
}
