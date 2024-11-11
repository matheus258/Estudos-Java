package academy.devjava.maratonajava.javacore.Npolimorfismo.test;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria.CategoriaAlimento;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria.CategoriaPeca;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devjava.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("TECNi9-22", 15000, CategoriaPeca.HARDWARE);
        Tomate tomate = new Tomate("Tomate italiano", 15, CategoriaAlimento.VEGETAIS);
        Televisao tv = new Televisao("LG 55\" Smart OLED", 2000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
