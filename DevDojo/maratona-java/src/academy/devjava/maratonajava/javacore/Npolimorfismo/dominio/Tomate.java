package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.10;
    public Tomate(String produto, double valor) {
        super(produto, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando importo da tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
