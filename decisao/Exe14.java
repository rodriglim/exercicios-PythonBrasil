package decisao;

import label.ClasseJanelas;

public class Exe14 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();

        String conceito = null;
        
        label.setTexto("1ª nota: ");
        double nota1 = Double.parseDouble(label.inputDialog());
        label.setTexto("2ª nota: ");
        double nota2 = Double.parseDouble(label.inputDialog());
        double media = (nota1 + nota2) / 2;

        if (media <= 4) {
            conceito = "E";
        } else if (media < 6) {
            conceito = "D";
        } else if (media < 7.5) {
            conceito = "C";
        } else if (media < 9) {
            conceito = "B";
        } else {
            conceito = "A";
        }
        
        String mediaFormatada = String.format("%.1f", media);
        label.setTexto("<html>Conceito: " + conceito + "<br>" + "Média: " + mediaFormatada);
        label.messageDialog();
    }
}
