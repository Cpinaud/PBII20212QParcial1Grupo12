package ar.edu.unlam.pb2.Parcial1Grupo12;

public class Accesorio {
	private String nombre;
	private String descripcion;

	public Accesorio(String nombre, String descripcion) {

		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Accesorio() {

		this.nombre = " Cecicero";
		this.descripcion = "Cenicero Universal Para Auto - Porta Objetos , Base de Goma";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Accesorio [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
