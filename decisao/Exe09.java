package decisao;

import label.ClasseJanelas;

public class Exe09 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("1ª número inteiro: ");
        int num1 = Integer.parseInt(label.inputDialog());
        label.setTexto("2ª número inteiro: ");
        int num2 = Integer.parseInt(label.inputDialog());

        int maior = num1 > num2 ? num1 : num2;
        int menor = num1 < num2 ? num1 : num2;

        label.setTexto("3ª número inteiro: ");
        int num3 = Integer.parseInt(label.inputDialog());

        if (num3 > maior) {
            label.setTexto("<html>Ordem decrescente: <html>" + "<br>" + num3 + " - " + maior + " - " + menor);
        } else if (num3 >= menor) {
            label.setTexto("<html>Ordem decrescente: <html>" + "<br>" + maior + " - " + num3 + " - " + menor);

        } else {
            label.setTexto("<html>Ordem decrescente: <html>" + "<br>" + maior + " - " + menor + " - " + num3);
        }
        label.messageDialog();
    
    }
}
