package decisao;

import label.ClasseJanelas;

public class Exe07 {

    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        
        int maior = 0, menor = 999999;

        label.setTexto("1ª número inteiro: ");
        int num1 = Integer.parseInt(label.inputDialog());

        if (num1 > maior) {
            maior = num1;
        }
        if (num1 < menor) {
            menor = num1;
        }

        label.setTexto("1ª número inteiro: ");
        int num2 = Integer.parseInt(label.inputDialog());

        maior = num1 > num2 ? num1 : num2;
        menor = num1 < num2 ? num1 : num2;

        label.setTexto("1ª número inteiro: ");
        int num3 = Integer.parseInt(label.inputDialog());

        if (num3 > maior) {
            maior = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }
        label.setTexto("<html>Maior: <html>" + maior +"<br>" + "<html>Menor: <html>" + menor);
        label.messageDialog();
    }
}
