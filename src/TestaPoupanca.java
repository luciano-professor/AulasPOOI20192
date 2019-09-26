public class TestaPoupanca {

    public static void main(String[] args) {

        Cliente c = new Cliente("Lara", "007");
        
        Poupanca p = new Poupanca(20000, "001", "001", c);
        
        System.out.println("Saldo: " + p.getSaldo());
        
        p.sacar(1000);
        
        System.out.println("Saldo: " + p.getSaldo());
        
        p.renderJuros();
        
        System.out.println("Saldo: " + p.getSaldo());
        
    }

}
