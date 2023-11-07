/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int nume;
        Scanner nono=new Scanner (System.in);
        System.out.println("introduce un numero");
        nume=nono.nextInt();
        
        for(int i=1; i<=nume; i++){
            System.out.print(i);
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");            
        }
        System.out.println("-----------");
        for (int a = nume; a >= 0; a--) {
            System.out.print(a);
            for (int b =1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
