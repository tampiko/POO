
public class Pokemon {
    private String nombre;
    private int codigo;
    private int precio;
    private String tipo;
    private String habilidades;
    private int cantidad;

    public Pokemon (String nombre, int codigo, int precio, String tipo, String habilidades, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.tipo = tipo;
        this.habilidades = habilidades;
        this.cantidad = cantidad;
    }

    void reducir(int cantidad) {
        if (this.cantidad >= 0) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficientes pokemones en stock");
        }
    }

    void aumentar(int cantidad) {
        this.cantidad += cantidad;
    }
}
