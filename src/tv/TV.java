package tv;

public class TV {
    
    private int canal;
    private boolean ligada;
    private int volume;

    public void ligar(){
        this.setCanal(20);
        this.setLigada(true);
        this.setVolume(30);
    }
    
    public void ligar(int c, int v){
        this.setCanal(c);
        this.setVolume(v);
        this.setLigada(true);
    }
    
    
    
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    
}
