package Multiplicacion;
import static org.mockito.Mockito.*;

import division.Multiplicacion;



public class Multiplicacion{
	Suma multi;
	
	public Multiplicacion(){
		multi = mock(Suma.class);
		when(multi.suma(0, 5)).thenReturn(5);
		when(multi.suma(5, 0)).thenReturn(5);
		when(multi.suma(5,5)).thenReturn(10);
		when(multi.suma(0, 5)).thenReturn(5);
		when(multi.suma(10, 5)).thenReturn(15);
		when(multi.suma(5, 10)).thenReturn(5);
		when(multi.suma(0, -5)).thenReturn(-5);
		when(multi.suma(-5, 0)).thenReturn(-5);
		when(multi.suma(-5, -5)).thenReturn(-10);
		when(multi.suma(-5, -10)).thenReturn(-15);
		when(multi.suma(-10,-5)).thenReturn(-15);
		when(multi.suma(-15,-5)).thenReturn(-20);



	}
	
	public int multiplicacion(int x1, int x2) {
		int cont=0;
		int resultado=0;
		for(int i=0; i<x2;i++) {
			resultado=multi.suma(resultado,x1);
		}
		if(x2<0) {
			while(cont<x2) {
			resultado = multi.suma(resultado, -x1);
			}
		}
		return resultado;
	}
	public static void main(String[] args) {
		Multiplicacion div = new Multiplicacion();
		System.out.println(div.multiplicacion(5,-2));
	}
}