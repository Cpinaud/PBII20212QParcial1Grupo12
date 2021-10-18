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
	public void queSePuedaCrearUnAutoEnLaFabrica() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo auto = new Auto(150.0, 4);
		Vehiculo vehiculoEsperado =  auto ;
		fabrica.fabricarVehiculo(auto);
		Vehiculo vehiculoObtenido=fabrica.getVehiculo(0);
		assertEquals(vehiculoObtenido,vehiculoEsperado);
	}
	
	@Test
	public void queSePuedaCrearUnaCamionetaEnLaFabrica() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo camioneta = new Camioneta(6,5.43,8.54);
		Vehiculo vehiculoEsperado =  camioneta ;
		fabrica.fabricarVehiculo(camioneta);
		Vehiculo vehiculoObtenido=fabrica.getVehiculo(0);
		assertEquals(vehiculoObtenido,vehiculoEsperado);
	}
	

	
	@Test
	public void queAlFabricarUnVehiculoEnLaFabricaEsteEnFabricacion() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo auto = new Auto(150.0, 4);
		assertTrue(auto.getEnFabricacion());
		
	}
	
	
	
	@Test
	public void queSePuedanAgregarAdicionalesAUnVehiculoDeCualquierTipo() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo auto = new Auto(150.0, 4);
		Adicional adicionalAuto = new Adicional("Combustible", "Equipo GNC 90 litros, 5ta generación");
		auto.agregarAdicional(adicionalAuto);
		String valorEsperadoAuto = "*[Nombre= Combustible, Descripcion= Equipo GNC 90 litros, 5ta generación]";
		String valorObtenidoAuto = auto.getAdicionales();
		assertEquals(valorEsperadoAuto,valorObtenidoAuto);
		
	}
	
	@Test
	public void queSePuedaColocarUnMotorAUnVehiculo() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo auto = new Auto(150.0, 4);
		fabrica.colocarMotor(auto, "ASD768A6SD0DNKAJSDN0");
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = auto.getMotorColocado();
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void queSePuedaColocarCarroceriaAUnVehiculo() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo auto = new Auto(150.0, 4);
		fabrica.colocarCarroceria(auto, "ASD5556SD0wf34AJSDN0");
		Boolean valorObtenido = auto.getCarroceriaColocada();
		assertTrue(valorObtenido);
		
	}
	
	@Test
	public void queSePuedaPintarUnVehiculo() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo camioneta = new Camioneta(6, 4.43,8.87);
		fabrica.pintar(camioneta, "Rojo");
		Boolean valorObtenido = camioneta.getPintado();
		assertTrue(valorObtenido);
		
	}
	
	@Test
	public void queAlFinalizarLaFabricacionDeUnVehiculoEsteFinalizado() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Vehiculo camioneta = new Camioneta(6, 4.43,8.87);
		fabrica.fabricarVehiculo(camioneta);
		fabrica.colocarAsientos(camioneta);
		fabrica.colocarCajaDeCambios(camioneta);
		fabrica.colocarCarroceria(camioneta, "AJSKH8ASD98AABKD");
		fabrica.colocarMotor(camioneta, "KASJDKAJSD897A");
		fabrica.pintar(camioneta, "Verde");
		assertTrue(camioneta.finalizado());
		
		
	}
	
	@Test
	public void queAlQuererActivarModoCruceroEnUnaCamionetaAMenosDe70InformeQueNoSePuede() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		Camioneta camioneta = new Camioneta(6, 4.43,8.87);
		camioneta.acelerar(50);
		String valorEsperado = camioneta.ActivarModoCrucero();
		assertEquals("La velocidad minima para modo crucero es 70Km/h",valorEsperado);
		
		
		
	}
	

     
	 @Test
     public void queSePuedaCrearMotorEnLaFabrica() {
		 Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		 Motor motor = new Motor ();
		 Motor motorObtenido=Fabrica.crearMotor(); 
		 assertNull(motorObtenido);
		 
     }

	@Test
	public void queSePuedeBuscarUnVehiculoEnlaFabrica() {
		Fabrica fabrica = new Fabrica ("Fiat",302234522,"Av. Rivadavia 17654");
		
		Adicional accesorio1 = new Adicional();
		
		
		Vehiculo vehiculo = new Auto(150.0, 4, accesorio1, true,4);
		
		Auto auto= new Auto(200.0, 4, accesorio1, true, 4);
			
		
		fabrica.fabricarVehiculo(vehiculo);
		fabrica.fabricarVehiculo(auto);
		
		Boolean valorEsperado =  true ;
		
		Boolean valorObtenido= fabrica.buscarVehiculoPorDescripcionComercial("usado");
		
		assertEquals(valorEsperado, valorObtenido);
	}

}

