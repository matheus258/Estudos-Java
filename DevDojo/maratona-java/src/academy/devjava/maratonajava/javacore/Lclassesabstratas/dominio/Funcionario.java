package academy.devjava.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public abstract void calculaBonus();

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

}
