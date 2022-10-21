package decisao;

import label.ClasseJanelas;

public class Exe03 {
    
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        String sexo;
        label.setTexto("Digite F ou M: ");
        String letra = String.valueOf(label.inputDialog()).toUpperCase();
        
        switch(letra){
            case "F":
                sexo = "Feminino";
                break;
            case "M":
                sexo = "Masculino";
                break;
            default:
                sexo = "Inválido";
        }
        
        label.setTexto(sexo);
        label.messageDialog();
    }
}
