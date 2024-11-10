package academy.devjava.maratonajava.javacore.Minterfaces.test;

import academy.devjava.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devjava.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devjava.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataLoader.load();
        fileLoader.load();
    }
}
