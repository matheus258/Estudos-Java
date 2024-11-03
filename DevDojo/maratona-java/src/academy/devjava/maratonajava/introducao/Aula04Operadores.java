package academy.devjava.maratonajava.introducao;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        System.out.println("SOMA - Valor: "+ (numero01 + numero02));

        // Exemplo de como usar o operador % (resto)
        int numero03 = 20;

        if (numero03 % 2 == 0 ){
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é ímpar");
        }

        // < > <= >=

        if(numero03 > numero02 ){
            System.out.println("O número "+ numero03+ " é maior que o número "+ numero02);
        } else if (numero03 < numero02) {
            System.out.println("O número "+ numero03+ " é menor que o número "+ numero02);
        } else if (numero03 == numero02) {
            System.out.println("O número "+ numero03+ " é igual ao número "+ numero02);
        }

        //  Lógicos AND, todas as condicoes precisam ser true

        if(numero03 > numero01 & numero03 != numero02 ){
            System.out.println("\nO número "+numero03+" é maior que o número "+numero01+" e diferente do número "+ numero02);
        } else if (numero03 > numero01 & numero03 == numero02) {
            System.out.println("\nO número "+numero03+" é maior que o número "+numero01+" e igual ao número "+ numero02);
        }

        // Lógicos AND, todas as condicoes precisam ser true

        String senhaFesta = "doces";
        String senhaFesta2 = "aranha";
        Byte tetativasEntrada = 3;
        boolean acompanhado = false;

        Scanner ler = new Scanner(System.in);


        System.out.println("\nSeja bem vindo a festa de halloween, para entrar diga a senha secreta.\nVocê so tem três tentativas.\nCaso esteja acompanhado você e seu parceiro pode falar duas opções diferentes por entrada ");
        System.out.println("\nVocê esta acompanhado? Se estiver digite 'Sim'");
        String verificaAcompanhado = ler.next();

        if (verificaAcompanhado.equalsIgnoreCase("Sim")){
            acompanhado = true;
        }
        while(tetativasEntrada != 0){

            if(acompanhado){
                System.out.println("Digite a primeira senha: ");
                String senhaCasal1 = ler.next();
                System.out.println("Digite a segunda senha: ");
                String senhaCasal2 = ler.next();

                if (senhaCasal1.trim().equals(senhaFesta) || senhaCasal1.trim().equals(senhaFesta2) || senhaCasal2.trim().equals(senhaFesta) || senhaCasal2.trim().equals(senhaFesta2) ){
                    System.out.println("\nSuas entradas para a festa foram autorizadas, \nSejam bem-vindos!");
                    tetativasEntrada = 0;
                } else {
                    tetativasEntrada --;
                    System.out.println("\nSenha incorreta, você possui: "+ tetativasEntrada+ " tentativas.");
                }
            } else {
                System.out.println("Digite a senha secreta: ");
                String senhaPessoal = ler.next();
                if(senhaPessoal.trim().equals(senhaFesta) || senhaPessoal.trim().equals(senhaFesta2)){
                    System.out.println("\nSua entrada a festa foi autorizada, \nSejá bem-vindo!");
                    tetativasEntrada = 0;
                } else {
                    tetativasEntrada --;
                    System.out.println("\nSenha incorreta, você possui: "+ tetativasEntrada+ " tentativas.");
                }
            }
        }

    }

}
