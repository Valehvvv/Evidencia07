package org.example;
import java.util.Scanner;

class Calculadora {
    private int n1;
    private int n2;

    public Calculadora(int num1, int num2) {
        this.n1 = num1;
        this.n2 = num2;
    }

    public int sumar() {
        return this.n1 + this.n2;
    }

    public int multiplicar() {
        return this.n1 * this.n2;
    }
}

class CarroCompra {
    private int [ ][ ] productos = new int[2][5];
    private int numProductos = 0;

    public CarroCompra() {

    }

    public void agregarProducto(int cantidad, int precio) {
        if (numProductos < 5) {
            productos[0][numProductos] = cantidad;
            productos[1][numProductos] = precio;
            numProductos++;
        } else {
            System.out.println("El carro está lleno. No se pueden agregar más productos.");
        }
    }

    private int calcularTotal( ) {
        int total = 0;
        for (int i=0; i<numProductos; i++) {
            total += subTotal(productos[0][i], productos[1][i]);
        }
        return total;
    }

    private int subTotal(int cant, int precio) {
        Calculadora calc = new Calculadora(cant, precio);
        return calc.multiplicar();
    }

    public void mostrarTotal() {
        System.out.println("El total de la compra es: " + calcularTotal());
    }

    public int[][] getProductos() {
        return productos;
    }
}

public class Main {
    public static void main(String[] args) {

        CarroCompra carro = new CarroCompra();


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Por favor, selecciona una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Mostrar total");
            System.out.println("4. Salir");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Ingresa la cantidad del producto:");
                int cantidad = scanner.nextInt();
                System.out.println("Ingresa el precio del producto:");
                int precio = scanner.nextInt();
                scanner.nextLine();

                carro.agregarProducto(cantidad, precio);
            } else if (opcion.equals("2")) {

                int[][] productos = carro.getProductos();

                for (int i = 0; i < 5; i++) {
                    System.out.println("Producto " + (i+1) + ":");
                    System.out.println("Cantidad: " + productos[0][i]);
                    System.out.println("Precio: " + productos[1][i]);
                }
            } else if (opcion.equals("3")) {
                carro.mostrarTotal();
            } else if (opcion.equals("4")) {
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }

        scanner.close();
    }
}

