
public class Centrar {

    public static void main(String[] args) {
        LineaSuperior();
        CentraTexto("Programacion Orientada a Objetos");
        LineaMedia();
        LineaEspacios();
        LineaEspacios();
        LineaEspacios();
        LineaEspacios();
        LineaInferior();
    }

    private static void CentraTexto(String texto) {
        System.out.println(Colores.GREEN.BG + Colores.WHITE.TXT +
                Tabla.VERTICAL + Colores.RESET + "                       " + texto + "                       "
                + Colores.GREEN.BG + Colores.WHITE.TXT + Tabla.VERTICAL + Colores.RESET);
    }

    private static void LineaSuperior() {
        System.out.print(Colores.GREEN.BG + Colores.WHITE.TXT + Tabla.TOPLEFT);
        for (int i = 0; i < 78; i++) {
            System.out.print(Tabla.HORIZONTAL);
        }
        System.out.println(Tabla.TOPRIGHT + Colores.RESET);
    }

    private static void LineaMedia() {
        System.out.print(Colores.GREEN.BG + Colores.WHITE.TXT + Tabla.MIDDLELEFT);
        for (int i = 0; i < 78; i++) {
            System.out.print(Tabla.HORIZONTAL);
        }
        System.out.println(Tabla.MIDDLERIGHT + Colores.RESET);
    }

    private static void LineaEspacios() {
        System.out.print(Colores.GREEN.BG + Colores.WHITE.TXT + Tabla.VERTICAL + Colores.RESET);
        for (int i = 0; i < 78; i++) {
            System.out.print(" ");
        }
        System.out.println(Colores.GREEN.BG + Colores.WHITE.TXT + Tabla.VERTICAL + Colores.RESET);
    }

    private static void LineaInferior() {
        System.out.print(Colores.GREEN.BG + Colores.WHITE.TXT + Tabla.BOTTOMLEFT);
        for (int i = 0; i < 78; i++) {
            System.out.print(Tabla.HORIZONTAL);
        }
        System.out.println(Tabla.BOTTOMRIGHT + Colores.RESET);
    }

}
