package academy.devjava.maratonajava.javacore.Gassociacao.Test;

import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor professor3 = new Professor("Asuma");

        Professor[] professores = new Professor[]{professor1, professor2, professor3};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();
    }
}
