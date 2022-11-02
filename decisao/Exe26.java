package decisao;

import label.ClasseJanelas;

public class Exe26{
    
    public static void main(String[] args) {
        
        String opcao;
        final double precoAlcool = 1.90, precoGasolina = 2.50;
        int valorDesconto;
        double valorPagar = 0;
        ClasseJanelas label = new ClasseJanelas();
        
        label.setTexto("Digite: A - Álcool ou G - Gasolina");
        opcao = label.inputDialog().toUpperCase();
        label.setTexto("Quantos litros foram abstecidos? ");
        double qtdCombustivel = Double.parseDouble(label.inputDialog());
        
        switch(opcao){
            case "A":
                valorPagar = qtdCombustivel * precoAlcool;
                if(qtdCombustivel <= 20){
                    valorDesconto = 3;
                    valorPagar -= (precoAlcool * qtdCombustivel) * valorDesconto / 100;
                    break;
                }else{
                    valorDesconto = 5;
                    valorPagar -= (precoAlcool * qtdCombustivel) *  valorDesconto / 100; 
                    break;
                }
            case "G":
                valorPagar = qtdCombustivel * precoGasolina;
                if(qtdCombustivel <= 20){
                    valorDesconto = 4;
                    valorPagar -= (precoGasolina * qtdCombustivel)  * valorDesconto / 100;
                    break;
                }else{
                    valorDesconto = 6;
                    valorPagar -= (precoGasolina * qtdCombustivel) * valorDesconto / 100;
                    break;
                }        
        }
        
        String valorFormatado = String.format("R$ %.2f", valorPagar);
        label.setTexto("Valor Total:" + valorFormatado);
        label.messageDialog();
        
    }
}
