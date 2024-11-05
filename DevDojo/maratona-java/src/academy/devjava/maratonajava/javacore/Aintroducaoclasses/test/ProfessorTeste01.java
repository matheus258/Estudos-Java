package academy.devjava.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjava.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.idade = 60;
        professor.sexo = 'M';

//        System.out.println("Nome do professor: "+ professor.nome+ "\nIdade: "+ professor.idade+"\nSexo: "+professor.sexo);
        System.out.println(professor.mostrar());
    }
}
