/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_27_areglos;

/**
 *
 * @author uriel
 */
public class EVA2_27_AREGLOS {

    public static void main(String[] args) {
        //declaramos un arreglo que almacena 10 enteros
        //el primer elemnto enta en la posicion 0
        //el ultimo en la posicion n-1, donde n es el tamano
        //del arreglo
        int[] arregloEnteros =new int[10];
        //ACEDER VALORE EN UN ARREGLO:
        arregloEnteros[0] = 100;
        arregloEnteros[1] = 200;
        arregloEnteros[2] = 300;
        arregloEnteros[3] = 400;
        arregloEnteros[4] = 500;
        arregloEnteros[5] = 600;
        arregloEnteros[6] = 700;
        arregloEnteros[7] = 800;
        arregloEnteros[8] = 900;
        arregloEnteros[9] = 1000;
        System.out.println("valores en psicion 0: "+arregloEnteros[0]);
        String[] arregloCade=new String[5];
        arregloCade[0]="hola";
        arregloCade[1]=" ";
        arregloCade[2]="mundo";
        arregloCade[3]="";
        arregloCade[4]="Cruel!!!";
        //String[] arregloCade={"hola"," ","mundo"," ","Cruel!!!"};
        int []areglo={5,4,3,2,1};
        System.out.println("pocision areglo 3: "+areglo[3]);
    }
}
