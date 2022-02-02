package pruebas_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import pk_SuperBuscaMinas.BotonMina;
import pk_SuperBuscaMinas.BotonMina.Estado;

class BotonMinaTest {
	@BeforeAll
	@Test
	static void inicio(){
		System.out.println("*************** Inicio Prueba BotonMina ***************");
	}

	@Test
	public void TestcambiarAspecto() {
		for(Estado estado : Estado.values())
		{
			BotonMina boton=new BotonMina();
			System.out.println("Botón Inicial:\t" + boton);
			System.out.println("Nuevo estado:\t" + estado);
			boton.cambiarAspecto(estado);
			assertTrue(boton.getEstado().equals(estado));
			System.out.println("Botón Inicial:\t" + boton);
			System.out.println("");
		}
	}
	
	@AfterAll
	@Test
	static void fin() {
		System.out.println("*************** Fin Prueba BotonMina ***************");
	}
}
