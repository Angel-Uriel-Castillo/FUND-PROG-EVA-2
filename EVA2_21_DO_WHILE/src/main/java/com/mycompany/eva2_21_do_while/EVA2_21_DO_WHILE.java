/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_21_DO_WHILE {

    public static void main(String[] args){
        Scanner nono=new Scanner (System.in);
        int valor;
        do{
            System.out.println("introduce un valor");
            valor=nono.nextInt();
        }while(valor!=100);
            
    }    
}
