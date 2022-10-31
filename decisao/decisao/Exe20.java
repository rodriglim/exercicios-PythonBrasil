package decisao;

import label.ClasseJanelas;

public class Exe20 {
    
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("1ª nota: ");
        double nota1 = Double.parseDouble(label.inputDialog());
        label.setTexto("2ª nota: ");
        double nota2 = Double.parseDouble(label.inputDialog());
        label.setTexto("3ª nota: ");
        double nota3 = Double.parseDouble(label.inputDialog());
        double media = ((nota1 + nota2 + nota3) / 3);
        String mediaFormatada = String.format("%.1f", media);
        
        boolean mediaAprovado = media >= 7;
        
        if (mediaAprovado) {
            if (media == 10) {
                label.setTexto("<html>Aprovado com Distinção<html>" + "<br>" + mediaFormatada);
            } else {
                label.setTexto("<html>Aprovado<html>" + "<br>" + mediaFormatada);
            }
        } else {
            label.setTexto("<html>Reprovado<html>" + "<br>" + mediaFormatada);
        }
        
        label.messageDialog();
    }
}
