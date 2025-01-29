import java.util.Scanner;

public class Crud {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean continuar = true;
		String respuesta;

		do {

			// Pantalla de Bienvenida

			System.out.println("¿Desea realizar otra operación? (s/n): ");
			respuesta = scanner.nextLine();
			if (respuesta.equalsIgnoreCase("n")) {
				continuar = false;
			}
		} while (continuar);
	}
}
