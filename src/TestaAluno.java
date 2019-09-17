public class TestaAluno {

    public static void main(String[] args) {
        
        Aluno n = new Aluno("Agostinho", "123.456.789-00");
        Aluno a = new Aluno("Pedro", "007");
        
        System.out.println("Nome: " + n.getNome());
        System.out.println("CPF: " + n.getCpf());
    }

}
