import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) {
        /*
         * Generador de Nombre de Star Wars
         * 
         * Toma:
         * 1. Las tres primeras letras de tu apellido
         * 2. Las dos primeras letras de tu nombre
         * 3. Tu mes de nacimiento para tu planeta de origen
         * 
         * 1️⃣ Primera parte del nombre (Tres primeras letras del apellido)
         * • Pérez → Per
         * • Gutiérrez → Gut
         * • Ramírez → Ram
         * • Fernández → Fer
         * • Castillo → Cas
         * 
         * 2️⃣ Segunda parte del nombre (Dos primeras letras del nombre)
         * • Carlos → Ca
         * • Mariana → Ma
         * • José → Jo
         * • Sofía → So
         * • Daniel → Da
         * 
         * Harry Cruz
         * 
         * CRUHA
         * 
         * 📌 Ejemplo: Si te llamas Carlos Pérez, tu nombre sería “Perca”.
         * 
         * ¿De qué planeta eres? (Según tu mes de nacimiento)
         * • Enero → Naboo
         * • Febrero → Coruscant
         * • Marzo → Mandalore
         * • Abril → Kashyyyk
         * • Mayo → Tatooine
         * • Junio → Alderaan
         * • Julio → Dagobah
         * • Agosto → Endor
         * • Septiembre → Hoth
         * • Octubre → Mustafar
         * • Noviembre → Bespin
         * • Diciembre → Jakku
         * 
         * 📌 Ejemplo: Si naciste en mayo, eres de Tatooine.
         */
        System.out.println("** Star Wars **");

        String nombre = "";
        String apellido = "";
        String mes = "";

        Scanner sc = new Scanner(System.in);

        // nombre = sc.nextLine();
        // apellido = sc.nextLine();
        // mes = sc.nextLine();

        nombre = "Carlos";
        nombre.substring(0, 3);
        System.out.println(nombre.substring(0, 3));

    }
}
