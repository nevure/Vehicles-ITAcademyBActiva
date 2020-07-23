/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos;

/**
 * Clase Abstracta Vehículo.
 * 
 * Clase que define un vehículo genérico.
 * Hay variables y métodos que no se utilizan en el ejercicio, pero se agregan como complemento de la propia clase.
 * 
 * Hay un constructor por defecto que crea el objeto con fecha de fabricación año actual.
 * El siguiente constructor crea el vehículo con los parámetros básico de color y marca agregando de nuevo 
 * el año actual como fecha de fabricación.
 * El último constructor recibe todos los parámetros definidos en las variables de clase.
 * 
 * Los métodos existentes son getters y setters más un método que verifica que el tipo de combustible, su denominación,
 * se corresponde con los que tiene la clase: 'tipoCarburanteNombre' 
 *
 * 'descripcionVehiculo' -> método abstracto. Las subclases deberán implementar el método realizando una descripción
 * del tipo de vehículo.
 * 
 * ->Para el ejercicio se crean parámetros y métodos que no se utilizan pero que dibujan quizás mejor esta clase.
 */
import java.util.Calendar;


public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	public enum carburante  {Gasolina, Gasoil, GLP, Eléctrico, Humano };
	private String color;
	private String tipoCarburante;
	private int anyoFabricacion; 	
	Calendar fechaActual; 
	
	/*
	 * constructores.
	 * por defecto crea el vehículo con fecha de fabricación actual.
	 */
	public Vehiculo() {
		fechaActual = Calendar.getInstance();
		anyoFabricacion = fechaActual.get(Calendar.YEAR);	
	}
	
	/*
	 * constructor básico que crea un vehículo con color y marca. En el ejericio es el que utilizamos
	 */
	public Vehiculo(String color, String marca) {
		this.color = color;
		this.marca = marca;
		fechaActual = Calendar.getInstance();
		anyoFabricacion = fechaActual.get(Calendar.YEAR);	
	}
	
	//constructor con todos los parámetros. no se utiliza
	public Vehiculo (int anyoFabricacion, String color, String marca, String modelo, String tipoCarburante) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoCarburante = tipoCarburanteNombre(tipoCarburante);
		this.anyoFabricacion = anyoFabricacion;
		
	}
	
	//Getters y Setters
	
	public String getMarca() {
		return marca;
	}
	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}
	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String gettipoCarburante() {
		return tipoCarburante;
	}
	public void settipoCarburante(String tipoCarburanteString) {
		this.tipoCarburante = tipoCarburanteString;
	}
	
	/*
	 * Verifica si el tipo de carburante, su nomenclatura, se corresponde con el definido en la clase.
	 */
	public String tipoCarburanteNombre (String tipoCarburante) {
		for (carburante t : carburante.values()) {
	        if (t.equals(tipoCarburante) ) {
	            return tipoCarburante;
	        }
	    }
	    return "";
	}
	
	//clase abstracta que describe el vehículo
	public abstract String descripcionVehiculo ();
	
	

}
