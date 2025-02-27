import java.util.ArrayList;
import java.util.List;

public class Elemento {
    private static int contador = 1;
    private int id;
    private String nombre;

    public Elemento(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Elemento mercurio = new Elemento("Mercurio");
        Elemento aluminio = new Elemento("Aluminio");
        Elemento oxigeno = new Elemento("Oxigeno");
        List<Elemento> tablaPeriodica = new ArrayList<>();
        tablaPeriodica.add(mercurio);
        tablaPeriodica.add(aluminio);
        tablaPeriodica.add(oxigeno);
        ListaElementos(tablaPeriodica);
    }

    private static void ListaElementos(List<Elemento> tablaPeriodica) {
        System.out.println(" ==== Elementos ====");
        for (Elemento elemento : tablaPeriodica) {
            System.out.println(elemento.getId() + ".- " + elemento.getNombre());
        }
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
