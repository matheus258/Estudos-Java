package academy.devjava.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devjava.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("One piece");

        for (int ep : anime.getEpisodios()){
            System.out.print(ep+" ");
        }
    }
}
