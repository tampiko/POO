import java.util.Scanner;

public class Gato {
	// Crear un tablero de 3x3
	static char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char jugadorActual = 'X';

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean juegoTerminado = false;

		// Ciclo del juego
		System.err.println("");
		System.err.println("¡Bienvenido al juego de Gato!");
		System.err.println("-----------------------------");
		System.err.println("");
		while (!juegoTerminado) {
			imprimirTablero();
			System.out.println("Jugador " + jugadorActual + ", selecciona la fila: ");
			int fila = scanner.nextInt();
			System.out.println("Jugador " + jugadorActual + ", selecciona la columna: ");
			int columna = scanner.nextInt();

			// Validar el movimiento
			if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
				tablero[fila][columna] = jugadorActual;
				juegoTerminado = verificarGanador() || esEmpate();
				jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
			} else {
				System.out.println("Movimiento no válido. Intenta de nuevo.");
			}
		}
		imprimirTablero();
		scanner.close();
	}

	// Método para imprimir el tablero
	public static void imprimirTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tablero[i][j]);
				if (j < 2) {
					System.out.print(i + " |  ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("   |---|---|---|");
			}
		}
	}

	// Método para verificar si hay un ganador
	public static boolean verificarGanador() {
		// Verificar filas y columnas
		for (int i = 0; i < 3; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ')
				return true;
			if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ')
				return true;
		}
		// Verificar diagonales
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ')
			return true;
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ')
			return true;
		return false;
	}

	// Método para verificar si es un empate
	public static boolean esEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j] == ' ')
					return false;
			}
		}
		System.out.println("¡Es un empate!");
		return true;
	}
}
