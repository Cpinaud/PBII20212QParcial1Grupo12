package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Vehículo {
    //variables de vehículo
	private String estructuraBase,motor, color, cajaCambios, sistSeguridad, accesorios, version, estadoDeFabricacion, descripcion;
	private Integer ruedas, asientos, puertas, largo, ancho, capacidadDePersonas ;

	//constructor de vehículo
	public Vehículo(String estructuraBase, Integer ruedas, Integer asientos, String motor, String color, Integer puertas , String cajaCambios, String sistSeguridad, String accesorios,
			String version, String estadoDeFabricacion, String descripcion, Integer largo, Integer ancho, Integer capacidadDePersonas) {
		
		this.estructuraBase=estructuraBase;
		this.ruedas=ruedas;
		this.asientos=asientos;
		this.motor=motor;
		this.color=color;
		this.puertas=puertas;
		this.cajaCambios=cajaCambios;
		this.sistSeguridad=sistSeguridad;
		this.accesorios=accesorios;
		this.version=version;
		this.estadoDeFabricacion=estadoDeFabricacion;
		this.descripcion=descripcion;
		this.largo=largo;
		this.ancho=ancho;
		this.capacidadDePersonas=capacidadDePersonas;
		
	}

}
