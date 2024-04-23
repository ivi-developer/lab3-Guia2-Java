import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private String nombre;
    private String descripcion;
    private double precioU;
    public ItemVenta(){}
    public ItemVenta(String nombre,String descripcion,double precioU){
        id=UUID.randomUUID();
        this.descripcion=descripcion;
        this.nombre=nombre;
        this.precioU=precioU;
    }
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}
    public void setPrecioU(double precioU){this.precioU=precioU;}
    public void setId(){id=UUID.randomUUID();}
    public String getNombre(){return nombre;}
    public String getDescripcion(){return descripcion;}
    public double getPrecioU(){return precioU;}
    public UUID getId(){return id;}
    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioU=" + precioU +
                '}';
    }
}
