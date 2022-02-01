package pruebas_junit;
import pk_SuperBuscaMinas.*;
import pk_SuperBuscaMinas.BotonMina.Estado;
import pk_SuperBuscaMinas.BotonMina.Valor;
import pk_SuperBuscaMinas.Util.Posicion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MatrizBotonesTest {
	
	@BeforeAll
	@Test
	static void inicio()
	{
		System.out.println("*************** Inicio Prueba MatrizBotones ***************");
	}
	
	@Test
	MatrizBotones creaMatriz()
	{
		MatrizBotones matriz=new MatrizBotones(5, 5);
		
		matriz.getBoton(0, 1).setValor(Valor.MINA);
		matriz.getListaPosicionMinas().add(new Coordenadas(0,1));
		
		matriz.getBoton(0, 2).setValor(Valor.MINA);
		matriz.getListaPosicionMinas().add(new Coordenadas(0,2));
		
		matriz.getBoton(1, 0).setValor(Valor.MINA);
		matriz.getListaPosicionMinas().add(new Coordenadas(1,0));
		
		matriz.getBoton(4, 0).setValor(Valor.MINA);
		matriz.getListaPosicionMinas().add(new Coordenadas(4,0));
		
		matriz.getBoton(0, 0).setValor(Valor.MINA);
		matriz.getListaPosicionMinas().add(new Coordenadas(0,0));
		
		matriz.getBoton(4, 1).setValor(Valor.MINA);
		matriz.getListaPosicionMinas().add(new Coordenadas(4,1));
		
		System.out.println("Matriz de prueba 5x5 con 6 minas");
		matriz.imprimir();
		return matriz;
	}
	
	

	@Test
	void testHayBoton() {
		MatrizBotones matriz=creaMatriz();
		
		assertTrue(matriz.hayBoton(matriz.getBoton(0, 0), Posicion.DER));
		assertTrue(matriz.hayBoton(matriz.getBoton(0, 0), Posicion.INF_DER));
		assertTrue(matriz.hayBoton(matriz.getBoton(0, 0), Posicion.INF));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 0), Posicion.INF_IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 0), Posicion.IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 0), Posicion.SUP_IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 0), Posicion.SUP));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 0), Posicion.SUP_DER));
		
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 4), Posicion.DER));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 4), Posicion.INF_DER));
		assertTrue(matriz.hayBoton(matriz.getBoton(0, 4), Posicion.INF));
		assertTrue(matriz.hayBoton(matriz.getBoton(0, 4), Posicion.INF_IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(0, 4), Posicion.IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 4), Posicion.SUP_IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 4), Posicion.SUP));
		assertTrue(!matriz.hayBoton(matriz.getBoton(0, 4), Posicion.SUP_DER));
		
		assertTrue(matriz.hayBoton(matriz.getBoton(4, 0), Posicion.DER));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 0), Posicion.INF_DER));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 0), Posicion.INF));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 0), Posicion.INF_IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 0), Posicion.IZQ));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 0), Posicion.SUP_IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(4, 0), Posicion.SUP));
		assertTrue(matriz.hayBoton(matriz.getBoton(4, 0), Posicion.SUP_DER));
		
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 4), Posicion.DER));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 4), Posicion.INF_DER));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 4), Posicion.INF));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 4), Posicion.INF_IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(4, 4), Posicion.IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(4, 4), Posicion.SUP_IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(4, 4), Posicion.SUP));
		assertTrue(!matriz.hayBoton(matriz.getBoton(4, 4), Posicion.SUP_DER));
		
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.DER));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.INF_DER));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.INF));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.INF_IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.SUP_IZQ));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.SUP));
		assertTrue(matriz.hayBoton(matriz.getBoton(2, 2), Posicion.SUP_DER));
	}
	
	@Test
	void testMuestraMinas()
	{
		System.out.println("Método MuestraMinas");
		MatrizBotones matriz=creaMatriz();
		List<Coordenadas> listaMinas=matriz.getListaPosicionMinas();
		matriz.muestraMinas();
		
		for (int i = 0; i < listaMinas.size(); i++) {
			assertEquals(matriz.getBoton(listaMinas.get(i)).getEstado(), Estado.MINA);
		}
		
		
	}
	
	@Test
	void testRecursivoDestapaBotonesAdyacentes()
	{
		
	}
	
	@AfterAll
	@Test
	static void fin()
	{
		System.out.println("*************** Fin Prueba MatrizBotones ***************");
	}

}
