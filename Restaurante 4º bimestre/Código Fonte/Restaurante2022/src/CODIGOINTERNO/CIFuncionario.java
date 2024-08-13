package CODIGOINTERNO;

import CONEXAO.Conexao;
import VARIAVEIS.Funcionario;
import VARIAVEIS.Administracao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CIFuncionario {

    private Connection conexao;

    public CIFuncionario() {
        this.conexao = new Conexao().getConexao();
    }

    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (cpfFuncionario, "
                + "nomeFuncionario, senhaFuncionario, dataContratoFuncionario, "
                + "horaContratoFuncionario, salarioFuncionario, "
                + "funcaoFuncionario, nivelAdministracao) VALUES "
                + "(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getCpfFuncionario());
            stmt.setString(2, funcionario.getNomeFuncionario());
            stmt.setString(3, funcionario.getSenhaFuncionario());
            stmt.setString(4, funcionario.getDataContratoFuncionario());
            stmt.setString(5, funcionario.getHoraContratoFuncionario());
            stmt.setString(6, funcionario.getSalarioFuncionario());
            stmt.setString(7, funcionario.getFuncaoFuncionario());
            stmt.setString(8, funcionario.getNivelAdministracao());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }

    public void remover(String cpffuncionario) {
        String sql = "DELETE FROM funcionario WHERE cpfFuncionario = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cpffuncionario);
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }

    public void alterar(Funcionario funcionario, String cpfFuncionario) {
        String sql = "UPDATE funcionario SET cpfFuncionario = ?, nomeFuncionario = ?, senhaFuncionario = ?, dataContratoFuncionario = ?, horaContratoFuncionario = ?, salarioFuncionario = ?, funcaoFuncionario = ?, nivelAdministracao = ? WHERE cpfFuncionario = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getCpfFuncionario());
            stmt.setString(2, funcionario.getNomeFuncionario());
            stmt.setString(3, funcionario.getSenhaFuncionario());
            stmt.setString(4, funcionario.getDataContratoFuncionario());
            stmt.setString(5, funcionario.getHoraContratoFuncionario());
            stmt.setString(6, funcionario.getSalarioFuncionario());
            stmt.setString(7, funcionario.getFuncaoFuncionario());
            stmt.setString(8, funcionario.getNivelAdministracao());
            stmt.setString(9, cpfFuncionario);
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }

    public void limpar(String cpfFuncionario) {
        String sql = "DELETE * FROM funcionario ";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cpfFuncionario);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList pesquisar(String cpfFuncionario) {
        ArrayList<Funcionario> funcionarios = new ArrayList();
        Funcionario f1;
        String sql;
        if (cpfFuncionario == null) {
            sql = "SELECT * FROM funcionario";
        } else {
            sql = "SELECT * FROM funcionario WHERE cpfFuncionario LIKE \"" + cpfFuncionario + "\"";
        }

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                f1 = new Funcionario();
                f1.setCpfFuncionario(rs.getString("cpfFuncionario"));
                f1.setNomeFuncionario(rs.getString("nomeFuncionario"));
                f1.setSenhaFuncionario(rs.getString("senhaFuncionario"));
                f1.setDataContratoFuncionario(rs.getString("dataContratoFuncionario"));
                f1.setHoraContratoFuncionario(rs.getString("horaContratoFuncionario"));
                f1.setSalarioFuncionario(rs.getString("salarioFuncionario"));
                f1.setFuncaoFuncionario(rs.getString("funcaofuncionario"));
                f1.setNivelAdministracao(rs.getString("nivelAdministracao"));
                funcionarios.add(f1);
            }
            stmt.close();
            return (funcionarios);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public ArrayList pesquisarNivelAdministracao() {
        ArrayList<Administracao> administracaoTabeFu = new ArrayList();
        Administracao adm1;
        String sql = "SELECT * FROM administracao";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                adm1 = new Administracao();
                adm1.setNivelAdministracao(rs.getString("nivelAdministracao"));
                adm1.setDescricaoAdministracao(rs.getString("descricaoAdministracao"));
                administracaoTabeFu.add(adm1);
            }
            stmt.close();
            return (administracaoTabeFu);
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }

    }

    public boolean pesquisarSenha(String senha, String cpf) {
        ArrayList<Funcionario> senhas = new ArrayList();
        Funcionario fl;
        String sql;
        boolean confirmacao;
        if (senha == null) {
            sql = "SELECT * FROM funcionario";
        } else {
            sql = "SELECT * FROM funcionario WHERE cpfFuncionario LIKE \"" + cpf + "\" AND senhaFuncionario LIKE \"" + senha + "\"";
        }

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                fl = new Funcionario();
                fl.setSenhaFuncionario(rs.getString("senhaFuncionario"));
                senhas.add(fl);
                stmt.execute();
            }
            stmt.close();
            if (senhas.isEmpty()) {
                confirmacao = false;
            } else {
                confirmacao = true;
            }
            return (confirmacao);
        } catch (SQLException err) {
            throw new RuntimeException(err);
        }
    }

    public boolean pesquisarCpf(String cpf) {
        boolean confirmacao;
        if (cpf != null) {
            ArrayList<Funcionario> cpfs = new ArrayList();
            Funcionario fl;

            try {
                String sql = "SELECT * FROM funcionario WHERE cpfFuncionario LIKE \"" + cpf + "\"";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    fl = new Funcionario();
                    fl.setCpfFuncionario(rs.getString("cpfFuncionario"));
                    cpfs.add(fl);
                    stmt.execute();
                }
                stmt.close();
                if (cpfs.isEmpty()) {
                    confirmacao = false;
                } else {
                    confirmacao = true;
                }

                return (confirmacao);
            } catch (SQLException err) {
                throw new RuntimeException(err);
            }
        } else {
            confirmacao = false;
            return (confirmacao);
        }
    }

    public String pesquisarNivel(String cpf) {
        String niveisFalso = null;
        if (cpf != null) {
            Funcionario fl = new Funcionario();

            try {
                String sql = "SELECT `nivelAdministracao` FROM `funcionario` WHERE `cpfFuncionario` LIKE \"" + cpf + "\"";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    fl.setNivelAdministracao(rs.getString("nivelAdministracao"));
                    stmt.execute();
                }
                stmt.close();

                return ("" + fl.getNivelAdministracao().charAt(1));
            } catch (SQLException err) {
                throw new RuntimeException(err);
            }
        } else {
            return (niveisFalso);
        }
    }
    
    public ArrayList pesquisarSenha2(String cpf){
        Funcionario f1;
        ArrayList<Funcionario> senhas = new ArrayList();
        try{
        String sql = "SELECT senhaFuncionario FROM funcionario WHERE cpfFuncionario LIKE \"" + cpf + "\"";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    f1 = new Funcionario();
                    f1.setSenhaFuncionario(rs.getString("senhaFuncionario"));
                    senhas.add(f1);
                    stmt.execute();
                }
                stmt.close();
                return (senhas);
    }catch(SQLException err){
    throw new RuntimeException(err);
    }
}
}
