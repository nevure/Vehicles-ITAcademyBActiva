/**
 * Ejercico de Vehicles
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package vehiclesJava.Vehiculos;

/*
 * Clase abstracta que extiende la clase abstracta Vehículo, agregando componentes propios de un vehículo de motor.
 * 
 * Definimos las variables matrícula, el tipo de vía donde puede circular. También le agregamos una ruedas y un motor.
 * 
 * Constructores: constructor si parámetros que llama a la superclase. 
 *    El segundo constructor que utilizaremos en el ejercicio recibe la marca, el color y el número de ruedas del vehículo
 *    a motor.
 *    Un tercero que agrega al segundo el parámetro de la matrícula.
 *    Un cuarto con todos los parámetros del vehículo a motor.
 *    
 * 'matriculaCorrecta' -> Verifica si la mátricula es correcta.
 * 'viaPermitida' -> no la utilizamos pero sirve para saber qué tipo de vía puede circular un vehículo en función de 
 *      su cilindrada.
 *  'diametroCorrecto' -> Según el tipo de vehículo nos dice si el diámetro de la rueda es correcto. método abstracto
 *  
 *  -> Tenemos una matriz de ruedas que nos servirá de forma genérica para vehículos a motor que no describan su propia matriz
 *     particular de ruedas. En este ejercicio se utilizará esta matriz para las ruedas de motos.
 */
import vehiclesJava.Vehiculos.Componentes.*;

public abstract class VehiculoMotor extends Vehiculo {
	
	private String matricula;
	private Motor motor;
	private Ruedas[] ruedas;
	private enum tipoVias {Via_Rápida, Convencional, Rural};
		
	//constructor por defecto
	public VehiculoMotor() {
		super();
		
	}
	/*Constructor donde creamos la matriz de ruedas además de recibir los parámetros básicos de marca y color que
	* pasamos a la supèrclase.
	*
	**/
	public VehiculoMotor(String color, String marca, int numRuedas) {
		super(color, marca);
		ruedas = new Ruedas[numRuedas];

	}
	/*
	 * Constructor similar al anterior que recibe también la matrícula propia de esta clase.
	 */
	public VehiculoMotor(String color, String marca, String matricula, int numRuedas ) {
		super(color, marca);
		this.matricula = matricula;
		ruedas = new Ruedas[numRuedas];
	}
	
	//consturctor que recibe todos los parámetros posibles. no lo utilizamos en el ejercicio.
	public VehiculoMotor(int anyoFabricacion, String color, String marca, String modelo, String tipoCarburante, Motor motor, Ruedas[] ruedas, String matricula, int numRuedas) {
		super(anyoFabricacion, color, marca, modelo, tipoCarburante);
		this.motor = motor;
		this.ruedas = new Ruedas[numRuedas];
		this.ruedas = ruedas;
		this.matricula = matricula;
		
	}
	//Getters y Setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Ruedas[] getRuedas() {
		return ruedas;
	}
	public void setRuedas(Ruedas[] ruedas) {
		this.ruedas = ruedas;
	}
	public void setRueda(Ruedas rueda, int posicion) {
		this.ruedas[posicion] = rueda;
	}
	
	/*
	 * Comprobamos que la matrícula cumple los requisitos de 4 número más dos o tres letras.
	 */
	public boolean matriculaCorrecta(String matricula) {
		
		return (matricula.matches("^[0-9]{4}[A-Z]{3}$") || matricula.matches("^[0-9]{4}[A-Z]{2}$"));
	}
	
	/*
	 * Método que no utilizamos pero definimos. Según la cilindrada limitamos la posibilidad de circulación por
	 * determinadas vías. 
	 */
	public String viaPermitida() {
		
		if (this.motor.getCilindrada() > 50 )
			return tipoVias.Via_Rápida.toString();
			
		else 
			return tipoVias.Convencional.toString();	
	}
	
	/*
	 * método abstracto que nos verificará según el tipo de vehículo a motor las posibilidades del diámetro de una rueda.
	 */
	
	public abstract boolean diametroCorrecto(float diametro);
	
}
