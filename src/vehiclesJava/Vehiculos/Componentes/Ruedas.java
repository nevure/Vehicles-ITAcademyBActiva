/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos.Componentes;

/**
 * Clase Ruedas dentro del paquete Componentes de Vehículos
 * 
 * Esta clase nos muestra las características básica de una rueda. Su marca y diámetro.
 * los métodos son getters y setters. Ningún otro método.
 * El constructor recibe la marca y el diámetro.
 *
 */
public class Ruedas {
	
	private float diametro;
	private String marca;
	
	public Ruedas (float diametro, String marca) {
		this.diametro = diametro;
		this.marca = marca;
	}
	//Getters y Setters
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
