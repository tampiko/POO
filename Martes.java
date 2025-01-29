public class Martes {
  public static void main(String[] args) {

    int a, b, c;
    System.out.println(AnsiColors.RED + "TABLA DE PITAGORAS\n");
    System.out.print("      || ");
    for (int j = 1; j <= 10; j++) {
      System.out.print("" + rellena(String.valueOf(j), 4) + "  |");
    }
    System.out.println("");
    System.out.println("______________________________________________________________");

    for (int j = 1; j <= 10; j++) {
      System.out.print("" + rellena(String.valueOf(j), 4) + "  |");
      for (int i = 1; i <= 10; i++) {
        System.out.print("| " + rellena(String.valueOf((i * j)), 4) + "\t");
      }
      System.out.println("");
    }
    System.out.println("|");
    System.out.println("______________________________________________________________");

    System.out.println("\u001B[30m Gris");
    System.out.println("\u001B[31m Rojo");
    System.out.println("\u001B[32m Verde");
    System.out.println("\u001B[33m Amarillo");
    System.out.println("\u001B[34m Azul");
    System.out.println("\u001B[35m Morado");
    System.out.println("\u001B[36m AzulClaro");
    System.out.println("\u001B[37m Blanco");
  }

  public static String rellena(String texto, int longitud) {
    if (texto.length() < longitud) {
      return texto + rellena(" ", longitud - texto.length());
    }
    return texto;
  }
}

// 01.- Biblioteca
// 02.- Renta de Peliculas
// 03.- Carrito de Compra
// 04.- Sala de Cinemas

// CheatSheet
// Repositorio Git
// Van a hacer los equipos
