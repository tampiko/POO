import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    private static Pizzeria pizzeria = new Pizzeria();
    private static ArrayList<Pizza> pizzas = crearPizzas();
    private static ArrayList<Cliente> clientes = crearClientes();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer opcionMenu;
        Extras.limpiarPantalla();
        pizzeria.getMenu().addAll(pizzas);
        pintaBienvenida();

        do {
            menuPrincipal();
            opcionMenu = Extras.getNumero("Seleccione una Opción: ");
            Extras.limpiarPantalla();
            pintaBienvenida();

            switch (opcionMenu) {
                case 1:
                    menuPizza();
                    break;
                case 2:
                    menuClientes();
                    break;
                case 3:
                    menuPedidos();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionMenu != 4);
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
        System.out.println("===== Pizzeria \"Delit\" =====");
        System.out.println("");
    }

    public static void menuPrincipal() {
        System.out.println("     Menu Principal");
        System.out.println("");
        System.out.println("1. Pizza");
        System.out.println("2. Clientes");
        System.out.println("3. Pedidos");
        System.out.println("4. Salir");
        System.out.println("");
    }

    public static void menuPizza() {
        Integer opcionPizza;
        do {
            System.out.println("** Pizzas **");
            System.out.println("");
            System.out.println("1. Listar Pizzas");
            System.out.println("2. Preparar Pizzas");
            System.out.println("3. Salir");
            System.out.println("");
            opcionPizza = Extras.getNumero("Seleccione una Opción: ");
            Extras.limpiarPantalla();

            switch (opcionPizza) {
                case 1:
                    pintaBienvenida();
                    pizzeria.mostrarMenu();
                    break;
                case 2:
                    prepararPizza();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionPizza != 3);
    }

    public static void menuClientes() {
        Integer opcionCliente;
        do {
            System.out.println("** Clientes **");
            System.out.println("");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Nuevo Cliente");
            System.out.println("3. Salir");
            System.out.println("");
            opcionCliente = Extras.getNumero("Seleccione una Opción: ");
            Extras.limpiarPantalla();

            switch (opcionCliente) {
                case 1:
                    listarClientes();
                    break;
                case 2:
                    nuevoCliente();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionCliente != 3);
    }

    public static void menuPedidos() {
        Integer opcionPedido;
        do {
            System.out.println("** Pedidos **");
            System.out.println("");
            System.out.println("1. Listar Pedidos");
            System.out.println("2. Nuevo Pedido");
            System.out.println("3. Salir");
            System.out.println("");
            opcionPedido = Extras.getNumero("Seleccione una Opción: ");
            Extras.limpiarPantalla();

            switch (opcionPedido) {
                case 1:
                    listarPedidos();
                    break;
                case 2:
                    nuevoPedido();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionPedido != 3);
    }

    public static void listarClientes() {
        int i = 1;
        for (Cliente cliente : clientes) {
            System.out.println(
                    i + ". " + cliente.getNombre() + " - " + cliente.getDireccion() + " - " + cliente.getTelefono());
            i++;
        }
    }

    public static void nuevoCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        Cliente nuevoCliente = new Cliente(nombre, direccion, telefono);
        clientes.add(nuevoCliente);
        System.out.println("Cliente agregado exitosamente.");
    }

    public static void prepararPizza() {
        System.out.print("Nombre de la pizza: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        Pizza nuevaPizza = new Pizza(nombre, precio, stock);
        pizzeria.agregarPizzaMenu(nuevaPizza);
        System.out.println("Pizza agregada exitosamente.");
    }

    public static void listarPedidos() {
        for (Pedido pedido : pizzeria.getPedidos()) {
            System.out.println("Cliente: " + pedido.getCliente().getNombre());
            for (Pizza pizza : pedido.getPizzas()) {
                System.out.println(" - " + pizza.getNombre() + " x" + pizza.getStock());
            }
            System.out.println("Total: $" + pedido.getTotal());
        }
    }

    public static void nuevoPedido() {
        listarClientes();
        System.out.print("Seleccione el número del cliente: ");
        int indiceCliente = scanner.nextInt();
        Cliente cliente = clientes.get(indiceCliente - 1);
        Pedido nuevoPedido = new Pedido(cliente);

        listarPizzas();
        System.out.print("Seleccione el número de la pizza: ");
        int indicePizza = scanner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        Pizza pizza = pizzeria.getMenu().get(indicePizza - 1);
        nuevoPedido.agregarPizza(pizza, cantidad);

        pizzeria.registrarPedido(nuevoPedido);
        System.out.println("Pedido registrado exitosamente.");
    }

    public static void listarPizzas() {
        int i = 1;
        for (Pizza pizza : pizzeria.getMenu()) {
            System.out.println(
                    i + ". " + pizza.getNombre() + " - $" + pizza.getPrecio() + " - Stock: " + pizza.getStock());
            i++;
        }
    }
}
