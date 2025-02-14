import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String nombreSw = "";
        String planeta = "";
        String mes = "";

        System.out.println("***** Star Wars *****");
        System.out.print("Ingresa Tu Primer Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa Tu Primer Apellido: ");
        apellido = sc.nextLine();

        System.out.print("En qué mes Naciste? ");
        mes = sc.nextLine();

        switch (mes.toLowerCase()) {
            case "enero":
                planeta = "Naboo";
                break;
            case "febrero":
                planeta = "Coruscant";
                break;
            case "marzo":
                planeta = "Mandalore";
                break;
            case "abril":
                planeta = "Kashyyyk";
                break;
            case "mayo":
                planeta = "Tatooine";
                break;
            case "junio":
                planeta = "Alderaan";
                break;
            case "julio":
                planeta = "Dagobah";
                break;
            case "agosto":
                planeta = "Endor";
                break;
            case "septiembre":
                planeta = "Hoth";
                break;
            case "octubre":
                planeta = "Mustafar";
                break;
            case "noviembre":
                planeta = "Bespin";
                break;
            case "diciembre":
                planeta = "Jakku";
                break;
        }
        nombreSw = apellido.substring(0, 3) + nombre.substring(0, 2);
        System.out.println("Tu Nombre de Star Wars es : " + nombreSw + ", y eres del planteta " + planeta);
    }
}
