
public class Libro {

    private String titulo;
    private String autor;
    private int stock;

    public Libro(String titulo, String autor, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
    }

    public void prestarLibro() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("No hay stock");
        }
    }

    public void devolverLibro() {
        stock++;
    }

}
