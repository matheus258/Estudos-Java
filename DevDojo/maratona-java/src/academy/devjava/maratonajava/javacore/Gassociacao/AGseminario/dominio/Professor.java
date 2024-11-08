package academy.devjava.maratonajava.javacore.Gassociacao.AGseminario.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("---Professor---");
        System.out.println("Nome: " +this.nome+" especialidade: "+this.especialidade);
        if (seminarios == null) return;
        System.out.println("---Seminario(s)---");
        for (Seminario seminario: seminarios){
            System.out.println(seminario.getTitulo());
        }
    }

}
