
public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int stock;

    public Libro(int id, String titulo, String autor, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
    }

    public void reducirStock() {
        if (stock > 0) {
            stock--;
            System.out.println("Libro prestado");
        } else {
            System.out.println("No hay stock");
        }
    }

    public void agregarStock() {
        stock = stock++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
