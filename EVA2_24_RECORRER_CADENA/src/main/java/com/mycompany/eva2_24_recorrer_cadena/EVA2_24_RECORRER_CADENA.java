/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_recorrer_cadena;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_24_RECORRER_CADENA {

    public static void main(String[] args) {
        Scanner nono=new Scanner(System.in);
        String  cade;
        System.out.println("introduce un texto:");
        cade=nono.nextLine();
        for (int i =0; i < cade.length(); i++){
            System.out.println(cade.charAt(i));
            
        }
        
    }
}
