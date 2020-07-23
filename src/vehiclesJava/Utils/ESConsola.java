/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package vehiclesJava.Utils;

/*
 * Interfaz que intenta automatizar entradas/salidas de consola más elaboradas o
 * parametrizadas.
 * 
 * 'respuestaAPregunta' -> Recoge una entrada por consola pero imprimiendo antes el 
 * string del parámetro.
 * 'imprimirMatriz' -> imprime una matriz de cualquier objeto con un texto de cabecera .
 * 
 */

public interface ESConsola {
	
	public String repuestaAPregunta (String textoPregunta);
	public void imprimirMatriz (Object[] matriz, String textoCabecera);
	
}

