package pruebas_junit;

import static org.junit.jupiter.api.Assertions.*;

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
			System.out.println("Botón Inicial:\t[Val=" + boton.getValor() + " , Est=" + boton.getEstado() + "]");
			System.out.println("Nuevo estado:\t" + estado);
			boton.cambiarAspecto(estado);
			System.out.println("Botón Inicial:\t[Val=" + boton.getValor() + " , Est=" + boton.getEstado() + "]");
			System.out.println("");
		}
		System.out.println("*************** Fin Prueba BotonMina ***************");
	}
}
