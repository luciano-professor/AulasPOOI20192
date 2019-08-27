
public class TestaConta {

    public static void main(String[] args){
        
        Conta conta1 = new Conta();
        conta1.saldo = 2500;
        conta1.numero = "007";
        conta1.agencia = "9";
        conta1.titular = "Matheus";
        
        Conta conta2 = new Conta();
        conta2.saldo = 100;
        conta2.titular = "Luciano";
        conta2.agencia = "9";
        conta2.numero = "777";
        
        if(conta1.tranferir(1000, conta2)){
            System.out.println("Tranferiu!");
        }
        else{
            System.out.println("Deu errado!");
        }
        
        
        
        
    }
    
}
