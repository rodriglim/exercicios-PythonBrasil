package decisao;

import label.ClasseJanelas;

public class Exe24 {

    public static void main(String[] args) {
        ClasseJanelas label = new ClasseJanelas();

        double resultado = 0;
        String operacao, textoPar, textoInteiro, textoNegativo;

        try {

            label.setTexto("1ª número: ");
            double num1 = Double.parseDouble(label.inputDialog());
            label.setTexto("2ª número");
            double num2 = Double.parseDouble(label.inputDialog());
            boolean verificarInteiro = ((Math.floor(num1) == num1) && (Math.floor(num2) == num2));
            boolean verificarNegativo = ((num1 < num2) || (num1 < 0) || (num2 < 0));

            label.setTexto("<html>Qual Operação deseja: " + "<br>" + "Soma" + "<br>" + "Subtração"
                    + "<br>" + "Multiplicação" + "<br>" + "Divisão<html>");
            operacao = label.inputDialog().toUpperCase();

            switch (operacao) {
                case "SOMA":
                    resultado = num1 + num2;
                    break;
                case "SUBTRAÇÃO":
                    resultado = num1 - num2;
                    break;
                case "MULTIPLICAÇÃO":
                    resultado = num1 * num2;
                    break;
                case "DIVISÃO":
                    resultado = num1 / num2;
                    break;
            }
            boolean verificarImpar = ((resultado % 2 == 0) || (resultado % 2 == 0)
                    || (resultado % 2 == 0) || (resultado % 2 == 0));

            if (verificarImpar) {
                textoPar = "Par";
            } else {
                textoPar = "Ímpar";
            }

            if (verificarNegativo) {
                textoNegativo = "Negativo";
            } else {
                textoNegativo = "Positivo";
            }

            if (verificarInteiro) {
                int valorFormatado = (int) Math.floor(resultado);
                textoInteiro = "Inteiro";
            } else {
                textoInteiro = "Decimal";
            }
            label.setTexto("<html>" + textoPar + "<br>" + textoNegativo
                    + "<br>" + textoInteiro + "<html>");

        } catch (NumberFormatException e) {
            label.setTexto("Informações Inválidas");
        }

        label.messageDialog();

    }
}
