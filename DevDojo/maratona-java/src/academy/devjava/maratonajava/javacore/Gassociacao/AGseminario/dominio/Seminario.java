package academy.devjava.maratonajava.javacore.Gassociacao.AGseminario.dominio;

public class Seminario {
    private String titulo;
    private String endereco;
    private Aluno[] alunos;

    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.endereco = local;
    }

    public Seminario(String titulo, String local, Aluno[] alunos) {
        this.titulo = titulo;
        this.endereco = local;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("---"+this.titulo+"---");
        System.out.println(this.endereco);
        if (alunos == null) return;
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
