package banco;

import cliente.Cliente;


public class TestaConta {

    public static void main(String[] args){
        
        Cliente x1 = new Cliente("Matheus", "000");
        
        Conta conta1 = new Conta(2500, "007", "009", x1);
        
        System.out.println(conta1.getSaldo());

    }
    
}
