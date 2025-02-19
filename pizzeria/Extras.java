import java.util.Scanner;

public class Extras {

    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla.");
        }
    }

    public static double getCantidad(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine(); // Leer la entrada como String
            try {
                numero = Double.parseDouble(entrada); // Intentar convertir la entrada a double
                break; // Salir del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, Intente de Nuevo."); // Mensaje de error
            }
        }
        // scanner.close();
        return numero; // Devolver el número ingresado
    }

    public static Integer getNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        Integer numero;
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine(); // Leer la entrada como String
            try {
                numero = Integer.parseInt(entrada); // Intentar convertir la entrada a double
                break; // Salir del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, Intente de Nuevo."); // Mensaje de error
            }
        }
        // scanner.close();
        return numero; // Devolver el número ingresado
    }
}
