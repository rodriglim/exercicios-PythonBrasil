package decisao;

import label.ClasseJanelas;

public class Exe04 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        String result;

        label.setTexto("Informe uma letra");
        String letra = String.valueOf(label.inputDialog()).toUpperCase();

        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                result = "Vogal";
                break;
            default:
                result = "Consoante";
        }
        
        label.setTexto(letra + "-" + result );
        label.messageDialog();
    }
}
