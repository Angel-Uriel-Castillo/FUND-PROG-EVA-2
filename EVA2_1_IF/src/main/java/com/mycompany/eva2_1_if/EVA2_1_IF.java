/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_1_IF {

    public static void main(String[] args) {
        Scanner tata = new Scanner(System.in);
        int califa;
        System.out.println("introduce la calificacion");
        califa = tata.nextInt();
        
        if (califa >=70){ //if (expreicon a evaluar)
            System.out.println("Aprovado viaje a EUA");
            System.out.println("Felicidades!!");
        }else //else----> si no
            System.out.println("No acreditado ponte a chamvear");
            
        System.out.println("Fin del programa");
    }
}
