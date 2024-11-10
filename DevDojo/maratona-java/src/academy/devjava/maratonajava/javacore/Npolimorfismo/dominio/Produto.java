package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String produto, double valor) {
        this.nome = produto;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
