package equipamento;

public class EquipamentoImportado extends Equipamento {
    
    private double percentualimposto;
    
    public EquipamentoImportado(double p, double pi){
        super(p);
        this.setPercentualimposto(pi);
    }

    public double getPercentualimposto() {
        return percentualimposto;
    }

    public void setPercentualimposto(double percentualimposto) {
        this.percentualimposto = percentualimposto;
    }
    
    public double calcularPrecoFinal(){
        return getPreco() * getPercentualimposto() + getPreco();
    }
    
    
}
