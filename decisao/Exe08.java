package decisao;

import label.ClasseJanelas;

public class Exe08 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("Preço do 1ª produto:R$ ");
        double produto1 = Double.parseDouble(label.inputDialog());
        label.setTexto("Preço do 2ª produto:R$ ");
        double produto2 = Double.parseDouble(label.inputDialog());

        double menorPreco = produto1 < produto2 ? produto1 : produto2;

        label.setTexto("Preço do 3ª produto:R$ ");
        double produto3 = Double.parseDouble(label.inputDialog());

        if (produto3 < menorPreco) {
            String valorForm = String.format("%.2f", produto3);
            label.setTexto("R$ " + valorForm + " é o mais barato");
        } else {
            String valorForm = String.format("%.2f", menorPreco);
            label.setTexto("R$ " + valorForm + " é o mais barato");
        }
        label.messageDialog();
    }
}
