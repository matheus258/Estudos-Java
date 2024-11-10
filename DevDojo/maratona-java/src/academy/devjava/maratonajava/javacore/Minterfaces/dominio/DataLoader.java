package academy.devjava.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissões...");
    }
}
