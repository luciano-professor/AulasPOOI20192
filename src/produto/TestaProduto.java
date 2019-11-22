package produto;

public class TestaProduto {
     
    public static void main(String[] args) {
        
        try{
        
            Produto x1 = new Produto(-5);
            
        }catch(ParametroInvalidoException ex){
            //Fazer algum tratamento de exceção
            
            System.out.println(ex.getMessage());
        }
        
        //continua a execução do programa
        
        
    }
    
}
