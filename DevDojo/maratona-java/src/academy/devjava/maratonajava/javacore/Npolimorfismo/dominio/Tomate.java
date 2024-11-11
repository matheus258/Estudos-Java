package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio;

import academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria.CategoriaAlimento;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.10;
    public String validade;
    private CategoriaAlimento categoriaAlimento;

    public Tomate(String produto, double valor, CategoriaAlimento categoriaAlimento) {
        super(produto, valor);
        this.categoriaAlimento = categoriaAlimento;
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

    public CategoriaAlimento getCategoriaAlimento() {
        return categoriaAlimento;
    }

    public void setCategoriaAlimento(CategoriaAlimento categoriaAlimento) {
        this.categoriaAlimento = categoriaAlimento;
    }
}
