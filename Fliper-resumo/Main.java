import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Rebeca");
        nomes.add("Ana Beatriz");

        String[] nomesArr = new String[4];
        nomesArr[0] = "Paula";
        nomesArr[1] = "Jefferson";
        nomesArr[2] = "Vanessa";
        nomesArr[3] = "Carlos";


        for(int i = 0; i < nomes.size(); i++){
            System.out.println("Posição da lista: "+i+" nome: "+ nomes.get(i));
            System.out.println(nomesArr[i]);
        }

        System.out.println("\nTestando o for in");
        for(String x : nomesArr){
            System.out.println(x);
        }

        int contador = 0;
        while(contador < 4){
            if(contador == 0){
                System.out.println("O cachorro ainda não latiu");
                contador ++;
            } else if (contador == 1) {
                System.out.println("O cachorro começou a latir");
                contador ++;
            } else if (contador > 1) {
                System.out.println("O cachorro ja latiu "+contador+ " vezes.");
                contador ++;
            }
        }

        int idadeArquivo = 25;
        String idadeConvertida = String.valueOf(idadeArquivo);

        System.out.println(idadeConvertida.trim());
    }
}

