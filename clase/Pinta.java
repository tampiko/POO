public class Pinta {
    public static void main(String[] args) {
        System.out.print(AnsiColors.PURPLE.TXT+AnsiColors.WHITE.BG);
        System.out.print(Tabla.TOPLEFT+Tabla.HORIZONTAL+Tabla.HORIZONTAL+"Hola");
        System.out.print(Tabla.HORIZONTAL+Tabla.HORIZONTAL+Tabla.TOPRIGHT);
        System.out.print(AnsiColors.RESET);
        System.out.println("");
        creaMensaje("PRESENTACION",81);
    }

    public static void creaMensaje(String mensaje,int largo){
        int espacios = largo - mensaje.length();
        int mitad = espacios/2; // TODO: Revisar cuando sea impar

        //Titulo
        System.out.print(Tabla.TOPLEFT);
        for(int i = 1; i<mitad;i++){
            System.out.print(Tabla.HORIZONTAL);
        }
        System.out.print(mensaje);
        for(int i = 1; i<mitad;i++){
            System.out.print(Tabla.HORIZONTAL);
        }
        System.out.print(Tabla.TOPRIGHT);
        System.out.println();

        // Lineas
        System.out.print(Tabla.VERTICAL);
        for(int i=1;i<largo-1;i++){
            System.out.print(" ");
        }
        System.out.println(Tabla.VERTICAL);
        
        // Inferior
        System.out.print(Tabla.BOTTOMLEFT);
        for(int i=1;i<largo-1;i++){
            System.out.print(Tabla.HORIZONTAL);
        }
        System.out.println(Tabla.BOTTOMRIGHT);
    }
}


