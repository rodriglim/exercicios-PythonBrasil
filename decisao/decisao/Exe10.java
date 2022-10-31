package decisao;

import label.ClasseJanelas;

public class Exe10 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        label.setTexto("Informe M, V ou N");
        String letra = label.inputDialog().toUpperCase();

        switch (letra) {
            case "M":
                label.setTexto("Bom dia");
                break;
            case "V":
                label.setTexto("Boa tarde");
                break;
            case "N":
                label.setTexto("Boa noite");
                break;
            default:
                label.setTexto("Inválido");
        }
        
        label.messageDialog();
    }
}
