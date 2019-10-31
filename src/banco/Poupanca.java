package banco;

import cliente.Cliente;

public class Poupanca extends Conta {
       
    public Poupanca(double s, String a, String n, Cliente t){
        super(s, a, n, t);
    }
    
    public void renderJuros(){
        
        double juros = this.getSaldo() * 0.1;
        this.depositar(juros);
    }
    
}
