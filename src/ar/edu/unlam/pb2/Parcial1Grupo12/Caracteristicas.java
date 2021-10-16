package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Caracteristicas {
	private Integer ruedas;
	private String motor;
	private String color;
	private Integer puerta;
	private Boolean cajaDeCambios;
	private Boolean sistemaDeSeguridad;
	private String version;
	private Double largo;
	private Double ancho;
	private String descripcionComercial;

	public Caracteristicas(Integer ruedas, String motor, String color, Integer puerta, Boolean cajaDeCambios,
			Boolean sistemaDeSeguridad, String version, Double largo, Double ancho, String descripcionComercial) {

		this.ruedas = ruedas;
		this.motor = motor;
		this.color = color;
		this.puerta = puerta;
		this.cajaDeCambios = cajaDeCambios;
		this.sistemaDeSeguridad = sistemaDeSeguridad;
		this.version = version;
		this.largo = largo;
		this.ancho = ancho;
		this.descripcionComercial = descripcionComercial;
	}
	public Caracteristicas() {
		this.ruedas = 4;
		this.motor = "v8";
		this.color = "negro";
		this.puerta = 4;
		this.cajaDeCambios = true;
		this.sistemaDeSeguridad = true;
		this.version = "2021";
		this.largo = 400.0;
		this.ancho = 200.0;
		this.descripcionComercial = "0km";
	}
	
	
	public Integer getRuedas() {
		return ruedas;
	}

	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPuerta() {
		return puerta;
	}

	public void setPuerta(Integer puerta) {
		this.puerta = puerta;
	}

	public Boolean getCajaDeCambios() {
		return cajaDeCambios;
	}

	public void setCajaDeCambios(Boolean cajaDeCambios) {
		this.cajaDeCambios = cajaDeCambios;
	}

	public Boolean getSistemaDeSeguridad() {
		return sistemaDeSeguridad;
	}

	public void setSistemaDeSeguridad(Boolean sistemaDeSeguridad) {
		this.sistemaDeSeguridad = sistemaDeSeguridad;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Double getLargo() {
		return largo;
	}

	public void setLargo(Double largo) {
		this.largo = largo;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public String getDescripcionComercial() {
		return descripcionComercial;
	}

	public void setDescripcionComercial(String descripcionComercial) {
		this.descripcionComercial = descripcionComercial;
	}

	@Override
	public String toString() {
		return "Caracteristicas [ruedas=" + ruedas + ", motor=" + motor + ", color=" + color + ", puerta=" + puerta
				+ ", cajaDeCambios=" + cajaDeCambios + ", sistemaDeSeguridad=" + sistemaDeSeguridad + ", version="
				+ version + ", largo=" + largo + ", ancho=" + ancho + ", descripcionComercial=" + descripcionComercial
				+ "]";
	}

}
