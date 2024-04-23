import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyB=new Scanner(System.in);
        do{
            System.out.println("ingrese ejercicio");
            switch(keyB.nextInt()){
                case 1:
                    punto1();
                    break;
                case 2:
                    punto2();
                    break;
                case 3:
                    punto3();
                    break;
                default:
                    System.out.println("cualquier cosa ingrasaste wachin");
                    break;
            }
            System.out.println("n para cortar programa");
        }while(keyB.next().charAt(0)!='n');
    }
    public static void probandoAutor(){
        Autor autor=new Autor("ivi","maldivi","ivimaldivi@gmail.com",'m');
        System.out.println(autor.toString());
    }
    public static void punto1(){
        Autor bloch=new Autor("joshua","bloch","joshue@email.com",'m');
        Libro effectiveJava=new Libro("effectiveJava",450,150);
        effectiveJava.agregarAutor(bloch);
        effectiveJava.agregarAutor(new Autor("ivi","maldivi","ivimail.com",'m'));
        effectiveJava.agregarAutor(new Autor("pablin","walter","pablitoCuervo",'m'));
        effectiveJava.setPrecio(500);
        effectiveJava.setStock(50);
        System.out.println(effectiveJava.toString());

    }
    public static void punto2(){
        Cliente cliente=new Cliente("ivi","ivimail",5);
        Factura factura=new Factura(cliente);
        factura.agregarItem(new ItemVenta("macucas","chetas galles", 500));
        factura.agregarItem(new ItemVenta("pochoclos","oclos oclos!",300));
        factura.setMontoTotal();
        System.out.println(factura);
        System.out.println("Precio con descuento: "+factura.precioConDescuento());
    }
    public static void punto3(){
        BankClient client=new BankClient("ivi",'m');
        BankAccount bankAccount=new BankAccount(client,10000);
        bankAccount.depositar(5000);
        if(bankAccount.retiro(16000)==0) System.out.println("no tenes guita gato");
        else System.out.println("operacion realizada");
        bankAccount.depositar(1000);
        bankAccount.depositar(2000);
        bankAccount.depositar(3000);
        bankAccount.depositar(4000);
        bankAccount.depositar(5000);
        bankAccount.depositar(6000);
        bankAccount.retiro(700);
        bankAccount.retiro(800);
        bankAccount.retiro(900);
        bankAccount.retiro(1000);
        bankAccount.retiro(2000);
        bankAccount.retiro(3000);
        bankAccount.retiro(4000);
        System.out.println(bankAccount.toString());
    }

}