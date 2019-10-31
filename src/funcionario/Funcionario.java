package funcionario;

public class Funcionario {
    private String nome;
    private String matricula;
    
    public Funcionario (String nome, String matricula){
        this.setNome (nome);
        this.setMatricula(matricula);
    }
    
    public String getMatricula (){
        return this.matricula;
    }
    
    public void setMatricula (String matricula) {
        this.matricula=matricula;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public void setNome (String nome) {
        this.nome=nome;
        
    }
    
}
