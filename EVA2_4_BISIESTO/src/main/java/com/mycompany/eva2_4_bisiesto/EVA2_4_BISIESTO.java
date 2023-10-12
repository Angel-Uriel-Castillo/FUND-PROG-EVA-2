/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_4_BISIESTO {

    public static void main(String[] args) {
        Scanner nono = new Scanner (System.in);
        int year, residuo;
        
        System.out.println("introduce el year");
        year = nono.nextInt();
        residuo = year % 4;
        if(residuo==0){
            residuo = year % 100;
            if(residuo==0){
                residuo=year%400;
                if(residuo==0){
                    System.out.println("es bisiesto");
                }else
                    System.out.println("no es bisiesto");
            }else 
                System.out.println("Es bisiest6o");
        }else
            System.out.println("NO es bisiesto");
            
    }
}
