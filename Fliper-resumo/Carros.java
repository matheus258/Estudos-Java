public class Carros {
    public static void main(String[] args) {
        Carro jetta = new Carro("Jetta", "Branco", 2020);
        Carro bmw = new Carro("BMW", "Azul", 2024);
        Carro fusca = new Carro("Fusca", "Preto", 1980);

        bmw.acelerar();
        bmw.sobreCarro();
    }
}

class Carro {
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println("Acelerando carro " + this.modelo);
    }
    public void sobreCarro() {
        System.out.println("\nCarro no modelo: " + this.modelo + "\nCor: "+ this.cor + "\nFabricado no ano: "+ this.ano);
    }
}