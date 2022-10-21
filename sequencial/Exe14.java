package sequencial;

import label.ClasseJanelas;

public class Exe14 {

    public static void main(String[] args) {

        final double PESOLIMITE = 50;
        final double PRECO = 4.00;
        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("Peso do Peixe: ");
        double pesoPeixe = Double.parseDouble(label.inputDialog());

        double excessoPeso = pesoPeixe - PESOLIMITE;
        double valorMulta = PRECO * excessoPeso;
        
        String textoFormatado = String.format(
                "<html>Peso: %.1fKg" + "<br>"
              + "<html>Excesso: %.1fKg" + "<br>"
              + "<html>Preço da Multa:R$ %.2f\n" + "<br>"+ "</html>"
                , pesoPeixe, excessoPeso, valorMulta);
        label.setTexto(textoFormatado);
        label.messageDialog();
    }
}
