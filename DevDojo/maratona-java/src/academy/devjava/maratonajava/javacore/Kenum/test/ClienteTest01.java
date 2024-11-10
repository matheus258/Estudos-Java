package academy.devjava.maratonajava.javacore.Kenum.test;

import academy.devjava.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devjava.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devjava.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Zoro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.PIX);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.PIX.calcularValor(100));
        System.out.println(TipoPagamento.CREDITO.calcularValor(100));
    }
}
