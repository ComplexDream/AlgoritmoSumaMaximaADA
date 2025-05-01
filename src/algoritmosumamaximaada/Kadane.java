/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosumamaximaada;

public class Kadane {
    public static void procesar(int[] arr) {
        int maxSuma = 0, sumaActual = 0;
        int inicio = 0, fin = 0, tempInicio = 0;

        for (int i = 0; i < arr.length; i++) {
            sumaActual += arr[i];
            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
                inicio = tempInicio;
                fin = i;
            }
            if (sumaActual < 0) {
                sumaActual = 0;
                tempInicio = i + 1;
            }
        }

        System.out.println("Kadane: Suma máxima = " + maxSuma);
        System.out.println("Desde el índice " + (inicio + 1) + " hasta " + (fin + 1));
    }
}
