package aluno;

public class Aluno {
    
    private String nome;
    private String cpf;
    
    //Construtor
    public Aluno(String n, String c){
        //Faz algo automatico quando cria o objeto
        //Pode colocar o que quiser aqui
        //Normalmente fazemos um construtor para
        //setar os valores para os atributos
        
        this.setNome(n);
        this.setCpf(c);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setCpf(String c){
        this.cpf=c;
    }
}

