# Temario

## Tema 1: Fundamentos de Programación Orientada a Objetos
**Concepto**: La programación orientada a objetos (POO) se basa en objetos que representan entidades del mundo real. Estos objetos tienen atributos (datos) y métodos (funciones) que operan sobre esos datos. POO facilita la organización del código y la reutilización.

**Ejemplo**:
```java
class Animal {
    String nombre;
    
    void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }
}

Animal miAnimal = new Animal();
miAnimal.nombre = "Perro";
miAnimal.hacerSonido();
```

## Tema 2: Modelado y UML
**Concepto**: UML (Lenguaje de Modelado Unificado) es un lenguaje de modelado para diseñar sistemas de software visualmente. Incluye varios tipos de diagramas, como diagramas de clases, de secuencia, de casos de uso, entre otros.

### Diagrama de Clases UML
El diagrama de clases es uno de los diagramas más importantes en UML. Representa la estructura estática del sistema mostrando las clases, sus atributos, métodos y las relaciones entre ellas.

**Ejemplo**: Diagrama de clases UML para el ejemplo anterior.
```
+-----------------+
|      Animal     |
+-----------------+
| - nombre: String|
+-----------------+
| + hacerSonido() |
+-----------------+
```

### Herencia en UML
La herencia es una relación entre clases donde una clase (subclase) hereda atributos y métodos de otra clase (superclase). En UML, la herencia se representa con una línea con un triángulo vacío apuntando hacia la superclase.

**Ejemplo**: Diagrama de clases UML con herencia.
```
+-----------------+        +-----------------+
|      Animal     |        |      Perro      |
+-----------------+        +-----------------+
| - nombre: String|        |                 |
+-----------------+        +-----------------+
| + hacerSonido() |        | + moverCola()   |
+-----------------+        +-----------------+
           ^                        |
           |                        |
           +------------------------+
```

### Relaciones entre Clases en UML
Las clases pueden relacionarse de varias maneras en UML:

1. **Asociación**: Representa una relación entre dos clases. Se dibuja como una línea simple entre las clases.
2. **Agregación**: Es un tipo de asociación que indica que una clase es parte de otra clase. Se dibuja como una línea con un rombo vacío en el extremo de la clase contenedora.
3. **Composición**: Es una forma más fuerte de agregación donde la vida del objeto contenido depende del objeto contenedor. Se dibuja como una línea con un rombo lleno en el extremo de la clase contenedora.

**Ejemplo**: Diagrama de clases UML con diferentes relaciones.
```
+-----------------+        +-----------------+        +-----------------+
|      Persona    |        |      Trabajo    |        |      Coche      |
+-----------------+        +-----------------+        +-----------------+
| - nombre: String|        | - puesto: String|        | - marca: String |
| - edad: int     |        | - empleado:     |<>------| - motor: Motor  |
+-----------------+        |   Persona       |        +-----------------+
| + saludar()     |        +-----------------+        | + mostrarDetalles()|
+-----------------+        | + mostrarDetalles()|     +-----------------+
           |                        |                        |
           +------------------------+                        |
                                                            |
                                                            |
                                                            |
                                                            +-----------------+
                                                            |      Motor      |
                                                            +-----------------+
                                                            | - tipo: String  |
                                                            +-----------------+
                                                            | + getTipo()     |
                                                            +-----------------+
```

En este diagrama:
- **Persona** tiene una relación de asociación con **Trabajo**.
- **Trabajo** tiene una relación de agregación con **Persona**.
- **Coche** tiene una relación de composición con **Motor**.

Estas relaciones ayudan a modelar cómo las clases interactúan y dependen unas de otras en el sistema.

## Tema 3: Lenguaje Orientado a Objetos
**Concepto**: Los lenguajes orientados a objetos, como Java, permiten definir clases y crear objetos que encapsulan datos y comportamiento. Fomentan la modularidad y la reutilización del código.

**Ejemplo**:
```java
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

Persona persona1 = new Persona("Juan", 30);
persona1.mostrarInfo();
```

## Tema 4: Tipos de Datos y Operadores
**Concepto**: Java soporta varios tipos de datos como int, double, boolean, char, entre otros. Además, proporciona operadores aritméticos (+, -, *, /), lógicos (&&, ||, !), y relacionales (==, !=, <, >).

**Ejemplo**:
```java
int a = 5;
int b = 10;
int suma = a + b;
boolean esMayor = a > b;

System.out.println("Suma: " + suma);
System.out.println("¿a es mayor que b? " + esMayor);
```

## Tema 5: Strings (Cadenas de Texto)
**Concepto**: Las cadenas (String) son objetos que representan secuencias de caracteres. Java proporciona varios métodos para manipular cadenas, como length(), substring(), toUpperCase(), entre otros.

**Ejemplo**:
```java
String saludo = "Hola, mundo!";
System.out.println(saludo.toUpperCase()); // Imprime "HOLA, MUNDO!"
System.out.println("Longitud: " + saludo.length()); // Imprime la longitud de la cadena
```

## Tema 6: Estructuras de Selección
**Concepto**: Las estructuras de selección (if, else, switch) permiten tomar decisiones en el flujo del programa basado en condiciones lógicas.

**Ejemplo**:
```java
int numero = 10;
if (numero > 0) {
    System.out.println("El número es positivo.");
} else {
    System.out.println("El número es negativo o cero.");
}

int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
        break;
}
```

## Tema 7: Estructura de Repetición
**Concepto**: Las estructuras de repetición (for, while, do-while) permiten ejecutar un bloque de código varias veces de forma controlada.

**Ejemplo**:
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración: " + i);
}

int j = 0;
while (j < 5) {
    System.out.println("Iteración: " + j);
    j++;
}

int k = 0;
do {
    System.out.println("Iteración: " + k);
    k++;
} while (k < 5);
```

## Tema 8: Arreglos
**Concepto**: Un arreglo es una estructura de datos que almacena elementos del mismo tipo en una secuencia contigua. Se accede a los elementos mediante índices.

**Ejemplo**:
```java
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    System.out.println(num);
}

String[] nombres = {"Ana", "Luis", "Pedro"};
for (int i = 0; i < nombres.length; i++) {
    System.out.println(nombres[i]);
}
```

## Tema 9: Manejo de Errores
**Concepto**: El manejo de errores en Java se realiza mediante excepciones (try, catch, finally). Permite capturar y manejar errores en tiempo de ejecución, evitando que el programa termine abruptamente.

**Ejemplo**:
```java
try {
    int resultado = 10 / 0; // Esto causará una excepción ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    System.out.println("Bloque finally ejecutado.");
}

try {
    String texto = null;
    System.out.println(texto.length()); // Esto causará una excepción NullPointerException
} catch (NullPointerException e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Tema 10: Métodos y Parámetros
**Concepto**: Los métodos son bloques de código que realizan una tarea específica. Pueden recibir parámetros y devolver valores. Los métodos se definen dentro de las clases.

**Ejemplo**:
```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
}

Calculadora calc = new Calculadora();
System.out.println("Suma: " + calc.sumar(5, 3));
System.out.println("Resta: " + calc.restar(5, 3));
```

## Tema 11: Clases y Objetos
**Concepto**: Las clases son moldes para crear objetos, y los objetos son instancias de clases que encapsulan datos y comportamientos relacionados. Las clases definen atributos y métodos.

**Ejemplo**:
```java
public class Coche {
    String marca;
    String modelo;
    
    void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " ha arrancado.");
    }
}

Coche miCoche = new Coche();
miCoche.marca = "Toyota";
miCoche.modelo = "Corolla";
miCoche.arrancar();
```

## Tema 12: Métodos Avanzados
**Concepto**: Los métodos avanzados pueden incluir técnicas como la sobrecarga y la recursión. La sobrecarga permite definir múltiples métodos con el mismo nombre pero diferentes parámetros.

**Ejemplo**:
```java
public class Matematicas {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

Matematicas mat = new Matematicas();
System.out.println("Suma de dos números: " + mat.sumar(2, 3));
System.out.println("Suma de tres números: " + mat.sumar(2, 3, 4));
```

## Tema 13: Constructores y Destructor
**Concepto**: Los constructores son métodos especiales que se utilizan para inicializar objetos. En Java, no existe un destructor como en otros lenguajes; en su lugar, se usa el recolector de basura (garbage collector) para liberar memoria.

**Ejemplo**:
```java
public class Persona {
    String nombre;
    int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

Persona persona1 = new Persona("Juan", 25);
persona1.mostrarInfo();
```

## Tema 14: Relaciones Avanzadas entre Clases
**Concepto**: Las relaciones avanzadas entre clases incluyen herencia, composición y agregación. La herencia permite que una clase herede atributos y métodos de otra clase. La composición y la agregación permiten crear clases complejas a partir de clases más simples.

**Ejemplo**:
```java
public class Motor {
    String tipo;
    
    public Motor(String tipo) {
        this.tipo = tipo;
    }
}

public class Coche {
    Motor motor;
    
    public Coche(Motor motor) {
        this.motor = motor;
    }
    
    public void mostrarInfo() {
        System.out.println("Coche con motor: " + motor.tipo);
    }
```

## Tema 15: Abstracción y Modelado
**Concepto**: La abstracción es una técnica que permite enfocarse en los aspectos esenciales de una entidad, ocultando los detalles innecesarios. En POO, se puede utilizar la abstracción para crear clases abstractas y métodos abstractos que definen comportamientos comunes para sus subclases.

**Ejemplo**:
```java
abstract class Animal {
    String nombre;

    abstract void hacerSonido();

    void mostrarNombre() {
        System.out.println("El nombre del animal es: " + nombre);
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

Perro perro = new Perro();
perro.nombre = "Firulais";
perro.hacerSonido();
perro.mostrarNombre();

Gato gato = new Gato();
gato.nombre = "Miau";
gato.hacerSonido();
gato.mostrarNombre();
```

## Tema 16: Encapsulamiento y Modificadores
**Concepto**: El encapsulamiento es una técnica que protege los datos de un objeto haciéndolos inaccesibles desde fuera de su clase, salvo a través de métodos definidos. Los modificadores de acceso (private, protected, public) controlan el acceso a los miembros de una clase.

**Ejemplo**:
```java
public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }
}

CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 1000.0);
cuenta.depositar(500.0);
cuenta.retirar(200.0);
System.out.println("Saldo actual: " + cuenta.getSaldo());
```

## Tema 17: Fundamentos de Herencia
**Concepto**: La herencia es una característica que permite que una clase herede propiedades y métodos de otra clase. Esto facilita la reutilización del código y la creación de jerarquías de clases.

**Ejemplo**:
```java
public class Animal {
    String nombre;

    void comer() {
        System.out.println(nombre + " está comiendo");
    }
}

public class Perro extends Animal {
    void ladrar() {
        System.out.println(nombre + " está ladrando");
    }
}

Perro perro = new Perro();
perro.nombre = "Rex";
perro.comer();
perro.ladrar();
```

## Tema 18: Modificadores y Herencia
**Concepto**: Los modificadores (private, protected, public) definen el nivel de acceso de los miembros de una clase y afectan cómo estos miembros pueden ser heredados por otras clases.

**Ejemplo**:
```java
public class Animal {
    protected String nombre;

    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class Gato extends Animal {
    public void maullar() {
        hacerSonido();
        System.out.println(nombre + " está maullando");
    }
}

Gato gato = new Gato();
gato.nombre = "Misu";
gato.maullar();
```

## Tema 19: Conceptos de Polimorfismo
**Concepto**: El polimorfismo permite que una interfaz o una clase base sea utilizada para representar varias clases derivadas. Esto facilita la reutilización y flexibilidad del código.

**Ejemplo**:
```java
public class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

Animal miAnimal = new Perro();
miAnimal.hacerSonido(); // Salida: El perro ladra

miAnimal = new Gato();
miAnimal.hacerSonido(); // Salida: El gato maúlla
```

## Tema 20: Conversión de Objetos
**Concepto**: La conversión de objetos permite convertir un objeto de una clase a otra clase relacionada. Esto puede ser útil en situaciones donde se necesita tratar un objeto de una subclase como si fuera de una clase base y viceversa.

**Ejemplo**:
```java
public class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }

    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

Animal miAnimal = new Perro();
miAnimal.hacerSonido(); // Salida: El perro ladra

if (miAnimal instanceof Perro) {
    Perro miPerro = (Perro) miAnimal; // Conversión explícita
    miPerro.ladrar(); // Salida: El perro está ladrando
}