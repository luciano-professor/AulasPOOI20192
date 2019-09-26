public class TestaVeiiculo {

    public static void main(String[] args) {
        
        Veiculo[] veiculos = new Veiculo[10];
        
        Veiculo v1 = new Veiculo("Preto", "Fiat", 
                "05022090", "Uno");
        
        veiculos[0] = v1;
        veiculos[1] = new Veiculo("Preto", "Fiat", 
                "05022090", "Uno");
        
    }

}
