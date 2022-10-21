package sequencial;

import label.ClasseJanelas;

public class Exe11 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("1ª número inteiro: ");
        int n1 = Integer.valueOf(label.inputDialog());
        label.setTexto("2ª número inteiro: ");
        int n2 = Integer.valueOf(label.inputDialog());
        label.setTexto("3ª número real: ");
        double n3 = Double.parseDouble(label.inputDialog());

        double produto = ((n1 * 2) * (double) n2 / 2);
        double soma = ((n1 * 3) + n3);
        double elevado = Math.pow(n3, 3);

        String produtoFormat = String.format(
                "<html>Produto: %.1f" + "<br>" + "Soma: %.1f" + "<br>" + "Elevado: %.1f</html>", produto,soma, elevado  
        );
        label.setTexto(produtoFormat);
        label.messageDialog();
    }
}
