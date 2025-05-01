/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosumamaximaada;

public class FuerzaBruta {
    public static void procesar(int[] arr) {
        int maxSuma = 0;
        int inicio = 0, fin = 0;

        for (int i = 0; i < arr.length; i++) {
            int sumaActual = 0;
            for (int j = i; j < arr.length; j++) {
                sumaActual += arr[j];
                if (sumaActual > maxSuma) {
                    maxSuma = sumaActual;
                    inicio = i;
                    fin = j;
                }
            }
        }

        System.out.println("Fuerza bruta: Suma máxima = " + maxSuma);
        System.out.println("Desde el índice " + (inicio + 1) + " hasta " + (fin + 1));
    }
}
