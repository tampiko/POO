import java.util.Scanner;

public class HarryPotter {
    /*
     * La primera letra de tu nombre para el nombre mágico
     * • La primera letra de tu apellido para el apellido mágico
     * 
     * Nombre Mágico (Primera letra de tu nombre)
     * • A - Alastor
     * • B - Bellatrix
     * • C - Cedric
     * • D - Draco
     * • E - Elphias
     * • F - Filius
     * • G - Gellert
     * • H - Helga
     * • I - Ignatius
     * • J - James
     * • K - Kendra
     * • L - Lucius
     * • M - Minerva
     * • N - Nymphadora
     * • O - Olympe
     * • P - Percival
     * • Q - Quirinus
     * • R - Remus
     * • S - Severus
     * • T - Tom
     * • U - Urquhart
     * • V - Viktor
     * • W - Wilhelmina
     * • X - Xenophilius
     * • Y - Yaxley
     * • Z - Zygmunt
     * 
     * Apellido Mágico (Primera letra de tu apellido)
     * • A - Abernathy
     * • B - Blackwood
     * • C - Carrow
     * • D - Diggory
     * • E - Edgecombe
     * • F - Flamel
     * • G - Gaunt
     * • H - Hallow
     * • I - Inglebee
     * • J - Jorkins
     * • K - Kettleburn
     * • L - Lestrange
     * • M - Malfoy
     * • N - Nott
     * • O - Ollivander
     * • P - Pettigrew
     * • Q - Quirrell
     * • R - Rosier
     * • S - Shacklebolt
     * • T - Tonks
     * • U - Umbridge
     * • V - Vance
     * • W - Weasley
     * • X - Ximenez
     * • Y - Yarrow
     * • Z - Zabini
     * 
     * 📌 Ejemplo: Si te llamas Carlos Pérez, tu nombre mágico sería Cedric
     * Pettigrew.
     * 
     * ¿En qué casa de Hogwarts estarías?
     * 
     * Elige tu casa según tu mes de nacimiento:
     * • Enero → Gryffindor 🦁
     * • Febrero → Slytherin 🐍
     * • Marzo → Hufflepuff 🦡
     * • Abril → Ravenclaw 🦅
     * • Mayo → Gryffindor 🦁
     * • Junio → Slytherin 🐍
     * • Julio → Hufflepuff 🦡
     * • Agosto → Ravenclaw 🦅
     * • Septiembre → Gryffindor 🦁
     * • Octubre → Slytherin 🐍
     * • Noviembre → Hufflepuff 🦡
     * • Diciembre → Ravenclaw 🦅
     * 
     * 📌 Ejemplo: Si naciste en junio, serías de Slytherin. 🐍
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreF = "";
        String apellido = "";
        String nombreHP = "";
        String mes = "";
        String casa = "";

        System.out.println("***** Harry Potter *****");
        System.out.print("Ingresa Tu Primer Nombre: ");
        nombreF = sc.nextLine();

        System.out.print("Ingresa Tu Primer Apellido: ");
        apellido = sc.nextLine();

        nombreHP = dimeNombreHP(nombreF, apellido);

        System.out.println(" Tu nombre HP es : " + nombreHP);

        System.out.print("En qué mes Naciste? ");
        mes = sc.nextLine();

    }

    private static String dimeNombreHP(String nombre, String apellido) {
        String nombreF = "";
        String apellidoF = "";
        switch (Character.toLowerCase(nombre.charAt(0))) {
            case 'a' -> nombreF = "Alastor";
            case 'b' -> nombreF = "Bellatrix";
            case 'c' -> nombreF = "Cedric";
            case 'd' -> nombreF = "Draco";
            case 'e' -> nombreF = "Elphias";
            case 'f' -> nombreF = "Filius";
            case 'g' -> nombreF = "Gellert";
            case 'h' -> nombreF = "Helga";
            case 'i' -> nombreF = "Ignatius";
            case 'j' -> nombreF = "James";
            case 'k' -> nombreF = "Kendra";
            case 'l' -> nombreF = "Lucius";
            case 'm' -> nombreF = "Minerva";
            case 'n' -> nombreF = "Nymphadora";
            case 'o' -> nombreF = "Olympe";
            case 'p' -> nombreF = "Percival";
            case 'q' -> nombreF = "Quirinus";
            case 'r' -> nombreF = "Remus";
            case 's' -> nombreF = "Severus";
            case 't' -> nombreF = "Tom";
            case 'u' -> nombreF = "Urquhart";
            case 'v' -> nombreF = "Viktor";
            case 'w' -> nombreF = "Wilhelmina";
            case 'x' -> nombreF = "Xenophilius";
            case 'y' -> nombreF = "Yaxley";
            case 'z' -> nombreF = "Zygmunt";
        }

        switch (Character.toLowerCase(apellido.charAt(0))) {
            case 'a' -> apellidoF = "Abernathy";
            case 'b' -> apellidoF = "Blackwood";
            case 'c' -> apellidoF = "Carrow";
            case 'd' -> apellidoF = "Diggory";
            case 'e' -> apellidoF = "Edgecombe";
            case 'f' -> apellidoF = "Flamel";
            case 'g' -> apellidoF = "Gaunt";
            case 'h' -> apellidoF = "Hallow";
            case 'i' -> apellidoF = "Inglebee";
            case 'j' -> apellidoF = "Jorkins";
            case 'k' -> apellidoF = "Kettleburn";
            case 'l' -> apellidoF = "Lestrange";
            case 'm' -> apellidoF = "Malfoy";
            case 'n' -> apellidoF = "Nott";
            case 'o' -> apellidoF = "Ollivander";
            case 'p' -> apellidoF = "Pettigrew";
            case 'q' -> apellidoF = "Quirrell";
            case 'r' -> apellidoF = "Rosier";
            case 's' -> apellidoF = "Shacklebolt";
            case 't' -> apellidoF = "Tonks";
            case 'u' -> apellidoF = "Umbridge";
            case 'v' -> apellidoF = "Vance";
            case 'w' -> apellidoF = "Weasley";
            case 'x' -> apellidoF = "Ximenez";
            case 'y' -> apellidoF = "Yarrow";
            case 'z' -> apellidoF = "Zabini";
        }
        return nombreF + " " + apellidoF;
    }

    private String dimeCasaHP(String mes) {

        return "";
    }

}
