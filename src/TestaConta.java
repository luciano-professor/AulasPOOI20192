
public class TestaConta {

    public static void main(String[] args){
        
        Conta conta1 = new Conta();
        
        conta1.saldo = 2500;
        conta1.numero = "007";
        conta1.agencia = "9";
        conta1.titular = "Matheus";
        
        System.out.println("Saldo: " + conta1.saldo);
        
        
    }
    
}
