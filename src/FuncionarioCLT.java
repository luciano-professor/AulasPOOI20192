public class FuncionarioCLT extends Funcionario {
    
    private double salario;
    
    public FuncionarioCLT(String n, String m, double s){
        super(n, m);
        this.setSalario(s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
