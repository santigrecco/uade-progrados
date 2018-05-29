package tps.tp1;

import api.ColaPrioridadTDA;
import api.PilaTDA;
import implementaciones.arreglos.ColaPrioridadDA;
import implementaciones.arreglos.PilaTF;
import utilidades.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilaTDA p1 = new PilaTF(), 
				p2 = new PilaTF(), 
				p3 = new PilaTF();
		
		p1.InicializarPila();
		p2.InicializarPila();
		p3.InicializarPila();
		
		ColaPrioridadTDA colaP = new ColaPrioridadDA();
		colaP.InicializarCola();
		

		
		p3.Apilar(23);
		p3.Apilar(23);
		p3.Apilar(31);
		p3.Apilar(782);
		p3.Apilar(201);
		p3.Apilar(00);
		p3.Apilar(576);
		p3.Apilar(980);
		p3.Apilar(223);
		p3.Apilar(44551);
		p3.Apilar(1234);
		
		Metodos.MostrarPilaInline(p3);
		
		p3.Desapilar();
		
		Metodos.MostrarPilaInline(p3);
		
		colaP.AcolarPrioridad(10, 2);
		colaP.AcolarPrioridad(15, 3);
		colaP.AcolarPrioridad(20, 0);
		colaP.AcolarPrioridad(8, 90);
	}

}
