import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String mail;
    private int descuento;
    public Cliente(){}
    public Cliente(String nombre,String mail,int descuento){
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1);
        this.mail=mail;
        this.descuento=descuento;
        id=UUID.randomUUID();
    }
    public void setMail(String mail){this.mail=mail;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setDescuento(int descuento){this.descuento=descuento;}
    public void setId(){id=UUID.randomUUID();}
    public String getNombre(){return nombre;}
    public String getMail(){return mail;}
    public int getDescuento(){return descuento;}
    public UUID getId(){return id;}
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
