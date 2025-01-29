import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    System.out.print("Ingrese su nombre: ");
    while (continuar) {
      String nombre = scanner.nextLine();
      System.out.println("Hola, " + nombre + "!");

      double num1 = obtenerNumero(scanner, "Ingrese el primer número: ");
      double num2 = obtenerNumero(scanner, "Ingrese el segundo número: ");

      System.out.println("Seleccione una operación:");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
      System.out.println("4. División");

      int opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer

      double resultado = 0;
      switch (opcion) {
        case 1:
          resultado = num1 + num2;
          break;
        case 2:
          resultado = num1 - num2;
          break;
        case 3:
          resultado = num1 * num2;
          break;
        case 4:
          if (num2 != 0) {
            resultado = num1 / num2;
          } else {
            System.out.println("Error: División por cero.");
            continue;
          }
          break;
        default:
          System.out.println("Opción no válida.");
          continue;
      }

      System.out.println("El resultado es: " + resultado);

      System.out.print("¿Desea realizar otra operación? (si/no): ");
      String respuesta = scanner.nextLine();
      if (respuesta.equalsIgnoreCase("no")) {
        continuar = false;
      } else {
        limpiarPantalla();
      }
    }
    scanner.close();
  }

  private static double obtenerNumero(Scanner scanner, String mensaje) {
    double numero;
    while (true) {
      System.out.print(mensaje);
      String entrada = scanner.nextLine(); // Leer la entrada como String
      try {
        numero = Double.parseDouble(entrada); // Intentar convertir la entrada a double
        break; // Salir del bucle si la conversión es exitosa
      } catch (NumberFormatException e) {
        System.out.println("Entrada no válida. Por favor, ingrese un número."); // Mensaje de error
      }
    }
    return numero; // Devolver el número ingresado
  }

  private static void limpiarPantalla() {
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
}