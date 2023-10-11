# Evidencia07: Análisis de código y dependencia
link doc: https://docs.google.com/document/d/1vQy9mX0MkM5blpE5vjL6klfZlX8E3fSXrCaD6PduUcA/edit?usp=sharing

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

Tiene el método de multiplicar, el cual multiplica a n1 con n2.

Tiene sus respectivos set para n1 y n2, los cuales son para modificar el entero n1 o n2.

CarroCompra: Esta clase tiene como atributo una matriz de enteros con 2 filas y 5 columnas. La primera fila se utiliza para almacenar la cantidad de cada producto en el carro, y la segunda fila se utiliza para almacenar el precio de cada producto. 

Tiene el método calcularTotal, este calcula el total sumando todos los subtotales de los productos en el carro. 

Tiene el método subTotal, este calcula el subtotal para un producto. Cada subtotal se calcula multiplicando su cantidad por su precio, utilizando el método multiplicar de la clase Calculadora.

Tiene el método mostrarTotal, este es un método que imprime el total del carro, utiliza el método calcularTotal


iii. De lo anterior, establezca una representación detallada del código fuente, usando un diagrama de clases UML y la herramienta de modelado Visual Paradigm.


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/0185fc5f-c7ab-49d3-8937-64bdbedc755d)



iv. Genere un código fuente Java a partir de su modelo de clases.

![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/b7fd0197-1f35-4779-8b37-c4c213788c69)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/9dd988ef-6f94-4349-98ee-16e81e107212)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/a4e42f14-d5b0-42f4-af88-fcfa2415d35f)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/2edd05e3-5cbd-4f0a-b7ee-46b353a1b841)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/b712716c-0f21-4fbf-9547-b034aa9c0a2a)


Codigo copilado


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/a8d9f31e-78ef-4cf3-b863-98222f0ad408)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/ee5634c8-179a-40a3-af78-ab2d8ec20106)


![image](https://github.com/Valehvvv/Evidencia07/assets/142464144/321ee32e-ba20-46c3-a172-b90b3a02c78f)










