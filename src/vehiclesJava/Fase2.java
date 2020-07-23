/**
 * Fase2 - Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava;

import vehiclesJava.Vehiculos.Coche;
import vehiclesJava.Vehiculos.Componentes.RuedaCoche;


import vehiclesJava.Utils.ESConsolaBasica;

public class Fase2 {
	
	private Coche coche;
	private ESConsolaBasica esConsola = new ESConsolaBasica();

	private String matricula;
	private String color;
	private String marca;
	private RuedaCoche rueda;
	private float diametro;
	
	public void fase2Print() {
		
		
		System.out.println("\nFase2\n");
		
		/*
		 * Fase2. REcogemos los datos del coche. Verificamos que datos nos introduce.
		 * utilizamos un objeto ESConsolaBasica que nos pone un poco de azucar a la recogida
		 * de datos por consola de java.
		 */
		
		color = esConsola.repuestaAPregunta("Dime el color del coche? ");
		marca = esConsola.repuestaAPregunta("Dime la marca del coche? ");
	
		//Creamos el objeto coche con el constructor básico
		coche = new Coche(color, marca);
		
		/*
		 * Recogemos la matrícula verificando que nos introduce una correcta. Utilizamos el método de la clase
		 * coche matriculaCorrecta para verificarlo.
		 */
		while (!coche.matriculaCorrecta(matricula = esConsola.repuestaAPregunta("Dime la matricula del coche: "))) {
			System.out.println("Matrícula incorrecta, debe tener 4 número y dos o tres letras");}
		
		coche.setMatricula(matricula);	
		
		/*
		 * REcogemos los datos de las ruedas. En este caso debemos verificar la introducción del diámetro. Utilizamos
		 * el método de la clase coche diametroCorrecto.
		 * 
		 */
		marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para las delanteras? ");
		
		while(!coche.diametroCorrecto( diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de ruedas delanteras quieres ? "))) {
			System.out.println("No es un diámetro correcto. Este debe estar entre 0,4 y 4");

		}
		//creamos el objeto rueda que pasamos a nuestro coche.
		rueda = new RuedaCoche(diametro, marca);
		coche.setRuedasDelanteras(rueda);

		
		//Repètimos el paso anterior para las ruedas traseras.
				marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para las traseras? ");
		while(!coche.diametroCorrecto( diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de ruedas traseras quieres ? "))) {
			System.out.println("No es un diámetro correcto. Este debe estar entre 0,4 y 4");

		}		
		rueda = new RuedaCoche(diametro, marca);
		coche.setRuedasTraseras(rueda);
		
		
	}
}
	
	
	


