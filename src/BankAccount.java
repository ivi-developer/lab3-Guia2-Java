import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {
    private static final int MAX_DEUDA=2000;
    private UUID id;
    private BankClient client;
    private double balance;
    private ArrayList<String>registro;
    public BankAccount(){}
    public BankAccount(BankClient client, double balance){
        this.client=client;
        this.balance=balance;
        id=UUID.randomUUID();
        registro=new ArrayList<>();
    }
    public void setId(){id=UUID.randomUUID();}
    public void setClient(BankClient client){this.client=client;}
    public void setBalance(double balance){this.balance=balance;}
    public UUID getId(){return id;}
    public double getBalance(){return balance;}
    public BankClient getClient(){return client;}
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +"\n"+
                "client=" + client +"\n"+
                "balance=" + balance +"\n"+
                "registro=" + registro +
                '}';
    }
    public void depositar(double ingreso){
        balance+=ingreso;
        registro.add(client.getNombre()+" deposito: "+ingreso);
        if(registro.size()>10){
            registro.remove(0);
        }
    }
    public double retiro(double retiro){
        if(retiro<=balance+MAX_DEUDA){
            balance-=retiro;
            registro.add(client.getNombre()+" retiro: "+retiro);
            if(registro.size()>10){
                registro.remove(0);
            }
            return retiro;
        }
        return 0;
    }

}
