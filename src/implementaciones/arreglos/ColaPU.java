package implementaciones.arreglos;

import api.ColaTDA;

public class ColaPU implements ColaTDA {

	int[] a;
	int indice;
	
	public void InicializarCola() {
		// TODO Auto-generated method stub
		a = new int[100];
		indice = 0;
	}

	public void Acolar(int x) {
		// TODO Auto-generated method stub
		for (int i = indice -1; i >= 0; i--) {
			a[i+1] = a[i];
		}
		a[0]=x;
		indice++;
	}

	public void Desacolar() {
		// TODO Auto-generated method stub
		indice --;
	}

	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	public int Primero() {
		// TODO Auto-generated method stub
		return 0;
	}

}
