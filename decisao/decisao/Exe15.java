package decisao;

import label.ClasseJanelas;

public class Exe15 {
    
    public static void main(String[] args) {
        
        ClasseJanelas label = new ClasseJanelas();
        
        boolean formaTriangulo, isosceles, equilatero;
        double l1, l2, l3;
        String texto;
        
        label.setTexto("Primeiro lado");
        l1 = Double.parseDouble(label.inputDialog());
        label.setTexto("Segundo lado");
        l2 = Double.parseDouble(label.inputDialog());
        label.setTexto("Terceiro lado");
        l3 = Double.parseDouble(label.inputDialog());

        formaTriangulo = (((l1 + l2) > l3) && ((l2 + l3) > l1) && (l1 + l3) > l2);
        equilatero = ((l1 == l2) && (l2 == l3));
        isosceles = ((l1 == l2) || (l2 == l3) || (l1 == l3));

       

        if (formaTriangulo == true) {
            if (equilatero == true) {
                texto = "Triângulo Equilátero";
            } else if (isosceles == true) {
                texto = "Triângulo Isósceles";
            } else {
                texto = "Triângulo Escaleno";
            }
        } else {
            texto = "Não forma triângulo!";
        }
        label.setTexto(texto);
        label.messageDialog();
    }
}
