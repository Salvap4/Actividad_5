package ejercicio2;

import java.util.Scanner;

public class CombinacionesElementos {

    // Ejercicio 2: Combinaciones de n elementos tomados de k en k.
    // Descripción: Escribe un programa que calcule las combinaciones posibles de n elementos tomados de k en k utilizando recursividad. Una combinación es un subconjunto de tamaño k extraído de un conjunto den elementos.

    // Fórmula de combinaciones:

    // Requisitos

    // El usuario debe ingresar n (el tamaño del conjunto) y k (el tamaño del subconjunto).
    // Usa recursividad para calcular el número total de combinaciones.
    // Muestra el número total de combinaciones posibles.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del conjunto (n): ");
        int n = entrada.nextInt();
        System.out.print("Ingresa el tamaño del subconjunto (k): ");
        int k = entrada.nextInt();

        System.out.println("El número total de combinaciones posibles es: "+calcular(n, k));

        entrada.close();
    }

    public static int calcular(int n, int k) {
        if (k == 0 || k == n) return 1;
        return (calcular(n-1, k-1) + calcular(n-1, k));
    }
}
