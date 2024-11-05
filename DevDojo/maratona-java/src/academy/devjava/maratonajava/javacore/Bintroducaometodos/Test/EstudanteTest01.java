package academy.devjava.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 17;
        estudante01.sexo = 'M';
        impressora.imprime(estudante01);

        estudante02.nome = "Nico Robin";
        estudante02.idade = 25;
        estudante02.sexo = 'F';
        impressora.imprime(estudante02);
    }
}
