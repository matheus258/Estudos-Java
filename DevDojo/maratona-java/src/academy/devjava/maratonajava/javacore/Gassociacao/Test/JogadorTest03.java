package academy.devjava.maratonajava.javacore.Gassociacao.Test;

import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kaka");
        Jogador jogador2 = new Jogador("Ronaldinho");
        Jogador jogador3 = new Jogador("Alexandre Pato");
        Jogador jogador4 = new Jogador("Maldine");
        Jogador jogador5 = new Jogador("Seedorf");
        Jogador jogador6 = new Jogador("Zambrota");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3,jogador4,jogador5,jogador6};
        Time time = new Time("Milan");

        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador1.imprime();
        System.out.println("---Time---");
        time.imprime();
    }
}
