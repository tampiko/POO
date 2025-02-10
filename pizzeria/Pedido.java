import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Pizza> pizzas;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pizzas = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarPizza(Pizza pizza, int cantidad) {
        if (pizza.getStock() >= cantidad) {
            pizza.reducirStock(cantidad);
            pizzas.add(pizza);
            total += pizza.getPrecio() * cantidad;
        } else {
            System.out.println("No hay suficiente stock para " + pizza.getNombre());
        }
    }

    // Métodos getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public double getTotal() {
        return total;
    }
}
