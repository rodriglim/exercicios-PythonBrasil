package decisao;

import label.ClasseJanelas;

public class Exe11 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        int aumento = 0;

        label.setTexto("Informe o salário do colaborador:R$ ");
        double salario = Double.parseDouble(label.inputDialog());
        if (salario <= 280) {
            aumento = 20;
        } else if (salario <= 700) {
            aumento = 15;
        } else if (salario <= 1500) {
            aumento = 10;
        } else {
            aumento = 5;
        }

        double valorAumento = (salario * aumento) / 100;
        double novoSalario = salario + valorAumento;
        String valoresFormat = String.format("<html>Salário antigo:R$ %.2f" + "<br>"
                + "Percentual:%d%%" + "<br>" + "Valor do aumento:R$ %.2f" + "<br>"
                + "Novo salário:R$ %.2f<html>" + "<br>",
                salario,aumento, valorAumento, novoSalario);
        label.setTexto(valoresFormat);
        label.messageDialog();
    }
}
