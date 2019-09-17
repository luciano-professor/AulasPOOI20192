public class Cliente {

    private String nome;
    private String cpf;
    
    public Cliente(String n, String c){
        this.setNome(n);
        this.setCpf(c);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String c) {
        
        //validacao
        
        this.cpf = c;
    }
    
    
    
}
