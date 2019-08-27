
public class TestaConta {

    public static void main(String[] args){
        
        Cliente x1 = new Cliente();
        x1.nome = "Matheus";
        x1.cpf = "000";
        
        Conta conta1 = new Conta();
        conta1.saldo = 2500;
        conta1.numero = "007";
        conta1.agencia = "9";
        conta1.titular = x1;
        
        
        
        
        
        
    }
    
}
