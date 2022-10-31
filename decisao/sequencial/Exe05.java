package sequencial;

import label.ClasseJanelas;

public class Exe05 {
    
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        label.setTexto("Digite o valor em metros: ");
        float metros = Float.parseFloat(label.inputDialog());
        float centimetros = metros * 100;
        label.setTexto(String.valueOf("Centímetros: " + centimetros + "cm"));
        label.messageDialog();
        
    }
}
