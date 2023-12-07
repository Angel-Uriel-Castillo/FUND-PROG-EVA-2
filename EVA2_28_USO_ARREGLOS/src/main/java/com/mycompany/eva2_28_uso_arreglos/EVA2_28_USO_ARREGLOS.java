/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_28_USO_ARREGLOS {

    public static void main(String[] args) {
        Scanner nono=new Scanner (System.in);
        int cant;
        int[] califas;
        System.out.println("Cuantas calificaciones quieres camputurar?");
        cant=nono.nextInt();
        califas=new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("introduce la calificacion:");
            califas[i] = nono.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("["+califas[i]+"]");
        }
    }
}
