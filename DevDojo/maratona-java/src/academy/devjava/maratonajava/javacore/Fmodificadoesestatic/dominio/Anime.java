package academy.devjava.maratonajava.javacore.Fmodificadoesestatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Bloco de inicializacao...");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime() {
//        System.out.println(episodios);
        for ( int ep : Anime.episodios){
            System.out.print("Episodio: "+ ep +" ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
