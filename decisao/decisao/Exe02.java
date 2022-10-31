package decisao;

import label.ClasseJanelas;

public class Exe02 {
   
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        label.setTexto("Informe um número");
        int  n = Integer.parseInt(label.inputDialog());
        
        if(n == 0){
            label.setTexto(n + " - Número nulo");
        }else if(n < 0){
            label.setTexto(n + " - Número negativo");
        }else{
            label.setTexto(n + " - Número positivo");
        }
        
        label.messageDialog();
    }
}
