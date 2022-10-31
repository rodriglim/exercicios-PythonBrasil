package decisao;

import label.ClasseJanelas;

public class Exe18 {

    public static void main(String[] args) {

        String[] dataSplit;
        ClasseJanelas label = new ClasseJanelas();
        label.setTexto("Informe uma data(dd/mm/aaaa): ");
        String data = label.inputDialog();

        dataSplit = data.split("/");
        String dataDia = dataSplit[0];
        String dataMes = dataSplit[1];
        String dataAno = dataSplit[2].toUpperCase();

        boolean verificarDia = (Integer.valueOf(dataDia) > 0 || (Integer.valueOf(dataDia) == 31));
        boolean verificarMes = (Integer.valueOf(dataMes) > 0 || (Integer.valueOf(dataMes) == 12));
        boolean verficarAno;
        
        verficarAno = !dataAno.substring(0, 3).matches("[A, Z]*");
        
        if(verificarDia && verificarMes && verficarAno){
            label.setTexto("Data Válida");
        }else{
            label.setTexto("Data Inválida");
        }
        label.messageDialog();
    }
}
