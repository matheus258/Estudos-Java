package academy.devjava.maratonajava.javacore.Csobrecargametodos.test;

import academy.devjava.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");
//        anime.setGereno("Ação");
        anime.imprime();
    }
}
