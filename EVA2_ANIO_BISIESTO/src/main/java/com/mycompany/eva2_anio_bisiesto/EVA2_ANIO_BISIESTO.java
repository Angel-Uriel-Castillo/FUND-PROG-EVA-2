/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_ANIO_BISIESTO {

    public static void main(String[] args) {
        Scanner nono = new Scanner (System.in);
        int resi4,resi100,resi400;
        System.out.println("introdce el anio");
        int year = nono.nextInt();
        resi4=year%4;
        resi100=year%100;
        resi400=year%400;
        //&& operador de Y
        //|| operador de O
        //! operador de negacion
        //!= operador diferente a
        if((resi4==0)&&((resi100!=0) || (resi400==0))){
            System.out.println("el year "+year+" es bisiesto");
        }else
            System.out.println("el year "+year+" no es bisiesto");
        }
 
    }