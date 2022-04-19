/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.arrays;

/**
 *Aplicacion que hace...

 * @author gonza
 * 24 mar 2022
 * Hecho por Gonzalo García Muñoz
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime la longitud del vector");
        int tamanio = sc.nextInt();
        int array1 [] = new int [tamanio];
        array1 = leerNumeros(array1, sc);
        comprobarMayor(array1);
        

    }
    
    public static int [] leerNumeros (int [] array1, Scanner sc){
        
        for (int i=0; i<array1.length; i++){
            System.out.println("Introduce el número de la posición "+(i+1));
            array1 [i] = sc.nextInt();
            
            if (array1[i]!=(-1)){                
            }else{
                break;
            }
        }
        return array1;        
    }
    public static void comprobarMayor (int [] array1){
                int mayor = array1[0];
                int posicion = 0;
               for (int x = 1; x < array1.length; x++) {
			if (array1[x] > mayor) {
                                posicion=x;
				mayor = array1[x];
			}
		}
               System.out.println("El mayor es "+mayor+ " y se encuentra en la posicion " +(posicion + 1));
}
}

    



               