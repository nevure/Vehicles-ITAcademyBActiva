/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos;
/*
 * Clase Moto que extiende a VehículoMotor.
 * 
 * Constructores: Tenemos el de por defecto. Luego tenemos el que recibe el color y marca de la moto que pasamos a la 
 * superclase agregando el número de ruedas, en este caso dos ruedas.
 * El tercer constructor es similar al segundo recibiendo además la matrícula de la moto.
 * El cuarto que no utilizamos en el ejercicio recibe todos los parámetros posibles.
 * 
 * 'setRuedaDelantera' -> recibimos una rueda
 * 
 * 
 */

import vehiclesJava.Vehiculos.Componentes.Motor;
import vehiclesJava.Vehiculos.Componentes.Ruedas;


public class Moto extends VehiculoMotor {
	
	/*
	 * Constructores.
	 * básico que llama a la superclase.
	 */
	public Moto() {
		super();
	}
	
	/*Con  parámetros básicos de color y marca, donde llamamos a la superclase agregando también el número de ruedas
	 *para que la superclase cree la matriz de ruedas básica. En este caso, aunque tenemos una clase de ruedaMoto, no la vamos 
	 *a utilizar. 
	*/
	public Moto(String color, String marca) {
		super(color, marca, 2);
		
	}
	//el mismo caso anterior agregando la matrícula.
	public Moto(String color, String marca, String matricula ) {
		super(color, marca, matricula, 2);
	}
	//recibe varios parámetros posibles. no se utiliza
	public Moto(int anyoFabricacion, String color, String marca, String modelo, String tipoCarburante, Motor motor, Ruedas[] ruedas, String matricula) {
		
		super(anyoFabricacion, color, marca, modelo, tipoCarburante, motor, ruedas, matricula, 2);
		
	}
	
	//implementa el método abstracto declarado en la superclase Vehiculo.
	public String descripcionVehiculo () {
		return "Vehículo a motor. Moto, " ;
		
	}
	public void setRuedaDelantera(Ruedas ruedaMoto ) {
		super.setRueda(ruedaMoto, 0);
	}
	
	public void setRuedaTrasera(Ruedas ruedaMoto ) {
		super.setRueda(ruedaMoto, 1);
	}
	
	//implementa el método abstracto declarado en la superclase VehiculoMotor.

	public boolean diametroCorrecto(float diametro) {
		return (diametro>0.4 && diametro<4);
		
		
	}
	//método par imprimir datos de los objetos de la clase.
	public void ToString() {
		System.out.println(descripcionVehiculo()+" de la marca "+super.getMarca() +" con unas ruedas delanteras : " 
				+ getRuedas()[0].getMarca()+ " y de diámetro: "+getRuedas()[0].getDiametro() +", con unas ruedas traseras : " 
						+ getRuedas()[1].getMarca()+ " y de diámetro: "+getRuedas()[1].getDiametro());
	}

}



