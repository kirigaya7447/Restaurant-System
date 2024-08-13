package CONEXAO;

import java.sql.SQLException;
import java.sql.Connection;

public class TestandoConexao {

    public static void main(String[] args) {
        try {
            Connection conexao = new Conexao().getConexao();
            conexao.close();
            System.out.println("Conexão confirmada, funcionou!!!");
        } catch (SQLException err) {
            System.out.println("Erro!!!!!!!!!\n");
            System.err.println(err);
        }
    }
}
