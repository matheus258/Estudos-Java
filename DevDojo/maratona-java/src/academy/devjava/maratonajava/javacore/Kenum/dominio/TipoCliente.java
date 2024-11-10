package academy.devjava.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    private String nomeRelacionado;

    TipoCliente(int valor, String nomeRelacionado){
        this.VALOR = valor;
        this.nomeRelacionado = nomeRelacionado;
    }

    public String getNomeRelacionado() {
        return nomeRelacionado;
    }
}
