package academy.devjava.maratonajava.javacore.Npolimorfismo.servico;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){

        System.out.println("Relatótio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto - "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto: "+imposto);
        System.out.println("Total: "+(produto.getValor()+imposto));
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Categoria: "+tomate.getCategoriaAlimento());
            System.out.println("Validade: "+tomate.getValidade());
        }
        if (produto instanceof  Computador){
            Computador computador = (Computador) produto;
            System.out.println("Categoria: "+computador.getCategoria());
        }


    }
}
