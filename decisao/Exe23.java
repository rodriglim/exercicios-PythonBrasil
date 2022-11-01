package decisao;

import label.ClasseJanelas;

public class Exe23 {
    
    public static void main(String[] args){
        
        ClasseJanelas label = new ClasseJanelas();
        
        boolean numeroInteiro = false;
        
        label.setTexto("Informe um número");
        try {
            double numeroInformado = Double.parseDouble(label.inputDialog());
            numeroInteiro = Math.floor(numeroInformado) == numeroInformado;
            
            if(numeroInteiro){
                label.setTexto("Número Inteiro");
            }else{
                label.setTexto("Número Decimal");
            }
            
        } catch (Exception e) {
            label.setTexto("Informar número(Obs: No lugar da vírgula, usar ponto!)");
        }
        
        label.messageDialog();
       
    }
}
