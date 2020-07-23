/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos.Componentes;

/**
 * Clase Motor dentro del paquete Componentes de Vehículos.
 * no la utilizamos en el ejercicio, pero está bien tenerla.
 * Tenemos variables que nos describen las característica básicas de un motor.
 * 
 * Tenemos un constructor vacio y otro con los parámetros básicos de construcción del objeto.
 * 
 * Tenemos el método 'calculoCaballos' que nos retorna los caballos en función de la potencia del motor.
 * El resto de métodos son getters y setters
 *
 */
public class Motor {
	
	private float cilindrada;
	private float potencia;
	private float caballos;
	private String carburante;
	
	public Motor() {
		
	}
	public Motor(float cilindrada, float potencia, String carburante ) {
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.carburante = carburante;
	}
	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getCaballos() {
		return caballos;
	}
	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	public float calculoCaballos(float potencia) {
		return potencia*(float)1.36;
	}
	
	
	

}
