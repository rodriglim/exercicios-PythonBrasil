package decisao;

import label.ClasseJanelas;

public class Exe21 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Valor para sacar entre R$ 10 - 600: ");
        double valorSacar = Double.parseDouble(label.inputDialog());
        String[] texto = new String[5];
        String textoCompleto = "";
        if ((valorSacar < 10) || (valorSacar > 600)) {
            label.setTexto("Valor não está entre os valores aprovados.");
            label.messageDialog();
        } else {
            int notasCem = (int) valorSacar / 100;
            valorSacar -= notasCem * 100;
            int notasCinquenta = (int) valorSacar / 50;
            valorSacar -= notasCinquenta * 50;
            int notasDez = (int) valorSacar / 10;
            valorSacar -= notasDez * 10;
            int notasCinco = (int) valorSacar / 5;
            valorSacar -= notasCinco * 5;
            int notaUm = (int) valorSacar;

            if (notasCem > 0) {
                texto[0] = "Notas de R$ 100 = " + notasCem;
            }
            if (notasCinquenta > 0) {
                texto[1] = "Notas de R$ 50 = " + notasCinquenta;

            }
            if (notasDez > 0) {
                texto[2] = "Notas de R$ 10 = " + notasDez;
            }
            if (notasCinco > 0) {
                texto[3] = "Notas de R$ 5 = " + notasCinco;
            }
            if (notaUm > 0) {
                texto[4] = "Notas de R$ 1 = " + notaUm;
            }

            if (texto[0] == null) {
                texto[0] = "Notas de R$ 100 = 0";
            }
            if (texto[1] == null) {
                texto[1] = "Notas de R$ 50 = 0";
            }
            if (texto[2] == null) {
                texto[2] = "Notas de R$ 10 = 0";
            }
            if (texto[3] == null) {
                texto[3] = "Notas de R$ 5 = 0";
            }
            if (texto[4] == null) {
                texto[4] = "Notas de R$ 1 = 0";
            }
            textoCompleto = "<html>" + texto[0] + "<br> "
                    + texto[1] + "<br> " + texto[2] + "<br>" + texto[3] + "<br>" + texto[4] + "<html>";
            label.setTexto(textoCompleto);
            label.messageDialog();
        }

    }
}
