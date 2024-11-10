package academy.devjava.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    private final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDDE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
