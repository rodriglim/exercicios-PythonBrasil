package decisao;

import label.ClasseJanelas;

public class Exe19 {
    
    public static void main(String[] args) {
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Informe um número inteiro menor que 1000");
        int numeroEscolhido = Integer.parseInt(label.inputDialog());
  
        int c = numeroEscolhido / 100 % 10;
        int d = numeroEscolhido / 10 % 10;
        int u = numeroEscolhido / 1 % 10;
        
        if(c > 0){
            label.setTexto(c + " centena(s), " + d + " dezena(s) e " + u + " unidade(s)");
        }else{
            label.setTexto(d + " dezena(s) e " + u + " unidade(s)");
        }
        label.messageDialog();
    }
}
