
public class Conta {
    
    //Atributos
    private double saldo;
    private String agencia;
    private String numero;
    private Cliente titular;
    
    //Construtor
    public Conta(double s, String a, String n, Cliente t){
        this.depositar(s);
        this.setAgencia(a);
        this.setNumero(n);
        this.setTitular(t);
    }
    
    //Getters e Setters
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public Cliente getTitular(){
        return this.titular;
    }
    
    public void setAgencia(String a){
        this.agencia = a;
    }
    
    public void setNumero(String n){
        this.numero = n;
    }
    
    public void setTitular(Cliente c){
        this.titular = c;
    }
    
    
    
    //Metodos
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public boolean sacar(double valor){
        
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        
        return false; 
        
    }
    
    public boolean tranferir(double valor, Conta destino){
        
        //Se conseguir sacar o valor desta conta
        if(this.sacar(valor)){
            //deposite o valor na conta de destino
            destino.depositar(valor);
            return true;
        }
        
        return false;
        
    }
    
    
    
    
    
    
    
}
