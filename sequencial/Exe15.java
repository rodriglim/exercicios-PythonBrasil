package sequencial;

import label.ClasseJanelas;

public class Exe15 {
    
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        final int IR = 11, INSS = 8, SINDICATO = 5;
        
        label.setTexto("Salário-Hora:R$ ");
        double salarioHora = Double.parseDouble(label.inputDialog());
        label.setTexto("Jornada de trabalho mensal: ");
        int horasMensal = Integer.parseInt(label.inputDialog());
        
        double salarioBruto = salarioHora * horasMensal;
        
        double descontoIr = (salarioBruto * IR) / 100;
        double descontoInss = (salarioBruto * INSS) / 100;
        double descontoSindicato = (salarioBruto * SINDICATO) / 100;
        double salarioLiquido = salarioBruto - (descontoIr + descontoInss + descontoSindicato);
        
        String textoFormat = String.format(
                 "<html>Salário Bruto:R$ %.2f" + "<br>"
               + "<html>IR(%d%%):R$ %.2f" + "<br>"
               + "<html>INSS(%d%%):R$ %.2f" + "<br>"
               + "<html>SINDICATO(%d%%):R$ %.2f" + "<br>"
               + "<html>Salário Liquido:R$ %.2f" + "<br>"
                ,salarioBruto,IR, descontoIr, INSS, descontoInss, SINDICATO,
                descontoSindicato, salarioLiquido);
        label.setTexto(textoFormat);
        label.messageDialog();
    }
}
