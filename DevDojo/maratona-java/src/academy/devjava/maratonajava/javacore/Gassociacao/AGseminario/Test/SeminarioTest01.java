package academy.devjava.maratonajava.javacore.Gassociacao.AGseminario.Test;

import academy.devjava.maratonajava.javacore.Gassociacao.AGseminario.dominio.Aluno;
import academy.devjava.maratonajava.javacore.Gassociacao.AGseminario.dominio.Professor;
import academy.devjava.maratonajava.javacore.Gassociacao.AGseminario.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Andre", 25);
        Aluno aluno2 = new Aluno("Nathanael Alves", 19);
        Aluno aluno3 = new Aluno("Alice", 20);
        Aluno aluno4 = new Aluno("Joyce", 22);
        Aluno aluno5 = new Aluno("Marcos Antoni", 30);



        Aluno[] alunos = new Aluno[]{aluno1, aluno2,aluno3};
        Aluno[] alunos1 = new Aluno[]{aluno4,aluno5};

        Seminario seminario1 = new Seminario("Programação backend","Campina Grande - PB", alunos);
        Seminario seminario2 = new Seminario("QA","João Pessoa - PB", alunos1);
        aluno1.setSeminario(seminario1);

        Seminario[] seminarios = new Seminario[]{seminario1,seminario2};

        Professor professor = new Professor("Daniel Abella", "Programação em Java", seminarios);

        System.out.println("\nALUNO");
        aluno1.imprime();
        System.out.println("\nSEMINARIO");
        seminario1.imprime();
        seminario2.imprime();
        System.out.println("\nPROFESSOR");
        professor.imprime();
    }
}
