package academy.devjava.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        float dinheiroDisponivel = 2000.00f;
        float valueIngressos = 75.90f;


        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo a nossa maquina de vendas de ingressos.");
        System.out.println("\nValor do ingresso: $"+valueIngressos);
        System.out.println("Seu saldo disponivel: $"+dinheiroDisponivel);

        System.out.println("\nDigite a quantidade de ingressos para a compra: ");
        int quantidadeCompraIngressos = ler.nextInt();

        float totalDaCompra = quantidadeCompraIngressos * valueIngressos;

        if (totalDaCompra > dinheiroDisponivel){
            System.out.println("Saldo insuficiente para a compra");
        } else {
            float SaldoDisponivelFinal = dinheiroDisponivel - totalDaCompra;
            System.out.println("Muito obrigado.\nIngressos comprados: "+ quantidadeCompraIngressos+ "\nTotal da compra: $"+totalDaCompra+"\nSaldo atual da carteira: $"+SaldoDisponivelFinal);
        }


    }
}
