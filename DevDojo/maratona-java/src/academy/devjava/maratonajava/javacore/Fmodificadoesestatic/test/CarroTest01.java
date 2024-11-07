package academy.devjava.maratonajava.javacore.Fmodificadoesestatic.test;

import academy.devjava.maratonajava.javacore.Fmodificadoesestatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(225);
        Carro c1 = new Carro("BMW", 288);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Mitsubshi", 270);


        c1.imprime();
        c2.imprime();
        c3.imprime();

    }


}
