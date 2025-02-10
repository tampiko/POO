
public class Pizza {

    private String nombre;
    private double precio;
    private int stock;

    public Pizza(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reducirStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente para " + nombre);
        }
    }

    public void hacerMas(Integer cantidad) {
        this.stock += cantidad;
    }
}
