package academy.devjava.maratonajava.javacore.Gassociacao.Test;

import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devjava.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romario");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);

        jogador1.imprime();
    }
}
