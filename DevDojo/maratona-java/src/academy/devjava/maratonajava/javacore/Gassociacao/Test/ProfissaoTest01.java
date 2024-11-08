package academy.devjava.maratonajava.javacore.Gassociacao.Test;

import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Empresa;
import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Profissao;

public class ProfissaoTest01 {
    public static void main(String[] args) {
        Profissao profissao1 = new Profissao("Desenvolvedor");
        Profissao profissao2 = new Profissao("QA");
        Profissao profissao3 = new Profissao("DBA");

        Profissao[] profissoes = new Profissao[]{profissao1, profissao2, profissao3};

        Empresa empresa = new Empresa("MM LTS", profissoes);
        empresa.imprime();

    }
}
