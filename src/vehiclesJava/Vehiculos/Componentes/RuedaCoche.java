/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos.Componentes;

/**
 * Esta clase extiende la funcionalidad de la clase Ruedas. 
 * A la marca y diámetro le añadidmos algunas características propias de las ruedas de un coche.
 * El constructor o bien recibe los elementos básico de la superclase Ruedas (marca y diámetro) o bien recibe éstos 
 * más los propios de esta clase.
 * el resto de métodos son getters y setters y un método que verifica si el tipo de rueda según temporada que recibe
 * se corresponde con los que se contemplan en la clase (Invierno, Verano, Todas).
 *
 *-> La utilizamos en el ejercicio, y utilizamos también el método que verifica si el tipo de rueda se corresponde con 
 *   uno de los tipos guardados en el enum temporada. Se hace uso en el propio constructor donde pasamos tipoRuedaTemporada.
 */
public class RuedaCoche extends Ruedas {
	
	private enum temporada {Invierno, Verano, Todas}
	private String tipoRuedaTemporada= temporada.Todas.toString();
	private int nivelRuido;
	private char indiceVelocidad;
	
	//Constructor base que recibe marca y diametro.
	public RuedaCoche(float diametro, String marca) {
	
		super(diametro,marca);
	}
	//constructor como el anterior pero que además recibe el tipo de rueda, propiedad de la clase.
	public RuedaCoche(float diametro, String marca, String tipoRuedaTemporada) {
		
		super(diametro, marca);
		this.tipoRuedaTemporada = tipoRuedaTemporadaNombre(tipoRuedaTemporada);
	}

	//Getters y Setters
	public String getTipoRuedaTemporada() {
		return tipoRuedaTemporada;
	}

	public void setTipoRuedaTemporada(String tipoRuedaTemporada) {
		this.tipoRuedaTemporada = tipoRuedaTemporada;
	}

	public int getNivelRuido() {
		return nivelRuido;
	}

	public void setNivelRuido(int nivelRuido) {
		this.nivelRuido = nivelRuido;
	}

	public char getIndiceVelocidad() {
		return indiceVelocidad;
	}

	public void setIndiceVelocidad(char indiceVelocidad) {
		this.indiceVelocidad = indiceVelocidad;
	}
	
	/*método que verifica si el tipo de rueda, su nomenclatura, es válida según el 'enum' declarado en la clase.
	 * sino es válido, sencillamente devuelve un string vacío.
	 */
	public String tipoRuedaTemporadaNombre(String tipoRuedaTemporada) {
		for (temporada t : temporada.values()) {
	        if (t.toString().equalsIgnoreCase(tipoRuedaTemporada) ) {
	            return tipoRuedaTemporada;
	        }
	    }
	    return "";
	}
	
}
