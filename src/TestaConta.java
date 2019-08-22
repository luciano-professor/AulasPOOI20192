
public class TestaConta {

    public static void main(String[] args){
        
        Conta conta1 = new Conta();
        
        conta1.saldo = 2500;
        conta1.numero = "007";
        conta1.agencia = "9";
        conta1.titular = "Matheus";
        
        conta1.depositar(5000);
        
        if(conta1.sacar(15000)){
            System.out.println("Saque com sucesso!");
        }else{
            System.out.println("Saque não realizado");
        }
        
        System.out.println("Saldo: " + conta1.saldo);
        
        
    }
    
}
