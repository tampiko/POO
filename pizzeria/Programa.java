import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        // Crear pizzería
        Integer opcionMenu;
        Extras.limpiarPantalla();
        Pizzeria pizzeria = new Pizzeria();
        ArrayList<Pizza> pizzas = crearPizzas();
        ArrayList<Cliente> clientes = crearClientes();
        pintaBienvenida();
        pintaMenuPrincipal();
        opcionMenu = Extras.getNumero("Seleccione una Opción: ");

        System.out.println(pizzas.get(0).getStock());
        pizzas.get(0).reducirStock(1);
        System.out.println(pizzas.get(0).getStock());

        // Mostrar menú
        pizzeria.mostrarMenu();

        // Crear pedido
        // Pedido pedido1 = new Pedido(cliente1);
        // pedido1.agregarPizza(hawaiana, 2);
        // pedido1.agregarPizza(pepperoni, 1);

        // Registrar pedido en la pizzería
        // pizzeria.registrarPedido(pedido1);

        // Mostrar total del pedido
        // System.out.println("Total del pedido: $" + pedido1.getTotal());

        // Mostrar menú actualizado
        pizzeria.mostrarMenu();
    }

    public static ArrayList<Pizza> crearPizzas() {
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        Pizza hawaiana = new Pizza("Hawaiana", 8.5, 10);
        Pizza pepperoni = new Pizza("Pepperoni", 9.5, 5);
        Pizza tresQuesos = new Pizza("Tres Quesos", 7.5, 3);
        Pizza mamaMeat = new Pizza("Mama Meat", 10, 5);
        pizzas.add(hawaiana);
        pizzas.add(pepperoni);
        pizzas.add(tresQuesos);
        pizzas.add(mamaMeat);
        return pizzas;
    }

    public static ArrayList<Cliente> crearClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("Juan Perez", "Calle Falsa 128", "9325897542");
        Cliente cliente2 = new Cliente("Miguel Pérez", "Calle Arroyo 256", "5279432845");
        Cliente cliente3 = new Cliente("Juan Perez", "Calle Amarilla 512", "3584621897");
        clientes.add(cliente3);
        clientes.add(cliente1);
        clientes.add(cliente2);
        return clientes;
    }

    public static void pintaBienvenida() {
        System.out.println("");
        System.out.println("Bienvenido a la Pizzeria \"Delit\"");
        System.out.println("");
    }

    public static void pintaMenuPrincipal() {
        System.out.println("");
        System.out.println("1. Ver menú");
        System.out.println("2. Ver Clientes");
        System.out.println("3. Realizar pedido");
        System.out.println("4. Ver pedidos");
        System.out.println("5. Salir");
        System.out.println("");
    }

}
