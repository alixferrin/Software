package Multiplicacion;
import static org.mockito.Mockito.*;


public class Resta {
	Suma rest;
	
	public Resta(){
		rest = mock(Suma.class);
		when(rest.suma(5, 3)).thenReturn(2);
		when(rest.suma(5, 2)).thenReturn(3);
		when(rest.suma(5,-2)).thenReturn(7);	
		
	}
	public int resta(int x1, int x2) {
		int resultado=0;
		resultado = rest.suma(x1, x2);
		return resultado;
	}	
}
