package decisao;

import label.ClasseJanelas;

public class Exe22 {
    
    public static void main(String[] args){
        
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Informe um número inteiro: ");
        try {
            int numero = Integer.parseInt(label.inputDialog());
            if(numero % 2 == 0){
                label.setTexto("Número é Par");
            }else{
                label.setTexto("Número é Ímpar");
            }
        } catch (Exception e) {
            label.setTexto("Informe um número inteiro");
        }
        
        label.messageDialog();
    }
}
