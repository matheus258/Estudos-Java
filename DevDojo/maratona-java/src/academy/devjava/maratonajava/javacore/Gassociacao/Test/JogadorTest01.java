package academy.devjava.maratonajava.javacore.Gassociacao.Test;

import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lionel Messi");
        Jogador jogador2 = new Jogador("Pele");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
