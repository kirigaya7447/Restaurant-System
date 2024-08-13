package VARIAVEIS;

public class Funcionario {

    String cpfFuncionario;
    String nomeFuncionario;
    String dataContratoFuncionario;
    String horaContratoFuncionario;
    String salarioFuncionario;
    String funcaoFuncionario;
    String nivelAdministracao;
    String senhaFuncionario;
    String descricaoAdministracao;
    boolean logado;

    public void Funcionario() {

    }

    public void Funcionario(String cpfFuncionario, String nomeFuncionario, String dataContratoFuncionario, String horaContratoFuncionario, String salarioFuncionario, String funcaoFuncionario, String nivelAdministracao, String senhaFuncionario, String descricaoAdministracao, boolean logado) {
        this.cpfFuncionario = cpfFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.dataContratoFuncionario = dataContratoFuncionario;
        this.horaContratoFuncionario = horaContratoFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.funcaoFuncionario = funcaoFuncionario;
        this.nivelAdministracao = nivelAdministracao;
        this.senhaFuncionario = senhaFuncionario;
        this.descricaoAdministracao = descricaoAdministracao;
        this.logado = logado;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getDataContratoFuncionario() {
        return dataContratoFuncionario;
    }
    public String getHoraContratoFuncionario(){
        return horaContratoFuncionario;
    }

    public String getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public String getNivelAdministracao() {
        return nivelAdministracao;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public String getDescricaoAdministracao() {
        return descricaoAdministracao;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setDataContratoFuncionario(String contratoFuncionario) {
        this.dataContratoFuncionario = contratoFuncionario;
    }
    
    public void setHoraContratoFuncionario(String horaContratoFuncionario){
        this.horaContratoFuncionario = horaContratoFuncionario;
    }

    public void setSalarioFuncionario(String salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }

    public void setNivelAdministracao(String nivelAdministracao) {
        this.nivelAdministracao = nivelAdministracao;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public void setDescricaoAdministracao(String descricaoAdministracao) {
        this.descricaoAdministracao = descricaoAdministracao;
    }

    public boolean getLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    
    
    
    @Override
        public String toString(){
            String campo = cpfFuncionario;
            return campo;
        }
}
