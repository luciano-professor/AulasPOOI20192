
public class Conta {
    
    //Atributos
    
    double saldo;
    String agencia;
    String numero;
    Cliente titular;
    
    //Metodos
    
    void depositar(double valor){
        this.saldo += valor;
    }
    
    boolean sacar(double valor){
        
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        
        return false; 
        
    }
    
    boolean tranferir(double valor, Conta destino){
        
        //Se conseguir sacar o valor desta conta
        if(this.sacar(valor)){
            //deposite o valor na conta de destino
            destino.depositar(valor);
            return true;
        }
        
        return false;
        
    }
    
    
    
    
    
    
    
}
