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
	public void CuandoLaFabricaAbreTengaVehiculosFabricados() {
		
		Vehículo vehículo1 = new Vehículo ("modelo A", 4, 4, "Toyiva 1.6","azul marino", 5, "automatica", "airbag", "incluidos", "full", "activo", "DACOTA Muzin 1.6", 210, 150, 5 );
		assertNotNull(vehículo1);	
	}
	
	@Test
	public void CuandoLaFabricaCreoUnAutoSeLeAsigneUnCodigoYSeAlmaceneEnLaListaDeVehículos() {
		
		Vehiculos[] vehiculo=new Vehiculos[10];
		vehiculo[0]=new Vehiculos("modelo A", 4, 4, "Toyiva 1.6","azul marino", 5, "automatica", "airbag", "incluidos", "full", "activo", "DACOTA Muzin 1.6", 210, 150, 5 );
		assertNotNull(vehiculo[0]);	
	}
	

}
