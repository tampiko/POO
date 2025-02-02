# POO

## Tema 1 - Fundamentos de programación orientada a objetos

### Fundamentos de programación orientada a objetos

#### Objetivos:

• Comprender los principios básicos de la programación orientada a objetos (POO): clases, objetos, atributos y métodos.

• Diferenciar la programación orientada a objetos de otros paradigmas.

#### Explicación Teórica:

* ¿Qué es la programación orientada a objetos (POO)?

    La POO es un paradigma de programación que organiza el código en torno a objetos, los cuales contienen datos (atributos) y comportamientos (métodos). Esto facilita la reutilización del código y el modelado de problemas del mundo real.


Conceptos clave de la POO:
* *Clase:* Es un plano o plantilla que define los atributos y métodos de un objeto.
* *Objeto:* Es una instancia de una clase que tiene valores concretos en sus atributos y puede ejecutar métodos.
* *Atributos:* Son las propiedades que describen a un objeto.
* *Métodos:* Son las funciones que definen el comportamiento de un objeto.

Ejemplo práctico:
* Clase: *Persona*.
* Objeto: Una persona llamada Ana.
* Atributos: nombre (Ana), edad (25).
* Métodos: saludar().

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

## Tema 3 - Lenguaje orientado a objetos*

El *lenguaje orientado a objetos (OOP)* es un paradigma de programación que organiza el código en torno a objetos, los cuales representan entidades del mundo real o conceptos abstractos. En Java, este enfoque es central y se basa en principios fundamentales que facilitan la creación de software modular, reutilizable y fácil de mantener.

### Principios fundamentales de la orientación a objetos

1.	*Clases y objetos*

    • Una *clase* es una plantilla o molde para crear objetos. Define atributos (variables) y métodos (funciones) que describen el comportamiento y las propiedades de un objeto.
    
    • Un *objeto* es una instancia de una clase. Tiene un estado (valores de sus atributos) y un comportamiento (sus métodos).

    ```java
    // Clase
    public class Persona {
        String nombre;
        int edad;

        // Método
        public void saludar() {
            System.out.println("Hola, mi nombre es " + nombre);
        }
    }

    // Creación de un objeto
    public class Main {
        public static void main(String[] args) {
            Persona persona = new Persona(); // Instancia
            persona.nombre = "Juan";
            persona.edad = 25;
            persona.saludar(); // Salida: Hola, mi nombre es Juan
        }
    }
    ```

2.	*Encapsulamiento*

    Protege los datos de un objeto restringiendo el acceso directo a ellos mediante modificadores de acceso (*private*, *public*, *protected*) y proporciona métodos (getters y setters) para interactuar con ellos.

    ```java
    public class Persona {
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
    ```

3.	*Herencia*

    Permite que una clase (clase hija) herede atributos y métodos de otra clase (clase padre), promoviendo la reutilización del código.

    ```java
    public class Animal {
        public void comer() {
            System.out.println("Este animal está comiendo");
        }
    }

    public class Perro extends Animal {
        public void ladrar() {
            System.out.println("El perro está ladrando");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Perro perro = new Perro();
            perro.comer(); // Salida: Este animal está comiendo
            perro.ladrar(); // Salida: El perro está ladrando
        }
    }
    ```

4.	*Polimorfismo*

    Permite que un objeto tome muchas formas. Los métodos pueden comportarse de manera diferente según el contexto o el tipo de objeto que los invoque.

    ```java
    public class Animal {
        public void hacerSonido() {
            System.out.println("El animal hace un sonido");
        }
    }

    public class Perro extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("Guau guau");
        }
    }

    public class Gato extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("Miau");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal1 = new Perro();
            Animal animal2 = new Gato();

            animal1.hacerSonido(); // Salida: Guau guau
            animal2.hacerSonido(); // Salida: Miau
        }
    }
    ```

5. *Abstracción*

    Se enfoca en los detalles esenciales ocultando los innecesarios. Se logra mediante clases abstractas y/o interfaces.
        
    • *Clase abstracta:* Puede tener métodos con implementación y sin ella.

    • *Interfaz:* Define métodos sin implementación que las clases deben implementar.

    ```java
    // Clase abstracta
    abstract class Figura {
        abstract double calcularArea(); // Método abstracto
    }

    class Circulo extends Figura {
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    class Rectangulo extends Figura {
        double base, altura;

        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        double calcularArea() {
            return base * altura;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Figura circulo = new Circulo(5);
            Figura rectangulo = new Rectangulo(4, 6);

            System.out.println("Área del círculo: " + circulo.calcularArea());
            System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        }
    }
    ```

    #### Ventajas del OOP en Java

    • *Modularidad:* El código se divide en clases y objetos.

    • *Reutilización:* La herencia y el polimorfismo reducen la duplicación de código.

    • *Facilidad de mantenimiento:* El encapsulamiento permite modificar componentes sin afectar otros.

    • *Escalabilidad:* Los programas orientados a objetos son más fáciles de escalar.


## Tema 4 - Tipos de datos y operadores*

### 1. Tipos de datos en Java

* Tipos de datos primitivos.- Son los tipos de datos básicos que Java proporciona directamente.

    *Enteros*

    * byte: 8 bits, valores de -128 a 127.
    * short: 16 bits, valores de -32,768 a 32,767.
    * int: 32 bits, valores de -2³¹ a 2³¹-1 (el más usado para números enteros).
    * long: 64 bits, valores de -2⁶³ a 2⁶³-1 (usar con L al final del número, por ejemplo, 123456L).

    *Decimales*

    * float: 32 bits, para números con decimales (usar con F, por ejemplo, 3.14F).
    * double: 64 bits, para números con decimales más precisos (el más usado para cálculos con decimales).

    *Caracteres y booleanos*

    * char: 16 bits, para un solo carácter Unicode (usar comillas simples, 'A').
    * boolean: 1 bit, para valores lógicos (true o false).

    *Tipos de datos no primitivos*.- Son tipos más complejos que los primitivos, definidos como clases y objetos en Java.

    * *Strings:* Secuencias de caracteres (por ejemplo, "Hola, mundo").

    * *Arreglos:* Estructuras de datos para almacenar múltiples valores del mismo tipo (int[] numeros = {1, 2, 3};).

    * *Clases y Objetos:* Estructuras personalizadas definidas por el programador.


### 2. Operadores en Java

* *Operadores aritméticos*
    * *Tipos de operadores*.- Para realizar operaciones matemáticas básicas.
        | *Operador* | *Descripción* | *Ejemplo* | *Resultado* |
        | --- | --- | --- | --- |
        | + | Suma | 5 + 3 | 8 |
        | - | Resta | 5 - 3 | 2 |
        | * | Multiplicación | 5 * 3 | 15 |
        | / | División | 10 / 2 | 5 |
        | % | Módulo (residuo) | 10 % 3 | 1 |

*	*Operadores relacionales (de comparación)*
    * *Devuelven un valor booleano (true o false) al comparar valores.*
        | Operador | Descripción | Ejemplo Resultado |
        |-|-|-|
        | == | Igualdad | 5 == 3 | false |
        | != | Desigualdad | 5 != 3 | true |
        | > | Mayor que | 5 > 3 | true |
        | < | Menor que | 5 < 3 | false |
        | >= | Mayor o igual que | 5 >= 3 | true |
        | <= | Menor o igual que | 5 <= 3 | false |

* *Operadores lógicos*
    * *Usados para combinar expresiones booleanas.*
        | *Operador* | *Descripción* | *Ejemplo* | *Resultado* |
        | --- | --- | --- | --- |
        | && | AND lógico | true && false | false |
        | ` | OR lógico |  |  |
        | ! | NOT lógico | !true | false |

4.	*Operadores de asignación*
    * *Asignan valores a variables.*

        | *Operador* | *Descripción* | *Ejemplo* | *Resultado* |
        | --- | --- | --- | --- |
        | = | Asignación básica | x = 5 | x será 5 |
        | += | Suma y asigna | x += 3 | x = x + 3 |
        | -= | Resta y asigna | x -= 2 | x = x - 2 |
        | *= | Multiplica y asigna | x *= 2 | x = x * 2 |
        | /= | Divide y asigna | x /= 2 | x = x / 2 |
        | %= | Módulo y asigna | x %= 2 | x = x % 2 |

5.	*Operadores unarios*

    * *Operan sobre un solo operando.*

        |Operador | Descripción | Ejemplo
        |-|-|-
        | + | Indica positivo | +x	+x
        | - | Invierte el signo | -x	-x
        | ++ | Incrementa en 1 (pre o post) | ++x  Incrementa antes
        | -- | Decrementa en 1 (pre o post) | --x  Decrementa antes

#### Calculadora básica con decisiones

```java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        System.out.println("Bienvenido a la calculadora básica en Java.");
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble(); // Tipo de dato double

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Mostrar opciones de operación
        System.out.println("\nElige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Comparar los números");
        System.out.print("Ingresa tu opción: ");
        int opcion = scanner.nextInt(); // Tipo de dato int para opción

        System.out.println(); // Salto de línea

        // Realizar la operación basada en la opción elegida
        switch (opcion) {
            case 1:
                double suma = numero1 + numero2; // Operador aritmético +
                System.out.println("El resultado de la suma es: " + suma);
                break;

            case 2:
                double resta = numero1 - numero2; // Operador aritmético -
                System.out.println("El resultado de la resta es: " + resta);
                break;

            case 3:
                double multiplicacion = numero1 * numero2; // Operador aritmético *
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                break;

            case 4:
                if (numero2 != 0) { // Operador relacional !=
                    double division = numero1 / numero2; // Operador aritmético /
                    System.out.println("El resultado de la división es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            case 5:
                // Operadores de comparación
                if (numero1 > numero2) {
                    System.out.println("El primer número es mayor que el segundo.");
                } else if (numero1 < numero2) {
                    System.out.println("El segundo número es mayor que el primero.");
                } else {
                    System.out.println("Ambos números son iguales.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("\nGracias por usar la calculadora.");
        scanner.close(); // Cerrar el escáner
    }
}
```

## Tema 5 - Strings (cadenas de texto)

*Características de las cadenas en Java*

1. *Inmutabilidad:*

    * Una cadena en Java es *inmutable*, lo que significa que su valor no puede cambiar una vez que se ha creado. Cualquier operación que parezca modificar una cadena realmente crea un nuevo objeto String.

        ```java
        String original = "Hola";
        original.concat(" Mundo"); // Se crea un nuevo String, pero "original" no cambia.
        System.out.println(original); // Salida: Hola
        ```

2. *Clase* String *en Java:*

    * Se encuentra en el paquete java.lang (no necesitas importarla).

    * Tiene numerosos métodos para manipular y analizar cadenas.

3. *Creación de cadenas:*

    ```java
    // Forma literal: Más eficiente porque se almacenan en el pool de cadenas
    // para reutilización.
    String cadena1 = "Hola";

    // Usando el constructor de String: Menos común y crea un nuevo objeto en
    // memoria.
    String cadena2 = new String("Hola"); 
    ```

* *Operaciones comunes con cadenas*

    * *Concatenación*.- Se pueden unir cadenas usando el operador + o el método concat().
        ```java
        String saludo = "Hola";
        String nombre = "Mundo";
        String mensaje = saludo + " " + nombre; // Usando +
        System.out.println(mensaje); // Salida: Hola Mundo

        String otroMensaje = saludo.concat(" ").concat(nombre); // Usando concat()
        System.out.println(otroMensaje); // Salida: Hola Mundo
        ```

    * *Comparación*.- Existen varias formas de comparar cadenas:

        * equals(): Compara el contenido de las cadenas (sensible a mayúsculas/minúsculas).
            ```java
            String cadena1 = "Hola";
            String cadena2 = "hola";
            System.out.println(cadena1.equals(cadena2)); // Salida: false
            ```
	    * equalsIgnoreCase(): Ignora las diferencias entre mayúsculas y minúsculas.
            ```java
            System.out.println(cadena1.equalsIgnoreCase(cadena2)); // Salida: true
            ```

        * *Métodos útiles de la clase String*

            | Método | Descripción | Ejemplo |
            | - | - | - |
            |length() | Devuelve la longitud de la cadena. | "Hola".length(); // 4 |
            |charAt(int index) | Devuelve el carácter en una posición específica. | "Hola".charAt(1); // 'o' |
            |substring(int begin) | Extrae una subcadena desde una posición dada. | "Hola".substring(1); // "ola" |
            |substring(int b, int e) | Extrae una subcadena entre dos posiciones. | "Hola".substring(1, 3); // "ol" |
            |toUpperCase() | Convierte a mayúsculas. | "Hola".toUpperCase(); // "HOLA" |
            |toLowerCase() | Convierte a minúsculas. | "Hola".toLowerCase(); // "hola" |
            |trim() | Elimina espacios al inicio y al final. | " Hola ".trim(); // "Hola" |
            |replace(char, char) | Reemplaza caracteres en la cadena. | "Hola".replace('o', 'u'); // "Hula" |
            |contains(CharSequence) | Verifica si contiene una subcadena. | "Hola Mundo".contains("Mundo"); // true |
            |startsWith(String) | Verifica si empieza con una subcadena. | "Hola".startsWith("Ho"); // true |
            |endsWith(String) | Verifica si termina con una subcadena. | "Hola".endsWith("la"); // true 

## Tema 6 - Estructuras de control
### Las estructuras de control permiten dirigir el flujo de la ejecución del programa según ciertas condiciones.

* If-else - Permite ejecutar bloques de código según una condición.
    ```java
    int numero = 10;

    if (numero > 0) {
        System.out.println("El número es positivo");
    } else {
        System.out.println("El número es negativo o cero");
    }
    ```
* Switch - Selecciona una de entre varias alternativas basándose en el valor de una expresión.

    ```java
    int dia = 3;
    String nombreDia;

    switch (dia) {
        case 1:
            nombreDia = "Lunes";
            break;
        case 2:
            nombreDia = "Martes";
            break;
        case 3:
            nombreDia = "Miércoles";
            break;
        case 4:
            nombreDia = "Jueves";
            break;
        case 5:
            nombreDia = "Viernes";
            break;
        case 6:
            nombreDia = "Sábado";
            break;
        case 7:
            nombreDia = "Domingo";
            break;
        default:
            nombreDia = "Día inválido";
            break;
    }
    System.out.println("El día seleccionado es " + nombreDia);
    ```
## Tema 7 - Estructura de repetición
* For - Repite un bloque de código un número determinado de veces.
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.println("Iteración: " + i);
    }
    ```
* While - Repite un bloque de código mientras una condición sea verdadera.
    ```java
    int contador = 0;
    while (contador < 5) {
        System.out.println("Contador: " + contador);
        contador++;
    }
    ```
* Do-while - Similar al while, pero asegura que el bloque de código se ejecute al menos una vez.
    ```java
    int numero = 0;
    do {
        System.out.println("Número: " + numero);
        numero++;
    } while (numero < 5);
    ```

## Tema 8 - Arreglos
Los arreglos (o arrays) son una estructura de datos fundamental que permite almacenar múltiples valores del mismo tipo en una única variable.

*¿Qué es un arreglo?*

* Un arreglo es una colección de elementos del mismo tipo almacenados en ubicaciones de memoria contiguas. Los arreglos en Java son de tamaño fijo, lo que significa que debes definir su tamaño al momento de su creación.

### Arreglos Unidireccionales

```java
// Defines el tipo y el nombre del arreglo.
int[] numeros;

//Aquí es donde asignas memoria al arreglo y especificas su tamaño.
numeros = new int[5];

// También puedes combinar ambas etapas en una sola línea:
int[] numeros = new int[5];

// Puedes inicializar los elementos del arreglo al momento de su creación:
int[] numeros = {1, 2, 3, 4, 5};

// Puedes acceder a los elementos del arreglo utilizando su índice. Los índices en ```Java comienzan en 0.
int primerNumero = numeros[0];  // Accede al primer elemento
System.out.println("Primer número: " + primerNumero);

// Puedes cambiar el valor de los elementos en el arreglo asignándoles nuevos valores utilizando su índice.
numeros[0] = 10;  // Modifica el primer elemento
System.out.println("Nuevo primer número: " + numeros[0]);
````

Ejemplos prácticos
1. Recorrer un arreglo con un bucle for
    ```java
    int[] numeros = {1, 2, 3, 4, 5};

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Número en la posición " + i + ": " + numeros[i]);
    }
    ```
2. Sumar todos los elementos de un arreglo
    ```java
    int[] numeros = {1, 2, 3, 4, 5};
    int suma = 0;

    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }
    System.out.println("La suma de todos los números es: " + suma);
    ```

3. Buscar un elemento en un arreglo
    ```java
    int[] numeros = {1, 2, 3, 4, 5};
    int buscar = 3;
    boolean encontrado = false;

    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == buscar) {
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        System.out.println("El número " + buscar + " está en el arreglo.");
    } else {
        System.out.println("El número " + buscar + " no está en el arreglo.");
    }

### Arreglos Bidireccionales
Los arreglos bidimensionales se utilizan para representar tablas de datos, matrices o cualquier otra estructura de datos que requiera dos dimensiones.

*¿Qué es un arreglo bidimensional?*
    
* Un arreglo bidimensional (también conocido como matriz) es una colección de elementos organizados en filas y columnas, formando una tabla.


```java
// Define el tipo y el nombre del arreglo.
int[][] matriz;

// Se asigna memoria al arreglo especificando el número de filas y columnas.
matriz = new int[3][4]; // 3 filas y 4 columnas

// También se pueden combinar ambas etapas en una sola línea:
int[][] matriz = new int[3][4];

// Se pueden inicializar los elementos al momento de la creación:
int[][] matriz = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};

// Se puede acceder a los elementos utilizando su índice de fila y columna.
int valor = matriz[1][2]; // Accede al elemento en la fila 1 y columna 2
System.out.println("Valor en la posición [1][2]: " + valor);

// Se puede cambiar el valor de los elementos utilizando su índice.
matriz[0][0] = 10; // Modifica el elemento en la fila 0 y columna 0
System.out.println("Nuevo valor en la posición [0][0]: " + matriz[0][0]);
````
Ejemplos prácticos
1. Recorrer un arreglo bidimensional con bucles for
    ```java
    int[][] matriz = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.println("Elemento en la posición [" + i + "][" + j + "]: " + matriz[i][j]);
        }
    }
    ```
2. Sumar todos los elementos de un arreglo bidimensional
    ```java
    int[][] matriz = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };
    int suma = 0;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            suma += matriz[i][j];
        }
    }

    System.out.println("La suma de todos los elementos es: " + suma);
    ```
3. Buscar un elemento en un arreglo bidimensional
    ```java
    int[][] matriz = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };
    int buscar = 7;
    boolean encontrado = false;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            break;
        }
    }

    if (encontrado) {
        System.out.println("El número " + buscar + " está en la matriz.");
    } else {
        System.out.println("El número " + buscar + " no está en la matriz.");
    }
    ```

## Tema 9 - Manejo de Errores
El manejo de errores es fundamental para garantizar que los programas se comporten de manera correcta y predecible ante situaciones inesperadas. Existen principalmente dos tipos de errores que se pueden manejar:

* *Errores en tiempo de compilación (Compile-time errors)*

    * Estos errores ocurren durante la compilación del programa
    
        Son típicamente errores de sintaxis o problemas con la estructura del código que impiden que el programa se compile correctamente. Algunos ejemplos comunes incluyen:
        * Errores de sintaxis: Cometer errores en la escritura del código, como olvidarse de un punto y coma (;), paréntesis de cierre, llaves, etc.
        * Errores de tipo: Intentar asignar un valor de un tipo de datos a una variable de otro tipo de datos incompatible.
        * Errores de declaración: Utilizar variables que no han sido declaradas o métodos que no han sido definidos.

        Ejemplo de error de sintaxis:

        ```java
        int numero = 10
        System.out.println("Número: " + numero); // Falta el punto y coma al final de la primera línea
        ```
* *Errores en tiempo de ejecución (Runtime errors)*
    * Estos errores ocurren mientras el programa se está ejecutando. Aunque el programa haya compilado correctamente, puede encontrarse con situaciones imprevistas durante su ejecución que provoquen un error. Los errores en tiempo de ejecución se pueden manejar utilizando excepciones.
    
    * Excepciones (Exceptions).- Las excepciones son eventos anormales que ocurren durante la ejecución del programa y que interrumpen su flujo normal. Java proporciona una estructura para manejar excepciones de manera controlada mediante las sentencias try, catch, finally y throw.

        *Try-catch:* Permite intentar ejecutar un bloque de código y capturar cualquier excepción que ocurra.

        ```java
        try {
            int resultado = 10 / 0; // Esto generará una ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
        ```
        *Finally:* Se utiliza para ejecutar un bloque de código sin importar si se ha lanzado una excepción o no. Es útil para liberar recursos o cerrar conexiones.

        ```java
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]); // Esto generará una ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo.");
        } finally {
            System.out.println("Esto se ejecutará siempre, haya o no excepción.");
        }
        ```
        *Throw:* Permite lanzar una excepción de manera explícita.
        ```java
        public void validarEdad(int edad) {
            if (edad < 18) {
                throw new IllegalArgumentException("La edad debe ser mayor o igual a 18.");
            }
        }
        ```

## Tema 10 - Métodos y parámetros

Los métodos son bloques de código que realizan una tarea específica y pueden ser reutilizados en diferentes partes del programa. Los métodos pueden recibir parámetros (también conocidos como argumentos) para personalizar su comportamiento.

* *Declaración de métodos*

    Un método en Java se declara dentro de una clase y tiene la siguiente estructura:

    ```java
    public class MiClase {
        // Declaración de un método
        public void miMetodo() {
            // Código del método
        }
    }
    ```
* *Componentes de un método*

    Modificadores de acceso, determinan la visibilidad del método (opcional)
    * public
    * private
    * protected

* *Tipo de retorno*.- El tipo de dato que el método devuelve (por ejemplo, int, double, String). Si el método no devuelve nada, se usa void.
* *Nombre del método*.- Un identificador único que sigue las reglas de nomenclatura de Java.
* *Parámetros (opcional)*.- Una lista de variables que el método puede recibir para procesar.

Ejemplo de un método sin parámetros
```java
public class MiClase {
    // Método que imprime un saludo
    public void saludar() {
        System.out.println("¡Hola, mundo!");
    }
}
```
Métodos con parámetros

Los métodos pueden recibir uno o más parámetros para realizar operaciones específicas con esos valores. Los parámetros se declaran dentro de los paréntesis del método.

```java
public class MiClase {
    // Método que imprime un mensaje personalizado
    public void saludarConNombre(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }
}

// Ejemplo de un método que devuelve un valor

public class Calculadora {
    // Método que suma dos números y devuelve el resultado
    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
```
Ejemplos prácticos
1. Llamada a un método sin parámetros
    ```java
    public class Principal {
        public static void main(String[] args) {
            MiClase miObjeto = new MiClase();
            miObjeto.saludar(); // Llama al método saludar
        }
    }
    ```
2. Llamada a un método con parámetros
    ```java
    public class Principal {
        public static void main(String[] args) {
            MiClase miObjeto = new MiClase();
            miObjeto.saludarConNombre("Ana"); // Llama al método saludarConNombre con el parámetro "Ana"
        }
    }
    ```
3. Llamada a un método que devuelve un valor
    ```java
    public class Principal {
        public static void main(String[] args) {
            Calculadora calc = new Calculadora();
            int resultado = calc.sumar(5, 3); // Llama al método sumar y almacena el resultado
            System.out.println("La suma es: " + resultado);
        }
    }
    ```

Beneficios de usar métodos:
* Reusabilidad: Puedes llamar a un método varias veces en diferentes lugares sin repetir el mismo código.
* Mantenimiento: Si necesitas cambiar la forma en que se realiza una tarea, solo debes modificar el método.
* Modularidad: Los métodos dividen el programa en partes más pequeñas y manejables, mejorando la legibilidad y organización del código.

## Tema 11 - Clases y objetos

La programación orientada a objetos (POO) es una técnica que se basa en el uso de clases y objetos para estructurar los programas.

*¿Qué es una clase?*
  * Una clase es una plantilla o modelo que define las propiedades (atributos) y comportamientos (métodos) de los objetos. Es como un plano que describe cómo deben ser los objetos.

*¿Qué es un objeto?*
  * Un objeto es una instancia de una clase. Representa una entidad individual con un estado y un comportamiento definido por su clase.

*Declaración de una clase*
  * Vamos a crear una clase llamada Persona con algunos atributos y métodos:
    ```java
    public class Persona {
        // Atributos
        String nombre;
        int edad;

        // Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Métodos
        public void saludar() {
            System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
    }
    ```
*Componentes de una clase:* Atributos: Variables que almacenan los datos del objeto.

*Constructor:* Un método especial que se llama cuando se crea un objeto de la clase.

*Métodos:* Funciones que definen el comportamiento del objeto.

*Creación de objetos*
  * Para crear un objeto de una clase, utilizamos la palabra clave new junto con el constructor de la clase.

    ```java
    public class Principal {
        public static void main(String[] args) {
            // Crear un objeto de la clase Persona
            Persona persona1 = new Persona("Ana", 25);

            // Llamar a los métodos del objeto
            persona1.saludar();
        }
    }
    ```
Ejemplos prácticos
1. Clase Coche con atributos y métodos
    ```java
    public class Coche {
        // Atributos
        String marca;
        String modelo;
        int año;

        // Constructor
        public Coche(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }

        // Métodos
        public void mostrarDetalles() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
        }
    }
    ```
2. Crear y utilizar objetos de la clase Coche
    ```java
    public class Principal {
        public static void main(String[] args) {
            // Crear objetos de la clase Coche
            Coche coche1 = new Coche("Toyota", "Corolla", 2020);
            Coche coche2 = new Coche("Honda", "Civic", 2019);

            // Llamar a los métodos de los objetos
            coche1.mostrarDetalles();
            coche2.mostrarDetalles();
        }
    }
    ```
*Encapsulamiento*
  * El encapsulamiento es un principio de la POO que se refiere a restringir el acceso directo a los atributos de una clase y proporcionar métodos de acceso (getters) y modificación (setters) para ellos.

Ejemplo de encapsulamiento en la clase Persona
```java
public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
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

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
```

La herencia y el polimorfismo son dos conceptos clave en la programación orientada a objetos. Permiten crear estructuras de código más reutilizables y flexibles.

*Herencia*
  * La herencia es un mecanismo que permite crear una nueva clase a partir de una clase existente. La nueva clase (clase derivada o subclase) hereda los atributos y métodos de la clase existente (clase base o superclase), y puede agregar nuevos atributos y métodos o modificar los existentes.

Supongamos que tenemos una clase Animal y queremos crear una clase Perro que herede de Animal.

```java
// Superclase
public class Animal {
    String nombre;

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Subclase
public class Perro extends Animal {
    // Método propio de la subclase
    public void moverCola() {
        System.out.println("El perro mueve la cola.");
    }

    // Sobrescribe el método de la superclase
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

public class Principal {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.hacerSonido(); // Llama al método sobrescrito en Perro
        miPerro.moverCola();   // Llama al método propio de la clase Perro
    }
}
```
*Polimorfismo*
  * El polimorfismo permite a un objeto tomar muchas formas. En otras palabras, una referencia de la clase base puede referirse a objetos de la clase derivada. Existen dos tipos principales de polimorfismo en Java: polimorfismo en tiempo de compilación (sobrecarga de métodos) y polimorfismo en tiempo de ejecución (sobrescritura de métodos).

Continuando con el ejemplo anterior, el polimorfismo en tiempo de ejecución se logra mediante la sobrescritura de métodos.

```java
public class Principal {
    public static void main(String[] args) {
        Animal miAnimal = new Perro(); // Polimorfismo en tiempo de ejecución
        miAnimal.hacerSonido(); // Llama al método sobrescrito en Perro
    }
}
```
En este ejemplo, aunque miAnimal es una referencia de tipo Animal, en tiempo de ejecución se llama al método hacerSonido de la clase Perro, gracias al polimorfismo.

La sobrecarga de métodos ocurre cuando varios métodos en la misma clase tienen el mismo nombre pero diferentes listas de parámetros.

```java
public class Calculadora {
    // Sobrecarga del método sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma de 2 enteros: " + calc.sumar(2, 3));
        System.out.println("Suma de 2 dobles: " + calc.sumar(2.5, 3.5));
        System.out.println("Suma de 3 enteros: " + calc.sumar(1, 2, 3));
    }
}
```

Las clases pueden interactuar entre sí de varias maneras, lo que permite crear programas más complejos y organizados. 

* *Asociación:* es una relación en la que una clase utiliza o se relaciona con otra clase. Puede ser una relación unidireccional o bidireccional.

    Ejemplo de asociación unidireccional
    ```java
    public class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }

    public class Trabajo {
        private String puesto;
        private Persona empleado; // Asociación con la clase Persona

        public Trabajo(String puesto, Persona empleado) {
            this.puesto = puesto;
            this.empleado = empleado;
        }

        public void mostrarDetalles() {
            System.out.println("Puesto: " + puesto);
            System.out.println("Empleado: " + empleado.getNombre() + ", Edad: " + empleado.getEdad());
        }
    }
    ```
* *Agregación:* es un tipo de asociación donde una clase es una colección o un conjunto de otras clases. La agregación implica una relación de "tiene un".

    Ejemplo de agregación
    ```java
    public class Libro {
        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }

    public class Biblioteca {
        private String nombre;
        private List<Libro> libros; // Agregación: una biblioteca tiene una colección de libros

        public Biblioteca(String nombre) {
            this.nombre = nombre;
            this.libros = new ArrayList<>();
        }

        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public void mostrarLibros() {
            for (Libro libro : libros) {
                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
            }
        }
    }
    ```
* *Composición:* es una forma más fuerte de agregación donde una clase está compuesta por una o más instancias de otras clases. En la composición, las instancias de las clases componentes no pueden existir independientemente de la clase que las contiene.

    Ejemplo de composición
    ```java
    public class Motor {
        private String tipo;

        public Motor(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }

    public class Coche {
        private String marca;
        private Motor motor; // Composición: un coche tiene un motor

        public Coche(String marca, String tipoMotor) {
            this.marca = marca;
            this.motor = new Motor(tipoMotor); // El motor se crea junto con el coche y no puede existir independientemente
        }

        public void mostrarDetalles() {
            System.out.println("Marca: " + marca);
            System.out.println("Tipo de motor: " + motor.getTipo());
        }
    }
    ```
* *Herencia:* permite que una clase herede atributos y métodos de otra clase. Esto también es una forma de relación entre clases.

    Ejemplo de herencia
    ```java
    // Superclase
    public class Animal {
        protected String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public void hacerSonido() {
            System.out.println("El animal hace un sonido.");
        }
    }

    // Subclase
    public class Gato extends Animal {
        public Gato(String nombre) {
            super(nombre);
        }

        @Override
        public void hacerSonido() {
            System.out.println("El gato maúlla.");
        }
    }
    ```
    Ejemplo práctico de relaciones entre clases, uniendo varios conceptos en un ejemplo más complejo:
    ```java
    public class Principal {
        public static void main(String[] args) {
            // Crear objetos
            Persona empleado = new Persona("Ana", 30);
            Trabajo trabajo = new Trabajo("Desarrollador", empleado);
            Coche coche = new Coche("Toyota", "V8");

            // Mostrar detalles
            trabajo.mostrarDetalles();
            coche.mostrarDetalles();
        }
    }```


