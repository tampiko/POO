
public class Usuario {
    String nombre;
    String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void pideLibro(Libro libro) {
        Libro.prestarLibro();
        System.out.println("El usuario " + nombre + " pidió el libro " + libro.getNombre());
    }

    public void devuelveLibro(Libro libro) {
        Libro.devolverLibro();
        System.out.println("El usuario " + nombre + " devolvió el libro " + libro.getNombre());
    }

    
}
