public class Inicio {
    public static void main(String[] args) {
        // Crear pizzería
        Pizzeria pizzeria = new Pizzeria();

        // Crear pizzas y añadir al menú
        Pizza margarita = new Pizza("Hawaiana", 8.5, 10);
        Pizza pepperoni = new Pizza("Pepperoni", 9.5, 5);
        pizzeria.agregarPizzaMenu(margarita);
        pizzeria.agregarPizzaMenu(pepperoni);

        // Mostrar menú
        pizzeria.mostrarMenu();

        // Crear cliente
        Cliente cliente1 = new Cliente("Juan Perez", "Calle Falsa 123", "1234567890");

        // Crear pedido
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarPizza(margarita, 2);
        pedido1.agregarPizza(pepperoni, 1);

        // Registrar pedido en la pizzería
        pizzeria.registrarPedido(pedido1);

        // Mostrar total del pedido
        System.out.println("Total del pedido: $" + pedido1.getTotal());

        // Mostrar menú actualizado
        pizzeria.mostrarMenu();
    }

}
