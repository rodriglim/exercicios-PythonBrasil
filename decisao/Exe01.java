package decisao;

import label.ClasseJanelas;

public class Exe01 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("1ª número: ");
        int n1 = Integer.valueOf(label.inputDialog());
        label.setTexto("2ª número: ");
        int n2 = Integer.valueOf(label.inputDialog());

        String numFormat;
        if (n1 > n2) {
            numFormat = String.format("O maior número é: %d", n1);
        } else if (n1 < n2) {
            numFormat = String.format("O maior número é: %d", n2);
        } else {
            numFormat = String.format("Os números são iguais");
        }
        label.setTexto(numFormat);
        label.messageDialog();
    }
}
