package sequencial;

import javax.swing.JOptionPane;
import label.ClasseJanelas;

public class Exe02 {

    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        String numero = JOptionPane.showInputDialog(null, "Informe um número");
        label.setTexto(numero);
        label.messageDialog();

    }
}
