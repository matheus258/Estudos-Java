package academy.devjava.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Bloco de inicialização static funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioSalario(){
        System.out.println("Eu: "+this.nome+ ", recebi o salario de : "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
