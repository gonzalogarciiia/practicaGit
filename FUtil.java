package es.maestredam;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

}
