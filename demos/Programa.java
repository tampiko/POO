
import java.util.ArrayList;
import java.util.List;

public class Programa {

    private static List<Libro> catalogoLibros;

    public static void main(String[] args) {
        catalogoLibros = new ArrayList<>();
        Libro quijote = new Libro(1, "El Quijote", "Cervantes", 10);
        Libro lotr = new Libro(2, "El Señor de los Anillos", "Tolkien", 5);
        Libro harryPotter = new Libro(3, "Harry Potter", "Rowling", 3);

        catalogoLibros.add(quijote);
        catalogoLibros.add(lotr);
        catalogoLibros.add(harryPotter);

        System.out.println("Libros disponibles: ");
        for (Libro libro : catalogoLibros) {
            System.out.println(libro.getId() + ".- " + libro.getTitulo() + ". [" + libro.getStock() + "]");
        }

    }
}
