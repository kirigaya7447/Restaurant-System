package VARIAVEIS;

public class Administracao {

    private String nivelAdministracao;
    private String descricaoAdministracao;

    public void Administracao() {

    }

    public void Administracao(String nivelAdministracao, String descricaoAdministracao) {
        this.nivelAdministracao = nivelAdministracao;
        this.descricaoAdministracao = descricaoAdministracao;
    }

    public String getNivelAdministracao() {
        return nivelAdministracao;
    }

    public void setNivelAdministracao(String nivelAdministracao) {
        this.nivelAdministracao = nivelAdministracao;
    }

    public String getDescricaoAdministracao() {
        return descricaoAdministracao;
    }

    public void setDescricaoAdministracao(String descricaoAdministracao) {
        this.descricaoAdministracao = descricaoAdministracao;
    }
    
    @Override
        public String toString(){
            String campo = nivelAdministracao;
            return campo;
        }
}
