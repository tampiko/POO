import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> menu;
    private List<Pedido> pedidos;

    public Pizzeria() {
        menu = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void agregarPizzaMenu(Pizza pizza) {
        menu.add(pizza);
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void mostrarMenu() {
        System.out.println("*** Menú de Pizzas ***");
        System.out.println("");
        for (Pizza pizza : menu) {
            System.out.println(pizza.getNombre() + " - $" + pizza.getPrecio() + " - Stock: " + pizza.getStock());
        }
    }

    public List<Pizza> getMenu() {
        return menu;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
