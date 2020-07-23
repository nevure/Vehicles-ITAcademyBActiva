/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos;

/*
 * Clase coche que extiende a VehículoMotor.
 * 
 * Constructores: Tenemos el de por defecto. Luego tenemos el que recibe el color y marca de la moto que pasamos a la 
 * superclase donde ponemos como numero de ruedas 0.
 * 
 * El tercer constructor es similar al segundo recibiendo además la matrícula de la moto.
 * El cuarto que no utilizamos en el ejercicio recibe todos los parámetros posibles.
 * 
 * 'setRuedaDelantera' -> recibimos una rueda
 * 
 * 
 */
import vehiclesJava.Vehiculos.Componentes.Motor;
import vehiclesJava.Vehiculos.Componentes.RuedaCoche;

public class Coche extends VehiculoMotor {
	
	private byte numAsientos;
	private byte numPuertas;
	private RuedaCoche[] ruedas = new RuedaCoche[4];

	
	/*
	 * Constructores.
	 * básico que llama a la superclase.
	 */
	public Coche() {
		super();
	}
	//Con  parámetros básicos de color y marca, donde llamamos a la superclase 
	
	public Coche(String color, String marca) {
		super(color, marca, 0);
		
	}
	//el mismo caso anterior agregando la matrícula.

	public Coche(String color, String marca, String matricula ) {
		super(color, marca, matricula, 0);
	}
	
	//constructor con más parámetros. No utilizamos en el ejercicio.
	public Coche(int anyoFabricacion, String color, String marca, String modelo, String tipoCarburante, Motor motor, RuedaCoche[] ruedas, String matricula) {
		
		super(anyoFabricacion, color, marca, modelo, tipoCarburante, motor, ruedas, matricula, 0);
		
	}
	
	//Getters y Setters
	public byte getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(byte numAsientos) {
		this.numAsientos = numAsientos;
	}

	public byte getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(byte numPuertas) {
		this.numPuertas = numPuertas;
	}

	//implementamos método abstracto de la superclase Vehiculo
	public String descripcionVehiculo () {
		return "Vehículo a motor. coche, " ;
		
	}
	public void setRuedasDelanteras(RuedaCoche ruedaCoche ) {
		this.ruedas[0] = ruedaCoche;
		this.ruedas[1] = ruedaCoche;		
	}
	
	public void setRuedasTraseras(RuedaCoche ruedaCoche ) {
		this.ruedas[2] = ruedaCoche;
		this.ruedas[3] = ruedaCoche;
	}
	//implementamos método de la superclase VehiculoMotor
	public boolean diametroCorrecto(float diametro) {
		return (diametro>0.4 && diametro<4);
		
		
	}
	//sobreescribe método de la superclase, ya que aquí definimos una matriz propia de ruedas de coche.
	public RuedaCoche[] getRuedas() {
		return ruedas;
	}

	//método par imprimir datos de los objetos de la clase.
	public void ToString() {

		System.out.println(descripcionVehiculo()+" de la marca "+super.getMarca() +" con unas ruedas delanteras  " 
				+ getRuedas()[0].getMarca()+ " y de diámetro "+getRuedas()[0].getDiametro() +"; con unas ruedas traseras : " 
						+ getRuedas()[2].getMarca()+ " y de diámetro "+getRuedas()[2].getDiametro() + ".\n Y son del tipo: "+getRuedas()[2].getTipoRuedaTemporada()+ ". Coche fabricado el año " + super.getAnyoFabricacion());
	}


	
	

}
