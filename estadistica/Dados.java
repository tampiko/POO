import java.util.ArrayList;
import java.util.Random;

public class Dados {

    public static void main(String[] args) {
        System.out.println("* Se hace un tiro un dado y se obtiene la suma.");
        System.out.println("* Deben registrarse 200 tiros y registrar cuantas veces se obtiene cada suma.");
        System.out.println("* Al final se deberan mostrar cuantas veces se obtuvo cada suma y su porcentaje.");

        ArrayList<int[]> resultados = new ArrayList<>();

        // Inicializar el ArrayList con los números del 1 al 6 y sus conteos en 0
        for (int i = 1; i <= 6; i++) {
            resultados.add(new int[] { i, 0 });
        }

        // Realizar 200 tiros
        System.out.println();
        System.out.println("Tirando dados...");
        System.out.println();
        for (int i = 0; i < 200; i++) {
            int resultado = tirarDado();
            resultados.get(resultado - 1)[1]++;
        }

        // Mostrar resultados
        for (int[] resultado : resultados) {
            int numero = resultado[0];
            int conteo = resultado[1];
            double porcentaje = (conteo / 200.0) * 100;
            System.out.println("Número " + numero + " salió " + conteo + " veces (" + porcentaje + "%) "
                    + AnsiColors.GREEN.BG + "     " + AnsiColors.RESET);
        }
    }

    private static int tirarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Genera un número entre 1 y 6
    }
}
