package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.25;
    public Televisao(String produto, double valor) {
        super(produto, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
