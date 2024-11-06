package academy.devjava.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(50);
        funcionario.setSalarios(new double[]{1500,1800.50,1456});

        funcionario.mostrarDados();
        funcionario.mediaSalarial();
    }
}
