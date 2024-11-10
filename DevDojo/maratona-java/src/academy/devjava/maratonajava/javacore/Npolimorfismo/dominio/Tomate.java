package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.10;
    public String validade;

    public Tomate(String produto, double valor) {
        super(produto, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
