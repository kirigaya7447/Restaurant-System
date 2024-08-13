/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOINTERNO;

import CONEXAO.Conexao;
import PRINCIPAL.FrmPrincipal;
import VARIAVEIS.Cliente;
import VARIAVEIS.DataHora;
import VARIAVEIS.Funcionario;
import VARIAVEIS.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class CIRegistro extends Funcionario{
    private Connection conexao;
    
    public CIRegistro() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void registrar(Registro reg, DataHora dh) {
        String sql = "INSERT INTO registro (idRegistro, acaoRegistro, "
                + "cpfAutorRegistro, dataRegistro, horaRegistro, "
                + "cpfFuncionario, cpfCliente, idReserva) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, reg.getIdRegistro());
            stmt.setString(2, reg.getAcaoRegistro());
            stmt.setString(3, reg.getCpfAutor());
            stmt.setString(4, dh.getData());
            stmt.setString(5, dh.getHora());
            stmt.setString(6, reg.getCpfFuncionario());
            stmt.setString(7, reg.getCpfCliente());
            stmt.setString(8, reg.getIdReserva());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }
    
    public ArrayList pesquisar(String cpfAutor) {
        ArrayList<Registro> registros = new ArrayList();
        Registro r;
        String sql;
        if (cpfAutor == null) {
            sql = "SELECT * FROM registro";
        } else {
            sql = "SELECT * FROM registro WHERE cpfAutorRegistro LIKE \"" + cpfAutor + "\"";
        }

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                r = new Registro();
                r.setIdRegistro(rs.getString("idRegistro"));
                r.setCpfAutor(rs.getString("cpfAutorRegistro"));
                r.setAcaoRegistro(rs.getString("acaoRegistro"));
                r.setData(rs.getString("dataRegistro"));
                r.setHora(rs.getString("horaRegistro"));
                r.setCpfFuncionario(rs.getString("cpfFuncionario"));
                r.setCpfCliente(rs.getString("cpfCliente"));
                r.setIdReserva(rs.getString("idReserva"));
                registros.add(r);
            }
            stmt.close();
            return (registros);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
