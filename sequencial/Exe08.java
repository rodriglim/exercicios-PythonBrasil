package sequencial;

import label.ClasseJanelas;

public class Exe08 {

    public static void main(String[] args) {
        ClasseJanelas cj = new ClasseJanelas();
        cj.setTexto("Informe o salário-hora do funcionário: ");
        double salarioHora = Double.parseDouble(cj.inputDialog());
        cj.setTexto("Horas mensal do funcionário: ");
        int horasMensal = Integer.parseInt(cj.inputDialog());
        
        double salarioBruto = salarioHora * horasMensal;
        String salarioFormat = String.format("Salário Bruto:R$ %.2f", salarioBruto);
        cj.setTexto(salarioFormat);
        cj.messageDialog();
    }
}
