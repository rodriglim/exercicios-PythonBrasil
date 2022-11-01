package sequencial;

import label.ClasseJanelas;

public class Exe09 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Informe a temperatura em fahrenheit: ");
        double fahrenheit = Double.parseDouble(label.inputDialog());

        double celsius = ((fahrenheit - 32) * 5 / 9);
        String tempFormat = String.format("Temperatura em Celsius: %.1f°C", celsius);
        label.setTexto(tempFormat);
        label.messageDialog();

    }
}
