package academy.devjava.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultadoDivisao = calculadora.dividirDoisNumeros(0,5);
        calculadora.dividirDoisNumeros(5,0);

//        System.out.println(resultadoDivisao);


    }

}
