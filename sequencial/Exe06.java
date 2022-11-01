package sequencial;

import label.ClasseJanelas;

public class Exe06 {

    public static void main(String[] args) {

        ClasseJanelas cj = new ClasseJanelas();

        cj.setTexto("Informe o raio do círculo: ");
        double raio = Double.parseDouble(cj.inputDialog());
        double area = Math.pow(raio, 2) * 3.14;

        String areaFormat = String.format("Área do Círculo: %.1f cm²", area);
        cj.setTexto(areaFormat);
        cj.messageDialog();
    }
}
