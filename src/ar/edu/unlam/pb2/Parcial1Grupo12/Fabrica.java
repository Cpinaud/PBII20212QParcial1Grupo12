package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Fabrica {

	private String nombre;
	private Integer cuit;
	private String direccion;
	private Vehiculo[] vehiculos;
	private Integer indexVehiculos;

	public Fabrica(String nombre, Integer cuit, String direccion) {
		this.nombre=nombre;
		this.cuit=cuit;
		this.direccion=direccion;
		this.vehiculos = new Vehiculo[100];
		this.indexVehiculos=0;
		
		
	}

	public void crearVehiculo(Vehiculo vehiculo) {
		this.vehiculos[indexVehiculos++]=vehiculo;
		
	}
	
	
	public Vehiculo getVehiculo(Integer index) {
		Vehiculo vehiculo = this.vehiculos[index];
		return vehiculo;
	}

	

}
