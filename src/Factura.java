import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Factura{
    private UUID id;
    private double montoTotal;
    private ArrayList<ItemVenta>itemVentas;
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    public Factura(){}
    public Factura(Cliente cliente){
        itemVentas=new ArrayList<>();
        this.cliente=cliente;
        id=UUID.randomUUID();
        fechaYHora=LocalDateTime.now();
    }
    public void setId() {id = UUID.randomUUID();}
    private void setMontoTotal(double montoTotal){this.montoTotal=montoTotal;}
    public void setCliente(Cliente cliente){this.cliente=cliente;}
    public void setFechaYHora(){fechaYHora=LocalDateTime.now();}
    public double getMontoTotal(){return montoTotal;}
    public Cliente getCliente(){return cliente;}
    public LocalDateTime getFechaYHora(){return fechaYHora;}
    public UUID getId() {return id;}
    public double precioConDescuento(){return montoTotal-(montoTotal*cliente.getDescuento()/100);}
    public void agregarItem(ItemVenta item){itemVentas.add(item);}
    public void setMontoTotal(){
        for(ItemVenta item:itemVentas){
            montoTotal+= item.getPrecioU();
        }
    }
    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", fechaYHora=" + fechaYHora +'\n'+
                "cliente=" + cliente +'\n'+
                "itemVentas=" + itemVentas +
                '}';
    }
}
