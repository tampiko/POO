public class Biblioteca {
    Libro libros[] = new Libro[10];
    Libro dracula = new Libro("Dracula", "Bram Stoker", 5);
    Libro it = new Libro("Dracula", "Bram Stoker", 5);
    User juan = new User("Juan Diego","jd@tec.com");
    User luis = new User("Luis Angel","jd@tec.com");

    dracula.setNombre("Dracula - 2");


    public Biblioteca() {
        libros[0] = dracula;
        libros[1] = it;
    }
    
}