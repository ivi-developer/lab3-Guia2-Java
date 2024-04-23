import java.util.ArrayList;
import java.util.UUID;

public class BankClient {
    private UUID id;
    private String nombre;
    private char genero;
    public BankClient(){}
    public BankClient(String nombre, char genero){
        id=UUID.randomUUID();
        this.genero=Character.toUpperCase(genero);
        this.nombre=nombre;
    }
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setGenero(char genero){this.genero=genero;}
    public void setId(){id=UUID.randomUUID();}
    public String getNombre(){return nombre;}
    public char getGenero(){return genero;}
    public UUID getId(){return id;}
    @Override
    public String toString() {
        return "BankClient{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
