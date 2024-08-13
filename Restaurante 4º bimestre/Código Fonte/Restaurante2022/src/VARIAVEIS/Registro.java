package VARIAVEIS;

public class Registro{

    String data = new DataHora().date;
    String hora = new DataHora().hour;
    String acaoRegistro;
    String idRegistro;
    String cpfFuncionario;
    String cpfAutor;
    String cpfCliente;
    String idReserva;
    
    public Registro() {
        
    }
    
    private void Registro(String acao) {
        this.acaoRegistro = acao;
    }

    public String getAcaoRegistro() {
        return acaoRegistro;
    }

    public void setAcaoRegistro(String acaoRegistro) {
        this.acaoRegistro = acaoRegistro;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
    
    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void Registro() {

    }

    public String getData() {
        return data;
    }

    public void setData(String dh) {
        this.data = dh;
    }
    
    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
    
    
}
