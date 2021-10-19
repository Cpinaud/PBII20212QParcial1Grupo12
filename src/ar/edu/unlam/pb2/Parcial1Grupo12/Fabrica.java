package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Fabrica {

	private String nombre;
	private Integer cuit;
	private String direccion;
	private Vehiculo[] vehiculos;
	private Integer indexVehiculos;
	private Motor []motor;

	public Fabrica(String nombre, Integer cuit, String direccion) {
		this.nombre=nombre;
		this.cuit=cuit;
		this.direccion=direccion;
		this.vehiculos = new Vehiculo[100];
		this.indexVehiculos=0;
		this.motor = new Motor[10];
		
		
	}
	
	public Vehiculo buscarVehiculoPorDescripcionComercial(String descripcion) {
		Integer index=0;
		for (int i = 0; i < indexVehiculos; i++) {
			if(this.vehiculos[i].getDescripcionComercial().equals(descripcion)) {
				index = i;
				
			}
		}Vehiculo vehiculo=this.vehiculos[index];
		
		return vehiculo;
	}

	public void fabricarVehiculo(Vehiculo vehiculo) {
		this.vehiculos[indexVehiculos]=vehiculo;
		this.indexVehiculos++;
		
	}
	
	
	public Vehiculo getVehiculo(Integer index) {
		Vehiculo vehiculo = this.vehiculos[index];
		return vehiculo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
/*
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}*/

	public Integer getIndexVehiculos() {
		return indexVehiculos;
	}
/*
	public void setIndexVehiculos(Integer indexVehiculos) {
		this.indexVehiculos = indexVehiculos;
	}


	*/
	public void colocarAsientos(Vehiculo vehiculo) {
		vehiculo.setAsientosColocados(Boolean.TRUE);
	}
	
	public void colocarMotor(Vehiculo vehiculo,String nMotor) {
		vehiculo.setMotorColocado(Boolean.TRUE);
		vehiculo.setNumeroMotor(nMotor);
	}
	public void pintar(Vehiculo vehiculo,String color) {
		vehiculo.setPintado(Boolean.TRUE);
		vehiculo.setColor(color);
	}


	public Motor getMotor(Integer index) {
		
		return motor[index];
	}

	public static Motor crearMotor() {
		
		return null;
	}


	
	public void colocarCajaDeCambios(Vehiculo vehiculo) {
		vehiculo.setCajaDeCambiosColocada(Boolean.TRUE);
	}
	
	public void colocarCarroceria(Vehiculo vehiculo,String nChasis) {
		vehiculo.setCarroceriaColocada(Boolean.TRUE);
		vehiculo.setNumeroChasis(nChasis);
	}

}
