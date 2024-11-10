package academy.devjava.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    // private -> default -> protect -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados...");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }
}
