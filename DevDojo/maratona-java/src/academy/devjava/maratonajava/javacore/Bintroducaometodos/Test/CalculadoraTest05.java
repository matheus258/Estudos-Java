package academy.devjava.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] arrayNumeros = {1,5,6,7,8,200};
        int[] arrayNumeros2 = new int[5];

        calculadora.somaArray(arrayNumeros);

        calculadora.somaVarArgs(5,5,8,9,50,150);
    }
}
