package decisao;

import label.ClasseJanelas;

public class Exe12 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        final int IR = 5, INSS = 10, FGTS = 11;

        label.setTexto("Informe o salário-hora:R$ ");
        double salarioHora = Double.parseDouble(label.inputDialog());
        label.setTexto("Informe a jornada de trabalho: ");
        int cargaHoraria = Integer.parseInt(label.inputDialog());
        
        
        double salarioBruto = salarioHora * cargaHoraria;
        double primeiroDesconto = (salarioBruto * IR) / 100;
        double segundoDesconto = (salarioBruto * INSS) / 100;
        double terceiroDesconto = (salarioBruto * FGTS) / 100;
        double totalDesconto = primeiroDesconto + segundoDesconto;
        double salarioLiquido = salarioBruto - totalDesconto;
        
       String valoresFormat = String.format("<html>Salário antigo:R$ %.2f" + "<br>"
               + "IR(%d%%):R$ %.2f" + "<br>"
               + "INSS(%d%%):R$ %.2f" + "<br>"
               + "FGTS(%d%%):R$ %.2f" + "<br>" 
               + "Total de Desconto:R$ %.2f" + "<br>"
               + "Salário Liquido:R$ %.2f" + "<br>"
               , salarioBruto, IR, primeiroDesconto, INSS, segundoDesconto,  
               FGTS, terceiroDesconto, totalDesconto, salarioLiquido);
       
       label.setTexto(valoresFormat);
       label.messageDialog();
    }
}
