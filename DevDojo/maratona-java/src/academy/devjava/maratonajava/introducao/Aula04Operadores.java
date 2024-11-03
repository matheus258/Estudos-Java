package academy.devjava.maratonajava.introducao;

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

        String senhaFesta = "Papagaio";
        String segundaSenhaFesta = "Tatu";
        String entradaSenha = "Papagaio";

        if(entradaSenha == senhaFesta || entradaSenha == segundaSenhaFesta){
            System.out.println("\nSua entrada a festa foi altorizada, \nSejá bem-vindo!");

        }


    }



}
