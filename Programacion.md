# 15. Tipos de datos primitivos en Java
En Java existen tipos de datos que sirven para almacenar valores simples. Estos tipos no son objetos y representan la base de cualquier programa.

- byte: entero muy pequeño.
- short: entero de tamaño reducido.
- int: entero estándar, el más usado.
- long: entero de gran capacidad.
- float: número decimal con precisión limitada.
- double: número decimal con mayor precisión.
- char: un carácter individual, como 'A' o '#'.
- boolean: valores lógicos, true o false.

En resumen, un tipo primitivo es un valor directo, sin estructura compleja ni comportamiento propio.

# 16. Control de flujo: if, else, switch y ciclos
El control de flujo permite decidir qué instrucciones se ejecutan y cuántas veces, según condiciones específicas.
if / else
Se utiliza para evaluar una condición y ejecutar un bloque u otro dependiendo del resultado.
Ejemplo mental: si hay conexión a internet → descargar; si no, mostrar aviso.
switch
Útil cuando se compara una misma variable contra varias opciones posibles.
Funciona como un menú de decisiones basadas en un único valor.
Ciclos (bucles)
Sirven para repetir instrucciones:

for: repite un número definido de veces.
while: repite mientras la condición siga cumpliéndose.
do-while: ejecuta primero, luego verifica si debe continuar.

Idea clave: if elige caminos, switch organiza varias alternativas y los ciclos permiten repetir procesos.

# 17. Importancia de usar nombres claros en variables y métodos
Elegir nombres descriptivos facilita entender el propósito del código sin necesidad de explicaciones adicionales. Esto ayuda tanto a otros desarrolladores como a ti mismo cuando revises el proyecto más adelante.
Ejemplos:

Correcto: totalFactura
Poco útil: x

Para métodos ocurre lo mismo:

Adecuado: calcularTotal()
Confuso: hacerCosa()

Un buen nombre disminuye errores y aumenta la legibilidad.

# 18. Qué es la Programación Orientada a Objetos (POO)
La POO es un enfoque de desarrollo donde el código se organiza en torno a objetos, que representan elementos del mundo real o conceptos lógicos.
Un objeto combina datos (atributos) y comportamientos (métodos).
Ejemplo:
La clase Persona puede tener nombre, edad y una acción como saludar.
Este estilo de programación permite crear sistemas más organizados, mantenibles y escalables.

# 19. Los cuatro pilares de la POO
Estos principios estructuran cómo deben construirse y relacionarse las clases:

Encapsulación: proteger los datos y permitir acceder a ellos mediante métodos controlados.
Abstracción: mostrar solo lo esencial y ocultar lo que no es necesario para el usuario.
Herencia: crear nuevas clases basadas en otras ya existentes.
Polimorfismo: permitir que distintas clases respondan de forma diferente a un mismo método.


# 20. Herencia en POO y en Java
La herencia permite que una clase derive de otra para reutilizar código.
La clase hija obtiene atributos y métodos de la clase padre, y además puede agregar o modificar comportamiento.
En Java se implementa con extends.
Ejemplo:
Perro extends Animal
> [!NOTE]
> Perro recibe lo básico de Animal, pero añade acciones como ladrar.
Es un mecanismo para reutilizar y especializar.

# 21. Modificadores de acceso en Java
Estos modificadores determinan desde dónde puede accederse a una variable, método o clase.

public: accesible desde cualquier parte.
private: solo visible dentro de la misma clase.
protected: accesible en el mismo paquete y en clases que hereden.
default (sin palabra clave): accesible únicamente dentro del paquete.

Regla general: cuanto más restrictivo, mayor control y seguridad.

# 22. Qué es una variable de entorno y por qué es útil
Una variable de entorno es un valor almacenado en el sistema operativo que un programa puede consultar sin estar escrito directamente en el código.
Beneficios:

Permite manejar datos sensibles sin incluirlos en el programa (como claves o rutas).
Facilita ajustar configuraciones sin recompilar ni modificar archivos internos.
Hace posible ejecutar el mismo software en diferentes equipos sin cambios en el código.
