package academy.devjava.maratonajava.javacore.Npolimorfismo.test;

import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devjava.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("TECNi9-22", 15000);
        Tomate tomate = new Tomate("Tomate italiano", 15);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
