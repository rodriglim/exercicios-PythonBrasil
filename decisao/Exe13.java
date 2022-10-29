package decisao;

import label.ClasseJanelas;

public class Exe13 {
    
    public static void main(String[] args){
        
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Digite um número entre 1 a 7: ");
        double num = Double.parseDouble(label.inputDialog());

        if (Math.floor(num) == (num)) {
            int dia = (int) Math.floor(num);
            switch (dia) {
                case 1:
                    label.setTexto("Domingo");
                    break;
                case 2:
                    label.setTexto("Segunda-Feira");
                    break;
                case 3:
                    label.setTexto("Terça-Feira");
                    break;
                case 4:
                    label.setTexto("Quarta-Feira");
                    break;
                case 5:
                    label.setTexto("Quinta-Feira");
                    break;
                case 6:
                    label.setTexto("Sexta-Feira");
                    break;
                case 7:
                    label.setTexto("Sábado");
                    break;
                default:
                    label.setTexto("Inválido");
                    break;
            }
        } else {
            label.setTexto("Informe um número inteiro");
        }

        label.messageDialog();
    }
}
