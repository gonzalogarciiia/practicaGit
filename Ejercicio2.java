/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.arrays;

/**
 *Aplicacion que hace...

 * @author gonza
 * 23 mar 2022
 * Hecho por Gonzalo García Muñoz
 */
import java.util.Scanner;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // sout + tab para poner System.out.println("");
        int suma=0;
        int tamanio = 10;
        int arrayNumeros []= new int [tamanio];
        arrayNumeros = rellenarNumerosTeclado(arrayNumeros);
        arrayNumeros = restarEscribir(arrayNumeros, suma);
    }
    
    
    public static int [] rellenarNumerosTeclado (int [] arrayNumeros){
        for (int i=0; i<arrayNumeros.length; i++){
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduce el numero de la posicion " +(i+1));
            arrayNumeros [i] = sc.nextInt();
        }
        return arrayNumeros;
    }
    
    public static int [] restarEscribir (int [] arrayNumeros, int suma) {
        for (int i=0; i<arrayNumeros.length;i++){
            if (arrayNumeros[i] > 0){
                arrayNumeros[i] = arrayNumeros[i]-1;
            }
            suma+= arrayNumeros[i];
            System.out.println("El valor de la posición "+(i+1)+ " es " +arrayNumeros[i]);
        }
        System.out.println("La suma de todos los valores es de "+suma);
        return arrayNumeros;
    }
    
}