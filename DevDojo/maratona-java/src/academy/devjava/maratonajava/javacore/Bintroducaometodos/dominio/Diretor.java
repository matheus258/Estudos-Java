package academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Diretor {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String name){
        if (name.isEmpty()){
            return;
        }
        this.nome = name;
    }
    public void  setIdade(int idade){
        if(idade < 0){
            return;
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }
}
