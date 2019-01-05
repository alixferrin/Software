package multiplicacionTest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Multiplicacion.Multiplicacion;
import Multiplicacion.Resta;

public class MultiplicacionTest{
	Multiplicacion multi = new Multiplicacion();
	Resta resta = new Resta();

	
	@Test	
	public void testResta() {
	assertEquals("El resultado debe ser 3", 3, resta.resta(5,2));
	assertEquals("El resultado debe ser 2", 2, resta.resta(5,3));
	assertEquals("El resultado debe ser 7", 7, resta.resta(5,-2));
}
	
	@Test
	public void testMultiplicacion() {
		assertEquals("El resultado debe ser 10", 10, multi.multiplicacion(5,2));
		assertEquals("El resultado debe ser 15", 15, multi.multiplicacion(5,3));
		assertEquals("El resultado debe ser 5", 5, multi.multiplicacion(5,1));
	}
	
}	
