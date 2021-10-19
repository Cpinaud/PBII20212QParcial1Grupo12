package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Auto extends Vehiculo implements FuncionalidadDeVehiculo, modoCrucero {

	private Double volumenDelBaul;
	private Boolean encendido;
	private Integer distancia ;
	private Boolean estadoSensorEstacionamiento;

	public Auto(Double volumen, Integer cantidadAsientos) {
		super(cantidadAsientos);
		this.volumenDelBaul = volumen;
		this.encendido = Boolean.FALSE;
		this.distancia = 45;
		this.estadoSensorEstacionamiento=Boolean.FALSE;
	}
	
	public Auto(Double volumen, Integer cantidadAsientos, Adicional adicional) {
		super(cantidadAsientos, adicional);
		this.volumenDelBaul = volumen;
		this.encendido = Boolean.FALSE;
		this.distancia = 45;
		this.estadoSensorEstacionamiento=Boolean.FALSE;
	}

	public Boolean prenderAuto() {
		setEncendido(true);
		return getEncendido();
	}
	
	public Boolean apagarAuto() {
		setEncendido(false);
		return getEncendido();
	}

	@Override
	public void ActivarSensorEstacionamiento() {
			
			if (this.distancia <10) {
				this.estadoSensorEstacionamiento=Boolean.TRUE;
			}
			
	
	}

	@Override
	public Boolean identificadorPuertaAbierta() {
		Boolean estado= false;
			if(getEncendido()) {
				estado= true;
			}
		
		return estado;
	}
	
	public Double getVolumenDelBaul() {
		return volumenDelBaul;
	}

	public void setVolumenDelBaul(Double volumenDelBaul) {
		this.volumenDelBaul = volumenDelBaul;
	}

	public Boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(Boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public String ActivarModoCrucero() {
		return "Modo crucero activado";
	}

	public void estacionar() {
		if(this.distancia>10) {
			this.distancia-=10;
			
		}else {
			this.ActivarSensorEstacionamiento();
		}
		
	}
	public Boolean getEstadoSensorEstacionamiento() {
		return this.estadoSensorEstacionamiento;
	}
	

}// fin class
