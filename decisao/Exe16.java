package decisao;

import label.ClasseJanelas;

public class Exe16 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("Digite o valor de a: ");
        float a = Float.parseFloat(label.inputDialog());
        if (a == 0) {
            label.setTexto("A equação não é de segundo grau!");
        } else {
            label.setTexto("Digite o valor de b: ");
            float b = Float.parseFloat(label.inputDialog());
            label.setTexto("Digite o valor de c: ");
            float c = Float.parseFloat(label.inputDialog());
            float delta = (float) Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                label.setTexto("A equação não possui raízes reais");
            } else if (delta == 0) {
                float X1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                label.setTexto("Possui apenas uma raiz" + X1);
            } else {
                float X1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float X2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                label.setTexto("<html>Raizes:" + "<br>" + "X1: " + X1 + "<br>"
                        + "<html>X2: " + X2);
            }
        }
        label.messageDialog();
    }
}
