package api;

/*
 * @Autor:
 * @Definicion:
 */


public interface ColaTDA {

	void InicializarCola();

	void Acolar(int x);

	void Desacolar();

	boolean ColaVacia();

	int Primero();	
}
