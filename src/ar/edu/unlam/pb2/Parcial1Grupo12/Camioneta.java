package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Camioneta extends Vehiculo implements modoCrucero{
	private Double anchoCaja;
	private Double largoCaja;
	private Integer velocidadActual;
	
	public Camioneta(Integer cantidadAsientos, Adicional accesorio,Double anchoCaja,Double largoCaja) {
		super(cantidadAsientos, accesorio);
		this.largoCaja=largoCaja;
		this.anchoCaja=anchoCaja;
		this.velocidadActual=0;
	}
	
	public Camioneta(Integer cantidadAsientos,Double anchoCaja,Double largoCaja) {
		super(cantidadAsientos);
		this.largoCaja=largoCaja;
		this.anchoCaja=anchoCaja;
		this.velocidadActual=0;
	}
	
	
	
	public Double getAnchoCaja() {
		return anchoCaja;
	}

	public void setAnchoCaja(Double anchoCaja) {
		this.anchoCaja = anchoCaja;
	}

	public Double getLargoCaja() {
		return largoCaja;
	}

	public void setLargoCaja(Double largoCaja) {
		this.largoCaja = largoCaja;
	}
	
	public void acelerar(Integer velocidad) {
		this.velocidadActual = velocidad;
	}

	@Override
	public String ActivarModoCrucero() {
		String mensaje="";
		if(this.velocidadActual<70) {
			mensaje ="La velocidad minima para modo crucero es 70Km/h";
		}else {
			mensaje="Modo crucero activado";
		}
		return mensaje;
	}

	
	
	

}
