
public class Pizza {

    private int id;
    private String nombre;
    private String ingredientes;
    private double precio;
    private int stock;

    public Pizza(int id, String nombre, String ingredientes, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getIngredientes() {return ingredientes;}
    public double getPrecio() {return precio;}
    public int getStock() {return stock;}

    public boolean vender() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    public void reponer(int cantidad) {
        stock += cantidad;
    }
}
