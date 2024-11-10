package academy.devjava.maratonajava.javacore.Minterfaces.test;

import academy.devjava.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devjava.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devjava.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------");
        dataBaseLoader.checkPermission();



    }
}
