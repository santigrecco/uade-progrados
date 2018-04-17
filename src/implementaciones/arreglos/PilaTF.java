package implementaciones.arreglos;

import api.PilaTDA;

public class PilaTF implements PilaTDA {

	private int[] vector;
	private int cant;
	
	public PilaTF() {
		this.InicializarPila();
	}

	public void InicializarPila() {
		// TODO Auto-generated method stub
		vector = new int[100]; 
		cant = 0;
	}

	public void Apilar(int x) {
		// TODO Auto-generated method stub
		vector [cant] = x;
		cant++;
	}

	public void Desapilar() {
		// TODO Auto-generated method stub
		cant--;
	}

	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return  (cant == 0);
	}

	public int Tope() {
		// TODO Auto-generated method stub
		return vector[cant - 1];
	}
	
	public void LimpiarPila(PilaTDA p) {
		// TODO Auto-generated method stub
		
		while(!p.PilaVacia()) {
			p.Desapilar();
		}
	}

}
