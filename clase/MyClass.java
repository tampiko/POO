
import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {
        Boolean continuar = true;
        String respuesta;
        String opcionMenu = "N";
        String nuevoTexto;
        Boolean opcionValida = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Luis");
        nombres.add("Leonardo");
        nombres.add("Aranza");

        while (continuar) {
            limpiaPantalla();
            System.out.println("Los Registros son :");
            listaElementos(nombres);
            System.out.println("");

            while (!opcionValida) {
                System.out.println("*** Menu ***");
                System.out.println("* N - Nuevo");
                System.out.println("* M - Modificar");
                System.out.println("* E - Eliminar");
                System.out.println("* B - Buscar");
                System.out.println("Que quieres hacer?");
                opcionMenu = scanner.nextLine();
                limpiaPantalla();
                switch (opcionMenu.toUpperCase()) {
                    case "N":
                        opcionValida = true;
                        System.out.println("Escribe el nombre del nuevo");
                        nuevoTexto = scanner.nextLine();
                        nombres.add(nuevoTexto);
                        limpiaPantalla();
                        System.out.println("Elementos");
                        listaElementos(nombres);
                        break;
                    case "M":
                        opcionValida = true;
                        System.out.println("Qué registro quieres Modificar Modificar?");
                        listaElementos(nombres);
                        break;
                    case "E":
                        opcionValida = true;
                        System.out.println("Qué registro quieres Eliminar?");
                        listaElementos(nombres);
                        break;
                    case "B":
                        opcionValida = true;
                        System.out.println("Buscar");
                        break;
                    default:
                        System.out.println("Opcion NO Valida, Intente de Nuevo...");
                        opcionValida = false;
                        break;
                }
            }

            // Read
            //System.out.println("Existe Luis en el arreglo? => "+nombres.contains("Luis"));
            //System.out.println("Luis esta en  => "+ nombres.indexOf("Luis"));
            // Update
            //int indice = nombres.indexOf("Luis");
            //nombres.set(indice,"Luis Angel");
            //System.out.println("Los Alumnos son :" + nombres);
            // Delete
            //System.out.println("Eliminando elementoi 0");
            //nombres.remove(0);
            //System.out.println("Los Alumnos son :" + nombres);
            //int dondeEsta = buscarElemento(nombres,"luis");
            //System.out.println("luis esta en => " + dondeEsta);
            System.out.println("Continuar? s/n");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

    }

    public static int buscarElemento(ArrayList<String> lista, String texto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).toLowerCase().equals(texto.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public static void listaElementos(ArrayList<String> lista) {
        for (int x = 1; x <= lista.size(); x++) {
            System.out.println(x + " - " + lista.get(x - 1));
        }
        System.out.println(" ");
    }

    public static void listaElementosTabla(ArrayList<String> lista) {
        for (int x = 1; x <= lista.size(); x += 2) {
            System.out.println(x + " - " + lista.get(x - 1) + " | " + (x + 1) + " - " + lista.get(x));
        }
        System.out.println(" ");
    }

    public static void limpiaPantalla() {
        try {
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla");
        }
    }
}
