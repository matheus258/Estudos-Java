package academy.devjava.maratonajava.javacore.Npolimorfismo.dominio.categoria;

public enum CategoriaAlimento {
    BEBIDAS,
    COMIDAS,
    SNACKS,
    SOBREMESAS,
    FRIOS,
    CONGELADOS,
    LATICINIOS,
    CEREAIS,
    VEGETAIS,
    FRUTAS;

    @Override
    public String toString() {
        // Retorna o nome da categoria em um formato mais amigável
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

}
