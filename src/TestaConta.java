
public class TestaConta {

    public static void main(String[] args){
        
        Cliente x1 = new Cliente();
        x1.setNome("Matheus");
        x1.setCpf("000");
        
        Conta conta1 = new Conta();
        conta1.depositar(2500);
        conta1.setNumero("007");
        conta1.setAgencia("009");
        conta1.setTitular(x1);
        
        System.out.println(conta1.getSaldo());
        
        
        
        
        
        
        
        
    }
    
}
