package equipamento;


public class TestaEquipamento {

    public static void main(String[] args) {

        Equipamento e1 = new Equipamento(10.99);
        
        EquipamentoImportado ei1 = new EquipamentoImportado(5.99, 0.03);
        
        System.out.println(e1.calcularPrecoFinal());
        System.out.println(ei1.calcularPrecoFinal());
        
    }

}
