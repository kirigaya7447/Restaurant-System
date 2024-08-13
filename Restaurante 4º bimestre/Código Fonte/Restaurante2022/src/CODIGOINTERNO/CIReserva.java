package CODIGOINTERNO;

import CONEXAO.Conexao;
import VARIAVEIS.Cliente;
import VARIAVEIS.Funcionario;
import VARIAVEIS.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CIReserva {
    
    private Connection conexao;

    public CIReserva() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Reserva r) {
        String sql = "INSERT INTO reserva (idReserva, cpfCliente, "
                + "cpfFuncionario, dataReserva, entradaHoraReserva, saidaHoraReserva, mesaReserva) "
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, r.getIdReserva());
            stmt.setString(2, r.getCpfCliente());
            stmt.setString(3, r.getCpfFuncionario());
            stmt.setString(4, r.getDataReserva());
            stmt.setString(5, r.getEntradaReserva());
            stmt.setString(6, r.getSaidaReserva());
            stmt.setString(7, r.getMesaReserva());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }
    
    public void remover(String idReserva) {
        String sql = "DELETE FROM reserva WHERE idReserva = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, idReserva);
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }
    
    public void alterar(Reserva r, String idReserva) {
        String sql = "UPDATE reserva SET idReserva = ?, "
                + "cpfCliente = ?, cpfFuncionario = ?, "
                + "dataReserva = ?, entradaHoraReserva = ?, saidaHoraReserva = ?, "
                + "mesaReserva = ? WHERE idReserva = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, r.getIdReserva());
            stmt.setString(2, r.getCpfCliente());
            stmt.setString(3, r.getCpfFuncionario());
            stmt.setString(4, r.getDataReserva());
            stmt.setString(5, r.getEntradaReserva());
            stmt.setString(6, r.getSaidaReserva());
            stmt.setString(7, r.getMesaReserva());
            stmt.setString(8, idReserva);
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }
    
    public ArrayList pesquisar(String idReserva) {
        ArrayList<Reserva> reservas = new ArrayList();
        Reserva r;
        String sql;
        if (idReserva == null) {
            sql = "SELECT * FROM reserva";
        } else {
            sql = "SELECT * FROM reserva WHERE cpfCliente LIKE '%" 
                    + idReserva + "%'";
        }

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                r = new Reserva();
                r.setIdReserva(rs.getString("idReserva"));
                r.setCpfCliente(rs.getString("cpfCliente"));
                r.setCpfFuncionario(rs.getString("cpfFuncionario"));
                r.setDataReserva(rs.getString("dataReserva"));
                r.setEntradaReserva(rs.getString("entradaHoraReserva"));
                r.setSaidaReserva(rs.getString("saidaHoraReserva"));
                r.setMesaReserva(rs.getString("mesaReserva"));
                reservas.add(r);
            }
            stmt.close();
            return (reservas);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList pesquisarCpfCliente() {
        ArrayList<Cliente> clienteTabe = new ArrayList();
        Cliente c1;
        String sql = "SELECT * FROM cliente";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c1 = new Cliente();
                c1.setCpfCliente(rs.getString("cpfCliente"));
                c1.setNomeCliente(rs.getString("nomeCliente"));
                clienteTabe.add(c1);
            }
            stmt.close();
            return (clienteTabe);
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }

}
    public ArrayList pesquisarCpfFuncionario() {
        ArrayList<Funcionario> funcionarioTabe = new ArrayList();
        Funcionario f1;
        String sql = "SELECT * FROM funcionario";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                f1 = new Funcionario();
                f1.setCpfFuncionario(rs.getString("cpfFuncionario"));
                f1.setNomeFuncionario(rs.getString("nomeFuncionario"));
                funcionarioTabe.add(f1);
            }
            stmt.close();
            return (funcionarioTabe);
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }

}
    public boolean pesquisarMesa(String mesa) {
        boolean sim;
        ArrayList<Reserva> reservasTabe = new ArrayList();
        Reserva r;
        String sql = "SELECT * FROM reserva WHERE mesaReserva LIKE \"" + mesa + "\"";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                r = new Reserva();
                r.setMesaReserva(rs.getString("mesaReserva"));
                stmt.execute();
                stmt.close();
                reservasTabe.add(r);
            }
            stmt.close();
            if(reservasTabe == null){
                sim = false;
            }
            else{
                sim = true;
            }
            return (sim);
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }
}