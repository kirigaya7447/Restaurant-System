package VARIAVEIS;

public class Reserva {

    public String idReserva;
    String cpfCliente;
    String cpfFuncionario;
    String dataReserva;
    String entradaReserva;
    String saidaReserva;
    String mesaReserva;

    public void Reserva() {

    }

    private void Reserva(String idReserva, String cpfCliente, String cpfFuncionario, String dataReserva, String entradaReserva, String saidaReserva, String mesaReserva) {
        this.idReserva = idReserva;
        this.cpfCliente = cpfCliente;
        this.cpfFuncionario = cpfFuncionario;
        this.dataReserva = dataReserva;
        this.entradaReserva = entradaReserva;
        this.saidaReserva = saidaReserva;
        this.mesaReserva = mesaReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public void setEntradaReserva(String entradaReserva) {
        this.entradaReserva = entradaReserva;
    }

    public void setSaidaReserva(String saidaReserva) {
        this.saidaReserva = saidaReserva;
    }

    public void setMesaReserva(String mesaReserva) {
        this.mesaReserva = mesaReserva;
    }

    public String getIdReserva() {
        return idReserva;
    }
    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }
    public String getDataReserva() {
        return dataReserva;
    }

    public String getEntradaReserva() {
        return entradaReserva;
    }

    public String getSaidaReserva() {
        return saidaReserva;
    }

    public String getMesaReserva() {
        return mesaReserva;
    }
    
    public String reservaId(String recebe) {
        idReserva = recebe;
        return recebe;
    }
}
