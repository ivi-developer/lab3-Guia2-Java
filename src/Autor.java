public class Autor {
    private String nombre;
    private String apellido;
    private String mail;
    private char genero;
    public Autor(String nombre,String apellido,String mail,char genero){
        this.apellido=apellido.substring(0,1).toUpperCase()+apellido.substring(1);
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1);
        this.genero=Character.toUpperCase(genero);
        this.mail=mail;
    }
    public Autor(){
        apellido=null;
        nombre=null;
        mail=null;
        genero='n';
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = Character.toUpperCase(genero);
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", genero=" + genero +
                '}';
    }
}
