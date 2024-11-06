package academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

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
        for (double salario : this.salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: $"+media);

    }
}
