/* Fase3 - Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava;

import vehiclesJava.Vehiculos.Coche;
import vehiclesJava.Vehiculos.Moto;
import vehiclesJava.Vehiculos.Componentes.RuedaCoche;
import vehiclesJava.Vehiculos.Componentes.RuedaMoto;
import vehiclesJava.Utils.ESConsolaBasica;

public class Fase3 {
	
	private Coche coche;
	private Moto moto;
	private ESConsolaBasica esConsola = new ESConsolaBasica();

	private String matricula;
	private String color;
	private String marca;
	private RuedaCoche ruedaCoche;
	private RuedaMoto ruedaMoto;
	private float diametro;
	
	public void fase3Print() {
		
		String tipoVehiculo;
	
		System.out.println("\nFase3\n");
		
		/*
		 * Fase 3.
		 * Debemos preguntar al usuario si quiere crear una moto o coche.
		 * 
		 * Utilizamos una iteración while donde verificamos que nos escoja entre coche o moto; siendo
		 * indiferente el uso de mayúscula o minúsculas.
		 */
		
	
		tipoVehiculo = esConsola.repuestaAPregunta("Crear una moto o un coche? ");
		
		while (!("moto".equalsIgnoreCase(tipoVehiculo ) || "coche".equalsIgnoreCase(tipoVehiculo))) {
			tipoVehiculo = esConsola.repuestaAPregunta("Por favor, elige entre moto o coche. ? ");
		}

		//Solicitamos el color y marca del vehículo escogido (Coche o moto)	
		color = esConsola.repuestaAPregunta("Dime el color del vehículo? ");
		marca = esConsola.repuestaAPregunta("Dime la marca del vehículo? ");
	
		/*
		 * Aquí tenemos el condicional principal para diferenciar los pasos a seguir según si se ha escogido moto o coche
		 * Los pasos son los mismos aunque utilizando sus clases correspondientes.
		 * 
		 */
		
		if ( "moto".equalsIgnoreCase(tipoVehiculo)) {
			
			/*
			 * Si es moto creamos la moto.
			 */
			
			moto = new Moto(color, marca);
			
			//al igual que en fase2 verificamos que la matrícula que se introduzca cumple los requisitos. 
			while (!moto.matriculaCorrecta(matricula = esConsola.repuestaAPregunta("Dime la matricula de la moto: "))) {
				System.out.println("Matrícula incorrecta, debe tener 4 número y dos o tres letras");
				
			}
			
			marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para delante? ");
			
			//Igual que en fase2 verificamos el diámetro de las ruedas
			while(!moto.diametroCorrecto( diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de rueda delantera quieres ? "))) {
				System.out.println("No es un diámetro correcto. Este debe estar entre 0,4 y 4");

			}
			
			/*Creamos el objeto ruedaMoto, aunque a diferencia del coche, almacenamos los objetos ruedaMoto en la matriz
			 * básica de la clase VehiculoMotor
			 */
			ruedaMoto = new RuedaMoto(diametro, marca);
			moto.setRuedaDelantera(ruedaMoto);

			marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para las traseras? ");
			while(!moto.diametroCorrecto( diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de ruedas traseras quieres ? "))) {
				System.out.println("No es un diámetro correcto. Este debe estar entre 0,4 y 4");

			}		
			ruedaMoto = new RuedaMoto(diametro, marca);
			moto.setRuedaTrasera(ruedaMoto);
			
			//nos faltaba pasarle la matrícula al objeto
			moto.setMatricula(matricula);	
			
			//imprimimos los datos de nuestra moto
			moto.ToString();
			
		}else {
			
			/*Si es coche creamos el objeto coche.
			 * Los pasos son similares. Preguntaremos por los datos matrícula y diámtro de ruedas verificando, como en fase2,
			 * que cumplen los parámetros dados utilizando los métodos de la clase coche para ello.
			 * 
			 */
			coche = new Coche(color, marca);

			while (!coche.matriculaCorrecta(matricula = esConsola.repuestaAPregunta("Dime la matricula del coche: "))) {
				System.out.println("Matrícula incorrecta, debe tener 4 número y dos o tres letras");}
			
			coche.setMatricula(matricula);	
					
			marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para delante? ");
			
			while(!coche.diametroCorrecto( diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de rueda delantera quieres ? "))) {
				System.out.println("No es un diámetro correcto. Este debe estar entre 0,4 y 4");

			}
			
			/*
			 * A diferencia d ela moto, los métodos de la clase coche guardan los datos de las ruedas en una matriz propia
			 * de la clase. El método serRuedasDelanteras guardará los objetos ruedas en la matriz propia.
			 */
			ruedaCoche = new RuedaCoche(diametro, marca, "Verano");
			coche.setRuedasDelanteras(ruedaCoche);
			

			marca = esConsola.repuestaAPregunta("Qué marca de ruedas quieres para las traseras? ");
			while(!coche.diametroCorrecto( diametro = esConsola.respuestaFloatAPregunta("Qué diamtro de ruedas traseras quieres ? "))) {
				System.out.println("No es un diámetro correcto. Este debe estar entre 0,4 y 4");

			}		
			ruedaCoche = new RuedaCoche(diametro, marca, "Verano");
			coche.setRuedasTraseras(ruedaCoche);
			coche.ToString();
		}		
		
	}
}
	
	
	


