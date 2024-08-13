package VARIAVEIS;

public class Cliente {

    String cpfCliente;
    String nomeCliente;
    String celularCliente;
    String emailCliente;
    String cidadeCliente;
    String ruaCliente;

    public void Cliente() {

    }

    public void Cliente(String cpfCliente, String nomeCliente, String celularCliente, String cidadeCliente, String ruaCliente, String emailCliente) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.celularCliente = celularCliente;
        this.cidadeCliente = cidadeCliente;
        this.ruaCliente = ruaCliente;
        this.emailCliente = emailCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public String getRuaCliente() {
        return ruaCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public void setRuaCliente(String ruaCliente) {
        this.ruaCliente = ruaCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    @Override
        public String toString(){
            String campo = cpfCliente;
            return campo;
        }
}
