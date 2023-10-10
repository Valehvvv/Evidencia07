# Evidencia07: Análisis de código y dependencia


Integrantes 
Maria Jose Powell
Fernanda Muñoz
Valentina Huenchuñir

Profesor
Dr. Samuel Sepulveda

Asignatura
Programación Orientada a Objetos

Fecha
11 de octubre de 2023

Codigos fuentes:

![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/ec65bf3b-d083-48f2-a74f-4857bebeb983)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/7393ef15-5003-47f8-bc12-f4c1c7c1f544)


Actividades a realizar:
i. Identifique las clases y lo que éstas representan. Luego, establezca una descripción textual breve del contexto problema.
Caso 1:
Calculadora: En esta clase se representa una calculadora simple que puede realizar dos de las operaciones básicas, las cuales son sumar y multiplicar dos números enteros, n1 y n2.
CarroCompra: Esta clase representa un carro de compras. Puede contener hasta 5 productos en total, cada uno con una cantidad y un precio.



ii. Analice los atributos y métodos de cada clase, luego, identifique las relaciones existentes entre las clases identificadas y establezca una descripción textual breve del contexto problema.
Calculadora: Esta clase tiene como atributos n1 y n2 los cuales son números enteros, al momento de crear un objeto tipo calculadora se le deben entregar como parámetro los enteros n1 y n2.
Tiene el método de sumar, el cual suma las variables n1 y n2.
Tiene el método de multiplicar, el cual multiplica a n1 con n2 .
Tiene sus respectivos set para n1 y n2, los cuales son para modificar el entero n1 o n2.
CarroCompra: Esta clase tiene como atributo una matriz de enteros con 2 filas y 5 columnas. La primera fila se utiliza para almacenar la cantidad de cada producto en el carro, y la segunda fila se utiliza para almacenar el precio de cada producto. 
Tiene el método calcularTotal, este calcula el total sumando todos los subtotales de los productos en el carro. 
Tiene el método subTotal, este calcula el subtotal para un producto. Cada subtotal se calcula multiplicando su cantidad por su precio, utilizando el método multiplicar de la clase Calculadora.
Tiene el método mostrarTotal, este es un método que imprime el total del carro, utiliza el método calcularTotal


iii. De lo anterior, establezca una representación detallada del código fuente, usando un diagrama de clases UML y la herramienta de modelado Visual Paradigm.
en proceso


iv. Genere un código fuente Java a partir de su modelo de clases.




