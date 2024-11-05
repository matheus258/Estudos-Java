package academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void mostrarDados(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade);
        System.out.println("Salarios: ");
        for (double salario: salarios){
            System.out.print("$"+salario+ " ");
        }
    }

    public void mediaSalarial(){
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario : this.salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: $"+media);

    }
}
