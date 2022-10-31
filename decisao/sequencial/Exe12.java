package sequencial;

import label.ClasseJanelas;

public class Exe12 {
    
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Informe a sua altura");
        float altura = Float.parseFloat(label.inputDialog());
        float pesoIdeal = (float) (72.7 * altura) - 58;
        
        String pesoFormat = String.format("Peso Ideal: %.1fKg", pesoIdeal);
        label.setTexto(pesoFormat);
        label.messageDialog();
    }
}
