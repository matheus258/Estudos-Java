package academy.devjava.maratonajava.javacore.Dconstrutores.test;


import academy.devjava.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Nanatsu", "TV", 20, "Ação");
        anime.init("Naruto", "TV", 12, "Ação");
//        anime.setGereno("Ação");
        anime.imprime();
    }
}
