package academy.devjava.maratonajava.javacore.Npolimorfismo.test;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria.CategoriaAlimento;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria.CategoriaPeca;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devjava.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Sansung 43\" 4k", 1800);
        Tomate tomate = new Tomate("Tomate americano", 10, CategoriaAlimento.VEGETAIS);
        Computador computador = new Computador("AMD5-V12", 5500, CategoriaPeca.HARDWARE);
        tomate.setValidade("14/12/2024");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(computador);
    }
}
