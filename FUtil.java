package es.maestredam;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author gonza
 *
 */
public class FUtil {
	
	public static boolean fichExiste(String nombreFichero) {
		boolean existe=true;
		
		try(FileInputStream fis = new FileInputStream("src/es/maestredam/"+nombreFichero)){
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("File not found");
			existe=false;
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		return existe;
	}
	
	public static boolean isPng(String fichImage) {
		boolean esPng = true;
		char[] formatoPng = {' ','P','N','G'};
		
		try(FileInputStream fis = new FileInputStream(fichImage)){
			char caracter;
			
			for(int i=0;i<formatoPng.length;i++) {
				caracter = (char) fis.read();
				if(!(caracter==formatoPng[i]) & i>=1) {
					esPng=false;
				}
			}
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("No encontrado");
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		return esPng;
	}
	

}
