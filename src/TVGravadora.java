public class TVGravadora extends TV {
    
    private boolean gravar;
    
       
    public void ligar(int c, int v, boolean g){
        this.setCanal(c);
        this.setLigada(true);
        this.setVolume(v);
        this.setGravar(g);
    }

    public boolean isGravar() {
        return gravar;
    }

    public void setGravar(boolean gravar) {
        this.gravar = gravar;
    }
    
    
    
}
