package ar.edu.unlam.pb2.Parcial1Grupo12;

import static org.junit.Assert.*;

import org.junit.Test;

public class PBII20212QParcial1Grupo12TEST {

	@Test
	public void queSePuedaCrearUnaFabrica() {
		
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		assertNotNull(fabrica);	
	}
	
	@Test
	public void queSePuedaCrearUnVehiculoEnLaFabrica() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Accesorio accesorio1 = new Accesorio();
		Caracteristicas caracteristica1= new Caracteristicas();
		
		Vehiculo vehiculo = new Auto(150.0, 4, accesorio1, true,4, caracteristica1);
		
		Vehiculo vehiculoEsperado =  vehiculo ;
		fabrica.crearVehiculo(vehiculoEsperado);
		Vehiculo vehiculoObtenido=fabrica.getVehiculo(0);
		assertEquals(vehiculoObtenido,vehiculoEsperado);
	}

}
 //comentario de comunicacion y prueba