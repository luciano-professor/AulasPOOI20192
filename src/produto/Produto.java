package produto;

public class Produto {

    private double preco;
    private String nome;
    
    public Produto(double p, String n) throws ParametroInvalidoException{
        this.setPreco(p);
        this.setNome(n);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String n) 
            throws ParametroInvalidoException {
        
        //Verificar se a String de nome é vazia
        if(n.isEmpty()){
            throw new ParametroInvalidoException("Nome vazio.");
        }
        
        this.nome = n;
        
    }
    
    
    
}
