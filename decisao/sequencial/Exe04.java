package sequencial;

import label.ClasseJanelas;

public class Exe04 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("1ª nota: ");
        double n1 = Double.parseDouble(label.inputDialog());
        label.setTexto("2ª nota: ");
        double n2 = Double.parseDouble(label.inputDialog());
        label.setTexto("3ª nota: ");
        double n3 = Double.parseDouble(label.inputDialog());
        label.setTexto("4ª nota: ");
        double n4 = Double.parseDouble(label.inputDialog());
        
        double m = (n1 + n2 + n3 + n4) / 4;
        String mediaFormat = String.format("Média: %.1f", m);
        label.setTexto(mediaFormat);
        label.messageDialog();
    }
}
