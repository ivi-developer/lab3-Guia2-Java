import java.util.ArrayList;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;
    private ArrayList<Autor> autores;
    public Libro(String titulo,double precio,int stock){
        this.precio=precio;
        this.stock=stock;
        autores=new ArrayList<>();
        this.titulo=titulo.substring(0,1).toUpperCase()+titulo.substring(1);
    }
    public Libro(){
        this.precio=0;
        this.stock=0;
        this.titulo=null;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void agregarAutor(Autor autor){
        autores.add(autor);
    }
    public String mostrarAutores(){
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0; i<autores.size();i++){
            stringBuilder.append(autores.get(i).toString()+"\n");
        }
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "El libro, " +
                titulo+
                " de "+ mostrarAutores()+"se vende a " + precio +
                '}';
    }
}
