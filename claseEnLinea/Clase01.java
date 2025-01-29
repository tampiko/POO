import java.util.Arrays;
import java.util.Scanner;

public class Clase01 {
    public static void main(String[] args) {

        System.err.println("   ___                  ");
        System.err.println("   |_  |                 ");
        System.err.println("     | | __ ___   ____ _ ");
        System.err.println("     | |/ _` \\ \\ / / _` |");
        System.err.println(" /\\__/ / (_| |\\ V / (_| |");
        System.err.println(" \\____/ \\__,_| \\_/ \\__,_|");

        /**
         * Tipos de datos
         * Se crean una variable de cada tipo y se imprime
         * Estructuras de control -- if, else | switch | && || < > == !=
         * Scaner -> tabla de multiplicar. (agregarle algo)
         * Ciclos -> for, while, do while
         * Arreglos
         * 
         * 
         */

        int numeros = 10;
        int edad = 23;
        double decmal = 20.5;
        char caracter = 'A';
        String cadena = "Hola Mundo";
        boolean bandera = true;
        int MAYORIA_DE_EDAD = 18;

        System.out.println("int " + numeros);
        System.out.println("int " + edad);
        System.out.println("double " + decmal);
        System.out.println("char " + caracter);
        System.out.println("String " + cadena);
        System.out.println("boolean " + bandera);

        // Estructuras de Control

        /**
         * > Mayor que
         * < Menor que
         * >= Mayor o igual
         * <= Menor o igual
         * == Igual
         * =! Diferente
         * 
         * & ampersand
         * 
         * && and
         * || or
         * 
         * 1 && 1 = 1
         * 1 && 0 = 0
         * 1 || 1 = 1
         * 1 || 0 = 1
         * 
         */

        if (edad >= MAYORIA_DE_EDAD) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        if (edad > 6 && edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }

        // Switch
        int dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }

        // Ciclos

        System.out.println("FOR");
        int tabla = 3;
        tabla(tabla);
        System.out.println("");

        System.out.println("While - Compara y luego ejecuta");
        int numero = 1;
        while (numero < 10) {
            System.out.println("Numero: " + numero);
            numero++;
        }

        // Do While
        System.out.println("Do while - Ejecuta y luego compara");
        int numero2 = 1;
        do {
            System.out.println("Numero: " + numero2);
            numero2 = numero2 + 3;
        } while (numero2 < 10);

        // Arreglos
        System.out.println("=== Arreglos ===");
        int[] arreglo = { 1, 3, 2, 5, 4, 7, 9 };
        System.out.println("Arreglo => " + arreglo.length);
        System.out.println("Arreglo " + arreglo[2]);

        System.out.println("<===================>");
        System.out.println("Arreglo Original => " + Arrays.toString(arreglo));
        Arrays.sort(arreglo);
        System.out.println("Arreglo Ordenado => " + Arrays.toString(arreglo));
        // Ordenar en descendente
        System.out.println("Arreglo Ordenado => " + Arrays.toString(arreglo));
        System.out.println("<===================>");

        System.out.println("Recorre");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo: " + arreglo[i]);
        }

        System.out.println("For - Corto ");
        for (int num : arreglo) {
            System.out.println("Numero: " + num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que tala quieres: ");
        int miTabla = scanner.nextInt();

        System.out.println("Tabla de multiplicar: " + miTabla);

        tabla(miTabla);

    }

    public static void tabla(int miTabla) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("|" + miTabla + " * " + i + " = " + miTabla * i);
        }
    }

    // 3 Tipos de Errores
    // 	1.	Errores de sintaxis
    System.out.println("Hola, mundo!) // Falta una comilla

    //	2.	Errores en tiempo de ejecución (Runtime Exceptions)
    int resultado = 10 / 0; // ArithmeticException

    //  3.	Errores lógicos
    int resultado = 10 / 0; // ArithmeticException

}