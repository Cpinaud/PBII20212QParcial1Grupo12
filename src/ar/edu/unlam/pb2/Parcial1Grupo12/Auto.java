package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Auto extends Vehiculo implements FuncionalidadDeVehiculo {

	private Double volumenDelBaul;
	private Boolean encendido;

	public Auto(Double volumen, Integer asiento, Accesorio accesorio, Boolean estadoDeFabricacion,
			Integer capacidadDePersonas, Caracteristicas caracteristicas) {
		super(asiento, accesorio, estadoDeFabricacion, capacidadDePersonas, caracteristicas);
		this.volumenDelBaul = volumen;
		this.encendido = false;
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
	public Boolean autoEstacionado() {
			Boolean estacionado= false;
			if (getEncendido()== false) {
				estacionado= true;
			}
			
		return estacionado;
	}

	@Override
	public Boolean identificadorPuertaAbierta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean techoCorredizo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean aireAcosdicionado() {
		// TODO Auto-generated method stub
		return null;
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

}// fin class