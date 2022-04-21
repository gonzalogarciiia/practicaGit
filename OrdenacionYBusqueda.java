/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.arrays;

/**
 *Aplicacion que hace...

 * @author gonza
 * 29 mar 2022
 * Hecho por Gonzalo García Muñoz
 */
import java.util.Scanner;
public class OrdenacionYBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // sout + tab para poner System.out.println("");
                Scanner sc = new Scanner (System.in);

        int [] arrayNumeros=new int[10];
        int valorNumero = sc.nextInt();
        arrayNumeros=rellenarNumerosTeclado(arrayNumeros, sc);
        arrayNumeros=buscarPosicion(arrayNumeros, valorNumero);
        devolverArray(arrayNumeros);
    }

    
    public static int [] rellenarNumerosTeclado (int [] arrayNumeros, Scanner sc){
        for (int i=0; i<arrayNumeros.length; i++){
            System.out.println("Introduce el numero de la posicion " +(i+1));
            arrayNumeros [i] = sc.nextInt();
        }
        return arrayNumeros;
    }
   
    //A pesar de que encuentre un numero, que siga recorriendo un array, y luego 
    //devuelva la posicion/las posiciones en las que se halla/n.
    
    public static int contadorRepeticion (int [] arrayNumeros, int valorNumero){
        int cont=0;
        for (int i=0; i<arrayNumeros.length;i++){
            if (arrayNumeros[i] == valorNumero){
                cont++;
            }
         
        }
        return cont;
    }
    
    public static int [] buscarPosicion (int [] arrayNumeros, int valorNumero ){
        int contador=0;
        int [] posiciones;
        int pos=contadorRepeticion(arrayNumeros, valorNumero);
        if (pos != (0) ){
            posiciones = new int [pos];
        }else{
            posiciones=new int [1];
            posiciones[0]=-1;
        }
        for (int i=0; i<arrayNumeros.length; i++){
            if (arrayNumeros[i] == valorNumero){
                posiciones[contador++]=i;
            }
        } return posiciones;
    }
    public static void devolverArray (int [] posiciones){
        for (int i = 0; i < posiciones.length; i++) {
            System.out.println("El numero que has indicado se encuentra en la posicion "+posiciones[i]);
        }
    }
    
    
}
