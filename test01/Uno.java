public class Uno {
    public static void main(String[] args) {
        // Tipos de datos y asignación
        int numero = 10;
        double decimal = 20.5;
        char caracter = 'A';
        boolean esVerdadero = true;
        String texto = "Hola Mundo";

        // Estructura de control if-else
        if (numero > 5) {
            System.out.println("El número es mayor que 5");
        } else {
            System.out.println("El número es 5 o menor");
        }

        // Estructura de control switch
        switch (caracter) {
            case 'A':
                System.out.println("El carácter es A");
                break;
            case 'B':
                System.out.println("El carácter es B");
                break;
            default:
                System.out.println("El carácter no es A ni B");
                break;
        }

        // Ciclo for
        for (int i = 0; i < 5; i++) {
            System.out.println("Ciclo for, iteración: " + i);
        }

        // Ciclo while
        int contador = 0;
        while (contador < 5) {
            System.out.println("Ciclo while, contador: " + contador);
            contador++;
        }

        // Uso de arrays y cómo recorrerlos
        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros) {
            System.out.println("Número en el array: " + num);
        }

        // ...existing code...
        final float PI;
        PI = 3.1415f;
        System.out.println(PI);
    }
}