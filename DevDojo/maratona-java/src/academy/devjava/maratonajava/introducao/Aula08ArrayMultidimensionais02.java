package academy.devjava.maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[1];

        arrayInt[0][0] = 25;
        arrayInt[0][1] = 8;
        arrayInt[1][0] = 15;
        arrayInt[1][1] = 350;
        arrayInt[1][2] = 3;
        arrayInt[2][0] = 10;

        int[][] arrayInt2 = {{0,1},{1,2,3},{5,6,8,10,200}};


        for (int[] valorArray : arrayInt){
            for (int num : valorArray){
                System.out.println(num);
            }
        }

        for (int[] valueArray : arrayInt2){
            for (int num : valueArray){
                System.out.println("Valor: "+ num);
            }
        }
    }
}
