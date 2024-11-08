package academy.devjava.maratonajava.javacore.Gassociacao.dominio;

public class Profissao {
    private String profissao;

    public void imprime(){
        System.out.println("Profissão: "+this.profissao);
    }

    public Profissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
