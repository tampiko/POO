
public class Error {

    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int c = 0;
        String[] nombre = {"Leonardo", "Aranza", "Larissa", "Fernando"};
        try {
            System.out.println("Arreglo[0] " + nombre[0]);
            System.out.println("Arreglo[1] " + nombre[1]);
            System.out.println("Arreglo[2] " + nombre[2]);
            System.out.println("Arreglo[3] " + nombre[3]);
            System.out.println("Arreglo[3] " + nombre[4]);
        } // Error De Logico
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
            System.out.println("Arreglo tiene  " + nombre.length + " elementos");
        }

        // Error de Ejecución
        /**
         * Es cuando el error se crea cuando el programa esta en ejecucion, como
         * cuando busca un archivo y éste no esta
         */
    }
}
