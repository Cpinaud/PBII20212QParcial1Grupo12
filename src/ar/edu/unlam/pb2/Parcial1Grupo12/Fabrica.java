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
	
	public Boolean buscarVehiculoPorDescripcionComercial(String descripcion) {
		Boolean  estado= false;
		for (int i = 0; i < indexVehiculos; i++) {
			if(vehiculos[i].getCaracteristicas().getDescripcionComercial().equals(descripcion)) {
				estado=true;
				
			}
		}
		
		return estado;
	}

	public void crearVehiculo(Vehiculo vehiculo) {
		this.vehiculos[indexVehiculos++]=vehiculo;
		
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

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Integer getIndexVehiculos() {
		return indexVehiculos;
	}

	public void setIndexVehiculos(Integer indexVehiculos) {
		this.indexVehiculos = indexVehiculos;
	}

	

}
