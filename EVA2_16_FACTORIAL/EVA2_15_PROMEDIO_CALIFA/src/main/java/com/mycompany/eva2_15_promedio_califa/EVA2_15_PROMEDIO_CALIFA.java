/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_promedio_califa;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_15_PROMEDIO_CALIFA {

    public static void main(String[] args) {
        
        Scanner nono = new Scanner(System.in);
        
        System.out.println("¿Cuántas calificaciones va a capturar?: ");
        int cali = nono.nextInt();
        
        int sumacali=0;
        for (int i = 1; i <= cali; i++) {
            System.out.println("Ingrese la calificación:");
            int cali1 = nono.nextInt();
            sumacali= sumacali + cali1;
        }
        System.out.println("LA SUMATORIA = "+ sumacali);
        double prom= sumacali/(cali*1.0);
        System.out.println("El promedio de sus califiaciones es de: "+ prom);
    }
}
