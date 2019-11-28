package bd;


import java.sql.*;

public class FabricaConexao {
    
    //Nome do banco de dados
    private String BD = "aulabd";
    
    //String de conexao com o BD
    private String CONEXAO = "jdbc:mysql://localhost:3306/"+BD;
    
    //Usuario do BD
    private String USUARIO = "root";
    
    //Senha do BD
    private String SENHA = "";
    
    public Connection pegarConexao() throws SQLException{
        return DriverManager.getConnection(CONEXAO, USUARIO, SENHA);
    }
    
    //Main para testar
    public static void main(String[] args) {
        try{
            new FabricaConexao().pegarConexao();
            System.out.println("Conectou com sucesso!");
        }
        catch(SQLException ex){
            System.out.println("Erro ao conectar no BD");
            System.out.println(ex.getMessage());
        } 
    }
    
}
