package academy.devjava.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 5;
        idades[1] = 25;
        idades[2] = 9;

        System.out.println(idades[0]);

        String[] nomesPersonagens = new String[4];
        nomesPersonagens[0] = "Miles Morales";
        nomesPersonagens[1] = "Luffy D.";
        nomesPersonagens[2] = "Jiraya";
        nomesPersonagens[3] = "Naruto";

        for (int i = 0; i < nomesPersonagens.length; i++) {
            System.out.println(nomesPersonagens[i]);
        }
    }
}
