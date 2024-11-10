package academy.devjava.maratonajava.javacore.Lclassesabstratas.test;

import academy.devjava.maratonajava.javacore.Lclassesabstratas.dominio.Cozinheiro;
import academy.devjava.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devjava.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro("Sanji", 2000);
        Gerente gerente = new Gerente("Zoro", 4500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Matheus", 12000);

        System.out.println(cozinheiro);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }

}
