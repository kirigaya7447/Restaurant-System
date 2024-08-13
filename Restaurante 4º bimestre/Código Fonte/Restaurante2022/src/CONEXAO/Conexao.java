package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Conexao() {

    }

    public Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/restaurante";
        String login = "root";
        String senha = "vertrigo";
        try {
            return DriverManager.getConnection(url, login, senha);
        } catch (SQLException err) {
            throw new RuntimeException(err);

        }
    }
}
