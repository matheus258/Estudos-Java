package academy.devjava.maratonajava.javacore.Npolimorfismo.test;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devjava.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Sansung 43\" 4k", 1800);
        Tomate tomate = new Tomate("Tomate americano", 10);
        tomate.setValidade("14/12/2024");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
