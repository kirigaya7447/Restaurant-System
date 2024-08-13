package CODIGOINTERNO;

import CONEXAO.Conexao;
import VARIAVEIS.Administracao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CIAdministracao {
private Connection conexao;

    public CIAdministracao() {
        this.conexao = new Conexao().getConexao();
    }

    public void inserir(Administracao administracao) {
        String sql = "INSERT INTO administracao (nivelAdministracao, descricaoAdministracao) VALUES (?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, administracao.getNivelAdministracao());
            stmt.setString(2, administracao.getDescricaoAdministracao());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(String nivelAdministracao) {
        String sql = "DELETE FROM administracao WHERE nivelAdministracao = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nivelAdministracao);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterar(Administracao administracao, String nivelAdministracao) {
        String sql
                = "UPDATE administracao SET nivelAdministracao = ?, descricaoAdministracao = ? WHERE nivelAdministracao = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, administracao.getNivelAdministracao());
            stmt.setString(2, administracao.getDescricaoAdministracao());
            stmt.setString(3, nivelAdministracao);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList pesquisar(String nivelAdministracao) {
        ArrayList<Administracao> administrativo = new ArrayList();
        Administracao a1;
        String sql;
        if (nivelAdministracao == null) {
            sql = "SELECT * FROM administracao";
        } else {
            sql = "SELECT * FROM administracao WHERE nivelAdministracao LIKE '%" + nivelAdministracao + "%'";
        }

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                a1 = new Administracao();
                a1.setNivelAdministracao(rs.getString("nivelAdministracao"));
                a1.setDescricaoAdministracao(rs.getString("descricaoAdministracao"));
                administrativo.add(a1);
            }
            stmt.close();
            return (administrativo);
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }

    }
}
