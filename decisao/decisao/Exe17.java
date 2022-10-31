package decisao;

import label.ClasseJanelas;

class Exe17{
    
    public static void main(String[] args){
        
        ClasseJanelas label = new ClasseJanelas();
        label.setTexto("Informe um ano");
        int ano = Integer.parseInt(label.inputDialog());
        
        boolean verificarbissexto = (ano % 400 == 0) || (ano % 4 == 0);
        
        if(verificarbissexto){
            label.setTexto("Ano é Bissexto");
        }else{
            label.setTexto("Ano não é Bissexto");
        }
        
        label.messageDialog();
    }
}