public class FuncionarioHorista extends Funcionario {
    
    private double valorHora;
    private int quantidadeHoras;
    
    public FuncionarioHorista(String n, String m, double vh, int qh){
        
        super(n, m);
        this.setQuantidadeHoras(qh);
        this.setValorHora(vh);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
    
    
    
}
