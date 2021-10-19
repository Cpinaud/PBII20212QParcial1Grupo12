package ar.edu.unlam.pb2.Parcial1Grupo12;

public abstract class Vehiculo {


	private Integer cantidadAsientos;
	private Boolean asientosColocados;
	private Boolean enFabricacion;
	private Boolean fabricacionFinalizada;
	/*private Integer capacidadDePersonas;*/
	private Adicional[] adicionales;
	private Integer indexAdicional=0;
	private Boolean motorColocado;
	private String numeroMotor;
	private Boolean pintado;
	private String color;
	private Boolean cajaDeCambiosColocada;
	private Boolean carroceriaColocada;
	private String numeroChasis;
	private String descripcionComercial;

	public Vehiculo( Integer asientos, Adicional adicional) {
		this.cantidadAsientos = asientos;
		this.adicionales = new Adicional[10];
		this.adicionales[indexAdicional] = adicional;
		this.indexAdicional++;
		this.enFabricacion = Boolean.TRUE;
		this.fabricacionFinalizada = Boolean.FALSE;
		this.motorColocado=Boolean.FALSE;
		this.numeroMotor="";
		this.pintado=Boolean.FALSE;
		this.color="";
		this.cajaDeCambiosColocada=Boolean.FALSE;
		this.carroceriaColocada=Boolean.FALSE;
		this.numeroChasis="";
		this.descripcionComercial="";
		/*this.capacidadDePersonas = capacidadDePersonas;*/
	}
	public Vehiculo( Integer asientos) {
		this.cantidadAsientos = asientos;
		this.enFabricacion = Boolean.TRUE;
		this.adicionales = new Adicional[10];
		this.fabricacionFinalizada = Boolean.FALSE;
		/*this.capacidadDePersonas = capacidadDePersonas;*/

	}


	public Integer getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setAsientos(Integer asientos) {
		this.cantidadAsientos = asientos;
	}

	public String getAdicionales() {
		String adicionales ="*";
		for(int i=0;i<this.indexAdicional+1;i++) {
			adicionales +=this.adicionales[i].toString();
		}
		return adicionales;
	}


	public Boolean getEnFabricacion() {
		return enFabricacion;
	}

	public void setenFabricacion(Boolean enFabricacion) {
		this.enFabricacion = enFabricacion;
	}

	/*public Integer getCapacidadDePersonas() {
		return capacidadDePersonas;
	}

	public void setCapacidadDePersonas(Integer capacidadDePersonas) {
		this.capacidadDePersonas = capacidadDePersonas;
	}*/

	
	public void agregarAdicional(Adicional adicional) {
		this.adicionales[indexAdicional]=adicional;
		this.indexAdicional++;
	}

	
	
	public Boolean getAsientosColocados() {
		return asientosColocados;
	}
	public void setAsientosColocados(Boolean asientosColocados) {
		this.asientosColocados = asientosColocados;
	}
	public Boolean getMotorColocado() {
		return motorColocado;
	}
	public void setMotorColocado(Boolean motorColocado) {
		this.motorColocado = motorColocado;
	}
	public String getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	public Boolean getPintado() {
		return pintado;
	}
	public void setPintado(Boolean pintado) {
		this.pintado = pintado;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getCajaDeCambiosColocada() {
		return cajaDeCambiosColocada;
	}
	public void setCajaDeCambiosColocada(Boolean cajaDeCambiosColocada) {
		this.cajaDeCambiosColocada = cajaDeCambiosColocada;
	}
	public Boolean getCarroceriaColocada() {
		return carroceriaColocada;
	}
	public void setCarroceriaColocada(Boolean carroceriaColocada) {
		this.carroceriaColocada = carroceriaColocada;
	}
	public String getNumeroChasis() {
		return numeroChasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public void setEnFabricacion(Boolean enFabricacion) {
		this.enFabricacion = enFabricacion;
	}
	public void setFabricacionFinalizada(Boolean fabricacionFinalizada) {
		this.fabricacionFinalizada = fabricacionFinalizada;
	}
	
	public Boolean finalizado() {
		if (Boolean.TRUE.equals(this.getAsientosColocados().equals(this.getMotorColocado().equals(this.getPintado()
		.equals(this.getCajaDeCambiosColocada().equals(this.getCarroceriaColocada())))))) {
			this.setFabricacionFinalizada(Boolean.TRUE);
		}
		return this.fabricacionFinalizada;
	}
	public String getDescripcionComercial() {
		return this.descripcionComercial;
	}
	
	public void setDescripcionComercial(String descripcionComercial) {
		this.descripcionComercial=descripcionComercial;
	}

}// fin class
