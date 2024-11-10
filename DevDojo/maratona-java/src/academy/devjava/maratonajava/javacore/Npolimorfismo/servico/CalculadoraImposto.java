package academy.devjava.maratonajava.javacore.Npolimorfismo.servico;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatótio do imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador - "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto: "+imposto);
        System.out.println("Total: "+(computador.getValor()+imposto));

    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatótio do imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador - "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto: "+imposto);
        System.out.println("Total: "+(tomate.getValor()+imposto));

    }
}
