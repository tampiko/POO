
import java.io.IOException;
import java.util.Scanner;

public class Gato {

    public static void main(String[] args) {
        char[][] tablero = {{' ', ' ', ' ',}, {' ', ' ', ' ',}, {' ', ' ', ' ',}};
        char jugador = 'X';
        int f, c;
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        String continuar;
        limpiaPantalla();
        System.err.println("== Juego del Gato ==");
        System.err.println("--------------------");
        System.err.println("");

        while (!gameOver) {
            pintaTablero(tablero);
            f = pideDato(scanner, " Que fila elijes: ");
            c = pideDato(scanner, " Que columna elijes: ");
            System.out.println("Va a escribir en C" + (c - 1) + " F" + (f - 1));
            tablero[f - 1][c - 1] = jugador;
            revisaGanador(tablero);
            jugador = '0';
            System.out.println("Jugar de nuevo s/n?");
            continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("n")) {
                gameOver = true;
            }
        }
        scanner.close();
    }

    public static void pintaTablero(char[][] tablero) {
        System.out.println("C> 1-2-3+");
        System.out.println("  +-+-+-+");
        for (int x = 0; x < 3; x++) {
            System.out.println("F" + (x + 1) + "|" + tablero[x][0] + "|" + tablero[x][1] + "|" + tablero[x][2] + "|");
        }
        System.out.println("  +-+-+-+");
    }

    public static boolean revisaGanador(char[][] tablero) {
        for (int f = 0; f < 3; f++) {
            if ((tablero[f][0] == tablero[f][1])
                    && (tablero[f][1] == tablero[f][2])
                    && (tablero[f][0] != ' ')) {
                System.out.println("Ganador Linea!! " + f + " => " + tablero[f][1]);
            }
        }

        for (int c = 0; c < 3; c++) {
            if (tablero[0][c] == tablero[1][c]
                    && tablero[1][c] == tablero[2][c]
                    && tablero[1][c] != ' ') {
                System.out.println("Ganador Columna!! " + c + " => " + tablero[1][c]);
            }
            System.out.println("");
        }

        // Revisa Diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[2][2] != ' ') {
            System.out.println("Ganador Diagonal 1!!");
        }
        if (tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2] && tablero[2][2] != ' ') {
            System.out.println("Ganador Diagonal 2!!");
        }
        return false;
    }

    public static void limpiaPantalla() {
        try {
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al limpiar la pantalla");
        }
    }

    public static int pideDato(Scanner scanner, String msg) {
        int f;
        boolean valido = false;
        do {
            try {
                System.out.print("\n" + msg + ": ");
                f = scanner.nextInt();
                f = Integer.parseInt(null, f);
            } catch (Exception e) {
                System.out.println("No es un numero");
                scanner.nextLine();
            }
        } while (!valido);

        // Validar que sea numerico
        // Validar que este en el rango 0 - 2
        return 0;
    }
}

// que una funcion regrese 2 datos como en python, pero que no lo haga con arreglo o json
  // usar varible GLOBAL y no pasarla por paametros a funciones
