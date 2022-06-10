# HERENCIA EN JAVA 

 Es el mecanismo por el cual una clase puede heredar las características (atributos y métodos) de otra clase.

 - Estructurar nuestros modelos de datos
 - Reutilizar código

 Sintaxis 

 public SubClase extends SuperClase {
     
 }

# Clases abstractas
Las clases abstractas son un mecanismo usado en herencia para establecer los métodos que implementarán las clases hijas sin su implementacion
Aunque las clases abstractas pueden tener métoodos convencionales son usadas normalamentepara el propósito anterior.
Sintaxis
- Los métodos abstractos usan el modificador abstract
- Si una clase tiene un método abstracto hay que marcarla también como abstract

Importante: de las clases abstractas no se pueden instanciar objetos

## Interfaces en Java
Las interfaces son un mecanismo usado  para establecer los métodos que implementarán las clases sin su implementacion
Existen porque en Java no hay herencia múltiple, es decir una clase hija no puede heredar de varias clases padre.


Sintaxis
public interface Identificador {
    //métodos a implementar
}

Son usadas por las clases con la palabra implements
 
 public class Identificador implements Interface1, Interface2 {
     //código
 }
