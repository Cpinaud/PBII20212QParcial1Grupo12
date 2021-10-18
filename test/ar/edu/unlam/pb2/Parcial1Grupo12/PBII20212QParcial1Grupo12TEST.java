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
	
	@Test
	public void queSePuedeBuscarUnVehiculoEnlaFabrica() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		
		Accesorio accesorio1 = new Accesorio();
		
		Caracteristicas caracteristica1= new Caracteristicas();
		Caracteristicas caracteristica2= new Caracteristicas(4, "v8", "negro", 4, false, true, "2020", 300.0, 200.0, "usado");
		
		Vehiculo vehiculo = new Auto(150.0, 4, accesorio1, true,4, caracteristica1);
		
		Auto auto= new Auto(200.0, 4, accesorio1, true, 4, caracteristica2);
			
		
		fabrica.crearVehiculo(vehiculo);
		fabrica.crearVehiculo(auto);
		
		Boolean valorEsperado =  true ;
		
		Boolean valorObtenido= fabrica.buscarVehiculoPorDescripcionComercial("usado");
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
