package sequencial;

import label.ClasseJanelas;

public class Exe07 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("Lado A: ");
        double ladoA = Double.parseDouble(label.inputDialog());

        double areaQuadrado = Math.pow(ladoA, 2);
        double dobroArea = Math.pow(areaQuadrado, 2);
        String areaFormat = String.format(
                "<html> Área: %.1f" + "<br>"
                + "<html> Dobro da área: %.1f</html>", areaQuadrado, dobroArea);
        label.setTexto(areaFormat);
        label.messageDialog();
    }
}
