import java.util.Scanner;

public class Nullx {
    public static void main(String[] args) {
        
          //Tipos de datos
          //Se crean una variable de cada tipo y se imprime
        
        int cifra = 25;
        double decimal = 17.6; // or float with a 'f' at the end
        char caracter = 'F';
        String texto = "I am a string";
        boolean prueba = true;


        System.out.println("int: "+  cifra);


        System.out.println("double: " + decimal);
        System.out.println("char: " + caracter);
        System.out.println("String: " + texto);
        System.out.println("boolean: " + prueba);

        System.out.println("");
        //Estructuras de control -- if, else | switch | && || < > == !=
        //if, else
        if (cifra % 2 == 0) {
            System.out.println("La cifra es par");
        } else {
            System.out.println("La cifra es impar");
        }
        System.out.println("");
        //switch
        //Scaner -> tabla de multiplicar. (agregarle algo)
        Scanner MultiplicationTable = new Scanner(System.in);
        System.out.println("Ingresa el numero de la tabla de multiplicar que desea ver, entre el 1 y el 10: ");

        switch (MultiplicationTable.nextInt()) {
            case 1:
               for(int i = 1; i < 11; i++)
                System.out.println("1 x " + i + " = " + 1 * i);
                break;
            case 2:
                for(int i = 1; i < 11; i++)
                System.out.println("2 x " + i + " = " + 2 * i);
                break;
            case 3:
                for(int i = 1; i < 11; i++)
                System.out.println("3 x " + i + " = " + 3 * i);
                break;
            case 4:
                for(int i = 1; i < 11; i++)
                System.out.println("4 x " + i + " = " + 4 * i);
                break;
            case 5:
                for(int i = 1; i < 11; i++)
                System.out.println("5 x " + i + " = " + 5 * i);
                break;
            case 6:
                for(int i = 1; i < 11; i++)
                System.out.println("6 x " + i + " = " + 6 * i);
                break;
            case 7:
                for(int i = 1; i < 11; i++)
                System.out.println("7 x " + i + " = " + 7 * i);
                break;
            case 8:
                for(int i = 1; i < 11; i++)
                System.out.println("8 x " + i + " = " + 8 * i);
                break;
            case 9:
                for(int i = 1; i < 11; i++)
                System.out.println("9 x " + i + " = " + 9 * i);
                break;
            case 10:
                for(int i = 1; i < 11; i++)
                System.out.println("10 x " + i + " = " + 10 * i);
                break;
            default:
                System.out.println("Numero fuera de rango");
                break;
        }
        // Close the Scanner object
        //MultiplicationTable.close();
        System.out.println("");
        
        //Ciclos -> for, while, do while
        //For -- imprimir numeros pares de un rango
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el limite superior del rango: ");
        int limit = scanner.nextInt(); 
        System.out.println("Los numeros pares dentro del rango proporcionado son: ");
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                    System.out.println(i);
            } //else {
                //System.out.println("Dato inválido.");
            //}
        }
        // Close the Scanner object 
        //scanner.close();
        System.out.println("");

        //While -- 
        //Calculo de promedio general y evaluacion de aprobados
        Scanner numeroActividades = new Scanner(System.in);
        System.out.println("Ingresa el numero de actividades: ");
        Scanner promedioGeneral = new Scanner(System.in);
        System.out.println("Ingresa la suma total de las calificaciones: ");

        int actividades = numeroActividades.nextInt();
        int promedio = promedioGeneral.nextInt();
        int promedioFinal = promedio / actividades;
       
        

        while (promedioFinal >= 70) {
            System.out.println("Su promedio general es: " + promedioFinal);
            System.out.println("Aprobado");
            //verificar la condicion false dentro del bucle //
                //break;
            if (promedioFinal < 70){
                System.out.println("Reprobado");
            } 
        }
        scanner.close();

        // Do While



        //Arreglos
        //Eliminar elementos duplicados de una lista.
        int[] numData = {54, 26, 64, 89, 74, 26, 85, 63, 95, 74, 63};
        

        //
    }
    
}