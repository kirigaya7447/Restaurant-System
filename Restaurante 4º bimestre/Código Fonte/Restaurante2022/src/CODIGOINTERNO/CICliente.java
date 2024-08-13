package CODIGOINTERNO;

import CONEXAO.Conexao;
import VARIAVEIS.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CICliente {

    private Connection conexao;

    public CICliente() {
        this.conexao = new Conexao().getConexao();
    }

    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpfCliente, nomeCliente, celularCliente, emailCliente, cidadeCliente, ruaCliente) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpfCliente());
            stmt.setString(2, cliente.getNomeCliente());
            stmt.setString(3, cliente.getCelularCliente());
            stmt.setString(4, cliente.getEmailCliente());
            stmt.setString(5, cliente.getCidadeCliente());
            stmt.setString(6, cliente.getRuaCliente());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(String cpfCliente) {
        String sql = "DELETE FROM cliente WHERE cpfCliente = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cpfCliente);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterar(Cliente cliente, String cpfCliente) {
        String sql
                = "UPDATE cliente SET cpfCliente = ?, nomeCliente= ?,"
                + " celularCliente = ?, emailCliente = ?, cidadeCliente = ?, "
                + "ruaCliente = ? WHERE cpfCliente = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpfCliente());
            stmt.setString(2, cliente.getNomeCliente());
            stmt.setString(3, cliente.getCelularCliente());
            stmt.setString(4, cliente.getEmailCliente());
            stmt.setString(5, cliente.getCidadeCliente());
            stmt.setString(6, cliente.getRuaCliente());
            stmt.setString(7, cpfCliente);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList pesquisar(String cpfCliente) {
        ArrayList<Cliente> clientes = new ArrayList();
        Cliente c;
        String sql;
        if (cpfCliente == null) {
            sql = "SELECT * FROM cliente";
        } else {
            sql = "SELECT * FROM cliente WHERE nomeCliente LIKE \"" + cpfCliente + "\"";
        }

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c = new Cliente();
                c.setCpfCliente(rs.getString("cpfCliente"));
                c.setNomeCliente(rs.getString("nomeCliente"));
                c.setCelularCliente(rs.getString("celularCliente"));
                c.setEmailCliente(rs.getString("emailCliente"));
                c.setCidadeCliente(rs.getString("cidadeCliente"));
                c.setRuaCliente(rs.getString("ruaCliente"));
                clientes.add(c);
            }
            stmt.close();
            return (clientes);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
