package bd;

import java.sql.*;
public class ContatoDAO {
 
    /**
     * Responsável por adicionar um contato no banco de dados
     */
    public void adicionar(Contato c) throws SQLException{
        
        String sql = "INSERT INTO contato (nome, email, telefone) "
                + "VALUES (?, ?, ?)";
        
        //Pegando a conexao da Fabrica que criamos
        Connection conexao = new FabricaConexao().pegarConexao();
        
        //Preparar a SQL
        PreparedStatement sqlPreparada = conexao.prepareStatement(sql);
        
        //Substituir as ?
        sqlPreparada.setString(1, c.getNome());
        sqlPreparada.setString(2, c.getEmail());
        sqlPreparada.setString(3, c.getTelefone());
        
        //Executar o comando SQL no banco de dados
        sqlPreparada.executeUpdate();
        
        //Fechar a conexao
        sqlPreparada.close();
        conexao.close();
    }
    
}
