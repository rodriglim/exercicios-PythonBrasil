package sequencial;

import label.ClasseJanelas;

public class Exe03 {

    public static void main(String[] args) {
 
        ClasseJanelas c = new ClasseJanelas();
        c.setTexto("Informe o primero número: ");
        String n1 = c.inputDialog();
        c.setTexto("Informe o segundo número: ");
        String n2 = c.inputDialog();
        double soma = Double.parseDouble(n1) + Double.parseDouble(n2);
        
        c.setTexto(String.valueOf(soma));
        c.messageDialog();
       
    }
}
