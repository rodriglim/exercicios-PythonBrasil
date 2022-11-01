package decisao;

import label.ClasseJanelas;

public class Exe05 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        String fraseMedia;

        label.setTexto("1ª nota: ");
        double nota1 = Double.parseDouble(label.inputDialog());
        label.setTexto("2ª nota: ");
        double nota2 = Double.parseDouble(label.inputDialog());

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            fraseMedia = "Aprovado com Distinção";
        } else if (media >= 7) {
            fraseMedia = "Aprovado";
        } else {
            fraseMedia = "Reprovado";
        }
        String mediaFormat = String.format("%.1f", media);
        label.setTexto("<html>Média: <html>" + mediaFormat + "<br>" + fraseMedia);
        label.messageDialog();
    }
}
