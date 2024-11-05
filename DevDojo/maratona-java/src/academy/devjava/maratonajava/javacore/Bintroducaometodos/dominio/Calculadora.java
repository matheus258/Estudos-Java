package academy.devjava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(int num, int num2){
        System.out.println(num + num2);
    }
    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public double dividirDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return 0;
        }
        return num1 / num2;
    }
}
