package decisao;

import label.ClasseJanelas;

public class Exe06 {

    public static void main(String[] args) {
        int maior;
        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("1ª número inteiro: ");
        int numero1 = Integer.parseInt(label.inputDialog());
        label.setTexto("2ª número inteiro: ");
        int numero2 = Integer.parseInt(label.inputDialog());

        maior = numero1 > numero2 ? numero1 : numero2;

        label.setTexto("3ª número inteiro: ");
        int numero3 = Integer.parseInt(label.inputDialog());

        if (numero3 > maior) {
            label.setTexto("Maior número " + numero3);
        } else {
            label.setTexto("Maior número " + maior);
        }
        label.messageDialog();
    }
}
