package academy.devjava.maratonajava.javacore.Hheranca.Test;

import academy.devjava.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devjava.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devjava.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Miriam alves de Melo");
        endereco.setCep("012345-289");

        Endereco endereco1 = new Endereco();
        endereco1.setRua("One piece Grand Line");
        endereco1.setCep("0056478944");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Hinata");
        pessoa.setCpf("75889468563");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Monkey D. Luffy");
        funcionario.setCpf("8000000");
        funcionario.setEndereco(endereco1);
        funcionario.setSalario(25000);

        pessoa.imprime();
        System.out.println("-------------");
        funcionario.imprime();
        funcionario.relatorioSalario();
    }
}
