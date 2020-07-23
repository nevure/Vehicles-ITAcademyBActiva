Ejercicio de Vehicles
IT Academy - Barcelona Activa

El paquete Utils nos proporciona la interfaz ESCOnsola y la clase que la implementa ESConsolaBasica. No es más que un "adorno" sobre la entrada y salida de Consola, pero que podría facilitar el trabajo y automatizar algunos procesos.

Tenemos el paquete Vehiculos.
Dentro de este paquete tenemos un subpaquete Componentes donde tenemos clases para componentes de los vehículos:
- Motor
- Ruedas
- RuedaCoche
- RuedaMoto

RuedaCoche y RuedaMoto extienden a Ruedas con las particularidades del tipo de vehículo.
En este ejercicio RuedaMoto no se utiliza y se hace uso de la superclase Ruedas.

Motor tampoco se utiliza pero se crea y define para completar un poco más el tipo de paquete.

Fuera del subpaquete pero aún dentro del paquete Vehiculos tenemos las clases:

- Vehiculo
- VehiculoMotor
- Coche
- Moto

Partimos de una superclase Vehiculo que define los elementos esenciales de todo vehículo.
VehiculoMotor nos proporciona algún elemento particular de este tipo de vehículos, extendiendo la funcionalidad de su superclase Vehiculo

Moto y Coche son dos tipos de vehiculos a motor con sus particularidades.

