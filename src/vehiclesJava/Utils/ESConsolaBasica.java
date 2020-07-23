/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package vehiclesJava.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;



/*
 * Clase que implementa la interfaz EntradaSalidaConsola
 * 
 * 'leerDeConsola' -> este método propio d eesta clase recibe como parámetro la pregunta 
 * y devuelve la respuesta tecleada en consola.
 */
public class ESConsolaBasica implements ESConsola {


    private Scanner lector = new Scanner(System.in);

	
    //recibe el texto de la pregunta y devuelve la respuesta
    public String repuestaAPregunta (String textoPregunta) {
    	System.out.print(textoPregunta);
		return(lector.nextLine());	
	}
    
    public float respuestaFloatAPregunta (String textoPregunta) {
    	
    	float respuesta=0;
    	boolean salir=false;
    	System.out.print(textoPregunta);

    	do {
    		try {
    			respuesta = lector.nextFloat();
    			salir=true;
				
			} catch (NumberFormatException e) {
				System.out.println("Debes escribir un número decimal." + textoPregunta);
				lector.next();
			} catch (InputMismatchException e) {
				System.out.println("Debes escribir un número decimal." + textoPregunta);
				lector.next();
			}
    	}
    	while (!salir);
		lector.nextLine();
		return respuesta;
    
    }
  
	
	/*
	 * Método que imprime una matriz de objetos recibidos como parámetros con un texto
	 * de cabecera. 
	 */
	public void imprimirMatriz (Object[] matriz, String textoCabecera) {
		
		System.out.println(textoCabecera);
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i]+ "  ");			
		}
	}
	

	public void imprimirElementosMatriz (Object[] matriz, String textoCabecera, int numElementos) {
		
		if (matriz.length < numElementos) {
			System.out.println("La matriz no tiene tantos elementos. No se imprime nada.");
		}else {
			System.out.println(textoCabecera);
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i]+ "  ");			
			}
		}
	}
}


