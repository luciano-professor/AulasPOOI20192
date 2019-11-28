package bd;

import java.sql.SQLException;

public class TestaContato {

    public static void main(String[] args) {
        try {
            Contato c = new Contato();
            c.setNome("Carolina");
            c.setEmail("cabd@aluno.ifnmg.edu.br");
            c.setTelefone("33333333");

            ContatoDAO dao = new ContatoDAO();
            dao.adicionar(c);
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
