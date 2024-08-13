package VARIAVEIS;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DataHora {

    Date hoje = new Date();
    String date = new SimpleDateFormat("yyyy/MM/dd").format(hoje);
    String hour = new SimpleDateFormat("HH:mm:ss").format(hoje);
    
    public DataHora() {
        
    }
    
    private void DataHora(Date hoje, String date) {
        this.hoje = hoje;
        this.date = date;
    }

    public String getData() {
        return (date);
    }

    public String getDia(String data) {
        char dia1 = data.charAt(0);
        char dia2 = data.charAt(1);
        return ("" + dia1 + dia2);
    }

    public String getMes(String data) {
        char mes1 = data.charAt(3);
        char mes2 = data.charAt(4);
        return ("" + mes1 + mes2);
    }

    public String getAno(String data) {
        char mes1 = data.charAt(6);
        char mes2 = data.charAt(7);
        char mes3 = data.charAt(8);
        char mes4 = data.charAt(9);
        return ("" + mes1 + mes2 + mes3 + mes4);
    }

    public String getHora() {
        return (hour);
    }
    
    @Override
    public String toString() {
        return(date + hour);
    }

}
