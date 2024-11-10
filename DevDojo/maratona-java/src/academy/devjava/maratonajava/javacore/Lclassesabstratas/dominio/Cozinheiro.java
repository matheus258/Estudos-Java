package academy.devjava.maratonajava.javacore.Lclassesabstratas.dominio;

public class Cozinheiro extends Funcionario{
    public Cozinheiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {

    }

    @Override
    public String toString() {
        return "Cozinheiro{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
