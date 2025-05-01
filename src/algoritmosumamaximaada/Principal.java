/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosumamaximaada;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú de algoritmo
        System.out.println("Seleccione el algoritmo para procesar el arreglo:");
        System.out.println("1. Kadane (eficiente)");
        System.out.println("2. Fuerza bruta");
        System.out.print("Opción: ");
        int opcionAlgoritmo = scanner.nextInt();

        // Ingreso de tamaño y datos del arreglo
        System.out.print("\n¿Cuántos números desea ingresar? ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Procesar arreglo según algoritmo
        System.out.println("\n--- Resultado ---");
        switch (opcionAlgoritmo) {
            case 1:
                Kadane.procesar(arreglo);
                break;
            case 2:
                FuerzaBruta.procesar(arreglo);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
