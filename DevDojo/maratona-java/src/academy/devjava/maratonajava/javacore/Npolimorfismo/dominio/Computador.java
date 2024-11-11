package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria.CategoriaPeca;

public class Computador extends  Produto{
    public static final double IMPOSTO_POR_CENTO = 0.25;
    private CategoriaPeca categoria;

    public Computador(String produto, double valor, CategoriaPeca categoria) {
        super(produto, valor);
        this.categoria = categoria;
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public CategoriaPeca getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPeca categoria) {
        this.categoria = categoria;
    }
}
