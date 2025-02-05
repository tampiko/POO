
public class Libro {
    private String titulo;
    private String autor;
    private int stock;
    private Genero genero;

    public Libro(String titulo, String autor, int stock, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
    }

    void prestarLibro() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("No hay stock");
        }
    }

    void devolverLibro() {
        stock++;
    }

}
