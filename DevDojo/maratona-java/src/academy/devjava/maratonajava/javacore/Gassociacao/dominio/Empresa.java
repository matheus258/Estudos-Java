package academy.devjava.maratonajava.javacore.Gassociacao.dominio;

public class Empresa {
    private String nome;
    private Profissao[] profissoes = new Profissao[]{};

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Empresa(String nome, Profissao[] profissoes) {
        this.nome = nome;
        this.profissoes = profissoes;
    }

    public void imprime(){
        System.out.println("Empresa: "+ this.nome);
        if (profissoes == null) return;
        for (Profissao profiss : profissoes){
            System.out.println(profiss.getProfissao());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Profissao[] getProfissoes() {
        return profissoes;
    }

}
