package api;

/**
 * @author AGB
 * @definicion: coleccion de datos tal que el ultimo en entrar es el primero en
 * salir
 *
 */

public interface PilaTDA {

	/** 
	 *  @#InicializarPila
	 * 	@Tarea: inicializa la estructura 
	 * 	@Parametros: -
	 *  @Devuelve: - 
	 *  @Precondicion:-
	 **/
	public void InicializarPila();

	
	 /** 
	  *  @#Apilar
	  *  @Tarea: agregar un valor a la estructura 
	  *  @Parametros: valor a agregar (integer)
	  *  @Devuelve: - 
	  *  @Precondicion: la pila debe estar inicializada
	  **/
	public void Apilar(int x);

	 /** 
	  *  @#Desapilar 
	  *  @Tarea: elimina el primer elemento a salir de la estructura
	  *  @Parametros: -
	  *  @Devuelve: - 
	  *  @Precondicion:la pila no debe estar vacia
	  **/
	public void Desapilar();
	
	 /** 
	  *  @#PilaVacia
	  *  @Tarea: devuelve verdadero si la estructura no tiene datos
	  *  @Parametros: -
	  *  @Devuelve: verdero si la pila se encunetra vacia, caso contrario devuelve falso
	  *  @Precondicion: la pila debe estar inicializada
	  **/
	boolean PilaVacia();

	 /** 
	  *  @#Tope
	  *  @Tarea: devuelve el valor del primer elemento a salir de la pila
	  *  @Parametros: -
	  *  @Devuelve: valor del primer elemento a salir
	  *  @Precondicion: la pila no debe estar vacia
	  **/
	public int Tope();

}
