package sequencial;

import label.ClasseJanelas;

public class Exe10 {

    public static void main(String[] args) {
        ClasseJanelas label = new ClasseJanelas();

        label.setTexto("Informe a temperatura em Celsius: ");
        double tempCelsius = Double.parseDouble(label.inputDialog());

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
        String tempFormat = String.format("Temperatura em Fahrenheit: %.1f°F", tempFahrenheit);
        label.setTexto(tempFormat);
        label.messageDialog();
    }
}
