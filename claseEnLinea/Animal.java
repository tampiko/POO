public class Animal {
    String nombre;
    int edad;
    String color;

    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String avanza(int pasos) {
        return "Avanzó " + pasos + " pasos";
    }

    public String retrocede(int pasos) {
        return "Retrocedió " + pasos + " pasos";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}