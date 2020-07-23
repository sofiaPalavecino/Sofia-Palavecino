package clases;

import java.util.*;

public class Restaurante {
    private HashMap<Integer,String>platos;
    private HashMap<Mesa,String>mesasTotales;
    private HashSet<Integer>mesasDisponibles;
    private HashMap<Integer,Integer>mesaHasPedidos;
    private HashSet<Pedido>pedidosDelDia;
    private HashSet<Pedido>pedidosTotales;
    private ArrayList<Pedido>pedidosPorEntregar;

    public Restaurante(){
        this.platos=new HashMap<>();
        this.mesasTotales=new HashMap<>();
        this.mesasDisponibles=new HashSet<>();
        this.mesaHasPedidos=new HashMap<>();
        this.pedidosDelDia=new HashSet<>();
        this.pedidosTotales=new HashSet<>();
        this.pedidosPorEntregar=new ArrayList<>();
    }
    public Restaurante(HashMap<Integer,String>platos,HashSet<Integer>mesasInternas,HashSet<Integer>mesasExternas,HashMap<Mesa,String>mesasTotales,HashSet<Integer>mesasDisponibles,HashMap<Integer,Integer>mesaHasPedidos,HashSet<Pedido>pedidosDelDia,HashSet<Pedido>pedidosTotales,ArrayList<Pedido>pedidosPorEntregar){
        this.platos=platos;
        this.mesasTotales=mesasTotales;
        this.mesasDisponibles=mesasDisponibles;
        this.mesaHasPedidos=mesaHasPedidos;
        this.pedidosDelDia=pedidosDelDia;
        this.pedidosTotales=pedidosTotales;
        this.pedidosPorEntregar=pedidosPorEntregar;
    }

    public HashMap<Integer, String> getPlatos() {
        return platos;
    }

    public HashMap<Mesa,String> getMesasTotales() {
        return mesasTotales;
    }

    public HashSet<Integer> getMesasDisponibles() {
        return mesasDisponibles;
    }

    public HashMap<Integer, Integer> getMesaHasPedidos() {
        return mesaHasPedidos;
    }

    public HashSet<Pedido> getPedidosDelDia() {
        return pedidosDelDia;
    }

    public HashSet<Pedido> getPedidosTotales() {
        return pedidosTotales;
    }

    public ArrayList<Pedido> getPedidosPorEntregar() {
        return pedidosPorEntregar;
    }

    public void setPlatos(HashMap<Integer, String> platos) {
        this.platos = platos;
    }

    public void setMesasTotales(HashMap<Mesa,String> mesasTotales) {
        this.mesasTotales = mesasTotales;
    }

    public void setMesasDisponibles(HashSet<Integer> mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    public void setMesaHasPedidos(HashMap<Integer, Integer> mesaHasPedidos) {
        this.mesaHasPedidos = mesaHasPedidos;
    }

    public void setPedidosDelDia(HashSet<Pedido> pedidosDelDia) {
        this.pedidosDelDia = pedidosDelDia;
    }

    public void setPedidosTotales(HashSet<Pedido> pedidosTotales) {
        this.pedidosTotales = pedidosTotales;
    }

    public void setPedidosPorEntregar(ArrayList<Pedido> pedidosPorEntregar) {
        this.pedidosPorEntregar = pedidosPorEntregar;
    }

    public void agregarPedidoDelDia(Pedido pedido){
        this.getPedidosDelDia().add(pedido);
    }

    public HashSet<Mesa> mesasConPlato(int nroPlato){
        HashSet<Mesa>mesas=new HashSet<>();
        for ( Map.Entry<Integer,Integer> elemento : this.getMesaHasPedidos().entrySet() ) {

            for(Mesa mesa:this.getMesasTotales()){
                if(elemento.getKey()==mesa.getNroMesa()){
                    for(Pedido pedido:this.getPedidosTotales()){
                        if(elemento.getValue()==pedido.getNroPedido() && pedido.getNroPlato()==nroPlato){
                            mesas.add(mesa);
                        }
                    }
                }
            }
        }
        return mesas;
    }

    public int numeroPedido(Pedido pedido){
        return pedido.getNroPedido();
    }

    public String platoMasVendido(){
        String nombrePlato="";
        int masVendido=0;
        int cantVeces;
        for(Map.Entry<Integer,String> plato : this.getPlatos().entrySet()){
            cantVeces=0;
            for(Pedido pedido:this.getPedidosDelDia()){
                if(pedido.getNroPlato()==plato.getKey()){
                    cantVeces++;
                }
            }
            if(cantVeces>masVendido){
                masVendido=cantVeces;
                nombrePlato=plato.getValue();
            }
        }
        return nombrePlato;
    }

    public String platoMenosVendido(){
        String nombrePlato="";
        int menosVendido=0;
        int cantVeces;
        for(Map.Entry<Integer,String> plato : this.getPlatos().entrySet()){
            cantVeces=0;
            for(Pedido pedido:this.getPedidosDelDia()){
                if(pedido.getNroPlato()==plato.getKey()){
                    cantVeces++;
                }
            }
            if(cantVeces<menosVendido){
                menosVendido=cantVeces;
                nombrePlato=plato.getValue();
            }
        }
        return nombrePlato;
    }

    public Pedido proximoAEntregar(){
        return this.getPedidosPorEntregar().get(0);
    }

    public void pedidoEntregado(){
        this.getPedidosPorEntregar().remove(0);
    }

    public Mesa mesaMasOcupada(){
        int mayorValor=0;
        int cantidad;
        Mesa mesa=new Mesa();
        for(Pedido pedido:this.getPedidosDelDia()){
            for(Map.Entry<Integer,Integer> elemento:this.getMesaHasPedidos().entrySet()){
                if(elemento.getValue()==pedido.getNroPedido()){
                    cantidad=0;
                    for(Map.Entry<Integer,Integer>elemento1:this.getMesaHasPedidos().entrySet()){
                        if(elemento.getKey()==elemento1.getKey()){
                            cantidad++;
                        }
                    }
                    if(cantidad>mayorValor){
                        mayorValor=cantidad;
                        for(Mesa mesa1:this.getMesasTotales()){
                            if(mesa1.getNroMesa()==elemento.getKey()){
                                mesa=mesa1;
                            }
                        }
                    }
                }
            }

        }
        return mesa;
    }

    public void agregarPlato(){
        Scanner ingreso=new Scanner(System.in);
        String nombrePlato=ingreso.nextLine();
        int claveMayor=0;
        for(Map.Entry<Integer,String>elemento:this.getPlatos().entrySet()){
            if(elemento.getKey()>claveMayor){
                claveMayor=elemento.getKey();
            }
        }
        claveMayor=claveMayor+1;
        this.getPlatos().put(claveMayor,nombrePlato);
    }

    public void eliminarPlato(int clavePlato){
        this.getPlatos().remove(clavePlato);
    }

    public void vaciarMesa(int nroMesa){
        for(Integer nro:this.getMesasDisponibles()){
            for(Mesa mesa:this.getMesasTotales()){

            }
        }
        this.getMesasDisponibles().remove(nroMesa);
    }
}