package utilidades;

import api.ColaTDA;
import api.PilaTDA;
import implementaciones.arreglos.ColaPU;
import implementaciones.arreglos.PilaTF;

/**
 * @author AGB
 * 
 */

public class Metodos {

	/**
	 * 
	 * Grupo de utilidades (Funciones) necesarias para el TP 1
	 * 
	 **/

	/**
	 * @Tarea: pasa los valores de la pila o (origen) a la pila d (destino)
	 * @Parametros: pilas origen y destino
	 * @Devuelve: -
	 * @Precondicion: las estruc. deben estar inicializadas
	 **/
	public void PasarPila(PilaTDA origen, PilaTDA destino) {
		while (!origen.PilaVacia()) {
			destino.Apilar(origen.Tope());
			origen.Desapilar();
		}
	}

	/**
	 * @Tarea: copia los valores de la pila o (origen) a la pila d (destino)
	 * @Parametros: pilas origen y destino
	 * @Devuelve: -
	 * @Precondicion:las estruc. deben estar inicializadas
	 **/
	public void CopiarPila(PilaTDA origen, PilaTDA destino) {
		PilaTDA aux = new PilaTF();
		aux.InicializarPila();

		PasarPila(origen, aux);
		while (!aux.PilaVacia()) {
			destino.Apilar(aux.Tope());
			origen.Apilar(aux.Tope());
			aux.Desapilar();
		}

	}

	/**
	 * @Tarea: cuenta la cantidad de elementos de la pila (origen)
	 * @Parametros: pilas origen
	 * @Devuelve: (integer) cantidad de elementos de la pila
	 * @Precondicion:las estruc. deben estar inicializadas
	 **/
	public int ContarElementosPila(PilaTDA origen) {
		int c = 0;
		PilaTDA aux = new PilaTF();
		CopiarPila(origen, aux);

		while (!aux.PilaVacia()) {
			c++;
			aux.Desapilar();
		}
		return c;

	}

	public int SumaElementosPila(PilaTDA origen) {
		int c = 0;
		PilaTDA aux = new PilaTF();
		CopiarPila(origen, aux);

		while (!aux.PilaVacia()) {
			c = c + aux.Tope();
			aux.Desapilar();
		}

		return c;
	}

	/**
	 * @Tarea: suma el valor de los elementos de la pila y los divide por la
	 *         cantidad de elementos de la fila
	 * @Parametros: pilas origen
	 * @Devuelve: (integer) promedio de lo elementos
	 * @Precondicion:las estruc. deben estar inicializadas
	 **/
	public int PromedioElementosPila(PilaTDA origen) {
		int c = 0;
		int prom = 0;

		PilaTDA aux = new PilaTF();
		CopiarPila(origen, aux);

		while (!aux.PilaVacia()) {
			c++;
			prom = prom + aux.Tope();
			aux.Desapilar();
		}

		prom = prom / c;

		return prom;

	}

	/**
	 * @Tarea: Muestra los elementos de la pila
	 * @Parametros: pilas origen
	 * @Devuelve: -
	 * @Precondicion:las estruc. deben estar inicializadas
	 **/
	public void MostrarPila(PilaTDA a) {
		PilaTDA aux = new PilaTF();

		CopiarPila(a, aux);

		while (!aux.PilaVacia()) {
			System.out.println(aux.Tope());
			aux.Desapilar();
		}

	}

	/**
	 * @Tarea: Invierte el contenido de una pila
	 * @Parametros: pila a
	 * @Devuelve: -
	 * @Precondicion: la estructura pila debe estar inicializada
	 **/
	public void InvertirPila(PilaTDA a) {
		ColaTDA aux = new ColaPU();

		aux.InicializarCola();
		PasarPilaACola(a, aux);
		PasarColaApila(aux, a);

	}

	/**
	 * @Tarea: Pasa el contenido de una pila a una cola
	 * @Parametros: pila a y cola c
	 * @Devuelve: -
	 * @Precondicion: ambas estructuras deben estar inicializadas
	 **/
	public void PasarPilaACola(PilaTDA p, ColaTDA c) {
		while (!p.PilaVacia()) {
			c.Acolar(p.Tope());
			p.Desapilar();
		}
	}

	/**
	 * @Tarea: Pasa el contenido de una cola a una pila
	 * @Parametros: cola c y pila a
	 * @Devuelve: -
	 * @Precondicion: ambas estructuras deben estar inicializadas
	 **/
	public void PasarColaApila(ColaTDA c, PilaTDA p) {
		while (!c.ColaVacia()) {
			p.Apilar(c.Primero());
			c.Desacolar();
		}
	}

	/**
	 * 
	 * Grupo de utilidades (Funciones) necesarias para el TP 2
	 * 
	 **/

	/**
	 * @Tarea: Pasa el contenido de una cola a una pila
	 * @Parametros: cola c y pila a
	 * @Devuelve: -
	 * @Precondicion: ambas estructuras deben estar inicializadas
	 **/
	public void PasarCola(ColaTDA origen, ColaTDA destino) {

	}

	
	
	public void InvertirCola(ColaTDA c) {
		int x;
		x=c.Primero();
		c.Desacolar();
		
		if (!c.ColaVacia()) {
			InvertirCola(c);
		}
		c.Acolar(x);
	}

}