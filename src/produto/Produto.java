package produto;

public class Produto {

    private double preco;
    
    public Produto(double p) throws ParametroInvalidoException{
        this.setPreco(p);
    }

    public double getPreco() {
        return preco;
    }

    public final void setPreco(double preco) 
            throws ParametroInvalidoException {
        
        //Verificar se o parametro é inválido
        if(preco < 0){
            //Ocorreu a situação indesejada
            
            //Lançar a exceção para avisar os resto
            //do programa que essa situação indesejada
            //ocorreu
            throw new ParametroInvalidoException("Preço negativo");
        }
        
        this.preco = preco;
    }
    
    
    
}
