package ar.edu.unlam.pb2.Parcial1Grupo12;

public abstract class Vehiculo {

	private Integer asientos;
	private Accesorio accesorio;
	private Boolean estadoDeFabricacion;
	private Integer capacidadDePersonas;
	private Caracteristicas caracteristicas;


	public Vehiculo(Integer asiento, Accesorio accesorio, Boolean estadoDeFabricacion, Integer capacidadDePersonas,
			Caracteristicas caracteristicas) {
		super();
		this.asientos = asiento;
		this.accesorio = accesorio;
		this.estadoDeFabricacion = estadoDeFabricacion;
		this.capacidadDePersonas = capacidadDePersonas;
		this.caracteristicas = caracteristicas;
	}

	public Vehiculo(Integer asientos, Accesorio accesorio, Boolean estadoDeFabricacion, Integer capacidadDePersonas,
			Integer ruedas, String motor, String color, Integer puerta, Boolean cajaDeCambios,
			Boolean sistemaDeSeguridad, String version, Double largo, Double ancho, String descripcionComercial) {
		this.asientos = asientos;
		this.accesorio = accesorio;
		this.estadoDeFabricacion = estadoDeFabricacion;
		this.capacidadDePersonas = capacidadDePersonas;
		this.caracteristicas = new Caracteristicas(ruedas, motor, color, puerta, cajaDeCambios, sistemaDeSeguridad,
				version, largo, ancho, descripcionComercial);
	}

	public Integer getAsientos() {
		return asientos;
	}

	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}

	public Accesorio getAccesorio() {
		return accesorio;
	}

	public void setAccesorio(Accesorio accesorio) {
		this.accesorio = accesorio;
	}

	public Boolean getEstadoDeFabricacion() {
		return estadoDeFabricacion;
	}

	public void setEstadoDeFabricacion(Boolean estadoDeFabricacion) {
		this.estadoDeFabricacion = estadoDeFabricacion;
	}

	public Integer getCapacidadDePersonas() {
		return capacidadDePersonas;
	}

	public void setCapacidadDePersonas(Integer capacidadDePersonas) {
		this.capacidadDePersonas = capacidadDePersonas;
	}

	public Caracteristicas getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}// fin class
