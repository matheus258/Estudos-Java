package academy.devjava.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.Diretor;

public class DiretorTest01 {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        diretor.setIdade(25);
        diretor.setNome("Vanessa");

        diretor.imprime();
    }
}
