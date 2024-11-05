package academy.devjava.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjava.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Antonio";
        estudante.idade = 50;
        estudante.sexo = 'M';
        System.out.println(estudante.nome+" "+estudante.idade+" "+estudante.sexo);
    }
}
