/**
 * Fase1 - Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava;

import vehiclesJava.Vehiculos.Coche;
import vehiclesJava.Vehiculos.Componentes.RuedaCoche;


import vehiclesJava.Utils.ESConsolaBasica;

public class Fase1 {
	
	private Coche coche;
	private ESConsolaBasica esConsola = new ESConsolaBasica();

	private String matricula;
	private String color;
	private String marca;
	private RuedaCoche rueda;
	private float diametro;
	
	public void fase1Print() {
		
		
		System.out.println("Fase1");
		
		/*
		 * Fase1. REcogemos los datos del coche. Sin verificar que datos nos introduce.
		 * utilizamos un objeto ESConsolaBasica que nos pone un poco de azucar a la recogida
		 * de datos por consola de java.
		 */
		
		matricula = esConsola.repuestaAPregunta("Dime la matrícula del coche? ");
		color = esConsola.repuestaAPregunta("Dime el color del coche? ");
		marca = esConsola.repuestaAPregunta("Dime la marca del coche? ");
	
		//creamos el coche con los parámetros facilitados por consola. Utilizamos uno de los constructores
		
		coche = new Coche(color, marca, matricula);
				
		//Seguimos recogiendo datos , ahora de las ruedas 
		marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para las delanteras? ");
		diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de ruedas delanteras quieres ? ");
		
		//Creamos el objeto rueda con los datos pasados por consola. Agregamos al coche este tipo de ruedas delanteras
		rueda = new RuedaCoche(diametro, marca);
		coche.setRuedasDelanteras(rueda);

		marca = esConsola.repuestaAPregunta("\nQué marca de ruedas quieres para las traseras? ");
		diametro = esConsola.respuestaFloatAPregunta("Qué diametro de ruedas traseras quieres ? ");
		
		//Creamos el objeto rueda con los datos pasados por consola. Agregamos al coche este tipo de ruedas traseras
		rueda = new RuedaCoche(diametro, marca);
		coche.setRuedasTraseras(rueda);
		
		coche.ToString();
		
	}
	
	
	
}
