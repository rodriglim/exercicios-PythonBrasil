package decisao;

import label.ClasseJanelas;

public class Exe25 {

    public static void main(String[] args) {

        ClasseJanelas label = new ClasseJanelas();
        int qtdPositivos = 0;
        
        String resposta, resultado;

        label.setTexto("Telefonou para a vítima[S/N]?");
        resposta = label.inputDialog().toUpperCase();
        if (resposta.equals("S")) {
            qtdPositivos++;
        }
        label.setTexto("Esteve no local do crime[S/N]?");
        resposta = label.inputDialog().toUpperCase();
        if (resposta.equals("S")) {
            qtdPositivos++;
        }
        label.setTexto("Mora perto da vítima?[S/N]?");
        resposta = label.inputDialog().toUpperCase();
        if (resposta.equals("S")) {
            qtdPositivos++;
        }
        label.setTexto("Devia para a vítima?[S/N]?");
        resposta = label.inputDialog().toUpperCase();
        if (resposta.equals("S")) {
            qtdPositivos++;
        }
        label.setTexto("Já trabalhou com a vítima?[S/N]?");
        resposta = label.inputDialog().toUpperCase();
        if (resposta.equals("S")) {
            qtdPositivos++;
        }
        
        switch(qtdPositivos){
            case 2:
                resultado = "Suspeita";
                break;
            case 3: case 4:
                resultado = "Cúmplice";
                break;
            case 5:
                resultado = "Assassino";
                break;
            default:
                resultado = "Inocente";
        }
        label.setTexto(resultado);
        label.messageDialog();
    }
}
