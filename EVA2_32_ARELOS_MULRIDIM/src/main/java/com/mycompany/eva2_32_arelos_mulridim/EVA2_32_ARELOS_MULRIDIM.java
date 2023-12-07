/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_32_arelos_mulridim;

/**
 *
 * @author uriel
 */
public class EVA2_32_ARELOS_MULRIDIM {

    public static void main(String[] args) {
        int [][]matriz=new int [3][4];
        matriz [1][3]=100;
        System.out.println("matris[1][3]= "+matriz[1][3]);
        //--------------------
        System.out.println(matriz.length);
        //llenar con valores aleatorios la matriz:
        //filas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*100);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        
    }
}
