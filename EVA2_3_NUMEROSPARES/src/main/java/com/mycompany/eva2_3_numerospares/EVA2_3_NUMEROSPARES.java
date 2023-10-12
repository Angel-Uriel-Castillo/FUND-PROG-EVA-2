/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_numerospares;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_3_NUMEROSPARES {

    public static void main(String[] args) {
        Scanner nono = new Scanner(System.in);
        int valor, residuo;
        
        System.out.println("Introduce el valor a evaluar");
        valor = nono.nextInt();
        
        residuo = valor%2;
        if (residuo==0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }
}
