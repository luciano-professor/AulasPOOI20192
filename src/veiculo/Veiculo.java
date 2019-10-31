package veiculo;

public class Veiculo {
   
    private String cor;
    private String marca;
    private String chassi;
    private String modelo;
    
    //Construtor
    public Veiculo (String c, String m, String ch, String md){
        this.setCor(c);
        this.setMarca(m);
        this.setChassi (ch);
        this.setModelo(md);
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getChassi(){
        return this.chassi;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public void setCor(String c){
        this.cor=c;
    }
    
    public void setMarca(String m){
        this.marca=m;
    }
    
    public void setModelo(String m){
        this.modelo=m;
    }
    
    public void setChassi(String c){
        this.chassi=c;
    }
    
}
