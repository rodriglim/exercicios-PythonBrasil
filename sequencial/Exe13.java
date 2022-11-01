package sequencial;

import label.ClasseJanelas;

public class Exe13 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("Digite sua altura: ");
        float altura = Float.parseFloat(label.inputDialog());

        float pesoIdealMasculino = (float) (72.7 * altura) - 58;
        float pesoIdealFeminino = (float) ((62.1 * altura) - 44.7);
        String pesoFormat = String.format(
                "<html>Peso Ideal - Masculino: %.1fKg" + "<br>"
                + "Peso Ideal - Feminino: %.1fKg </html>",
                 pesoIdealMasculino, pesoIdealFeminino);

        label.setTexto(pesoFormat);
        label.messageDialog();

    }
}
