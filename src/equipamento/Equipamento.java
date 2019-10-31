package equipamento;

public class Equipamento {
    
    private double preco;
    
    public double calcularPrecoFinal(){
        return preco;
    }

    public Equipamento(double p){
        this.setPreco(p);
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
