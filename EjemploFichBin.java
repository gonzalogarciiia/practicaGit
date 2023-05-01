package es.maestredam;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EjemploFichBin {
	public static void main(String args[]) {
		String nombres[] = {"Jaime","Javier","Raul"};
		double numeros[] = new double[3];
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = Math.random();
			System.out.printf("%s - %f%n",nombres[i],numeros[i]);
		}
		
		//ESCRITURA EN FICHERO BINARIO	
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("alumnos.dam"))){
			
			//Escribo los datos de Jaime
			
			for(int i=0;i<numeros.length;i++) {
				dos.writeUTF(nombres[i]);
				dos.writeDouble(numeros[i]);
			}
			
			
			
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		System.out.println("--------------------------------------------------");
		try(DataInputStream leer = new DataInputStream(new FileInputStream("alumnos.dam"))){
			
			String nombres2[] = new String[3];
			double numeros2[] = new double[3];	
			
			for(int i=0;i<nombres2.length;i++) {
				nombres2[i] = leer.readUTF();
				numeros2[i] = leer.readDouble();
				System.out.println(nombres2[i]);
				System.out.println(numeros2[i]);
			}
			
		}catch(IOException ioe2) {
			System.out.println(ioe2);
		}
	}

}
