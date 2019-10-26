/*
 * 1) Crear arbol
 * 2) Agregar
 * 3) Eliminar
 * 4) Mostrar (recorrer)
 */
public class ArbolBinario {

	NodoArbol nodoRaiz;
	
	public ArbolBinario() {
		crearArbol();
	}
	
	//1) Crear arbol
	public void crearArbol() {
		nodoRaiz = null;
	}

	//2) Agregar
	public void agergarElemnto(int dato) {
		NodoArbol nuevoNodo = new NodoArbol(dato);
		if(nodoRaiz==null) {
			nodoRaiz = nuevoNodo;
		}else {
			NodoArbol aux = nodoRaiz;
			NodoArbol nodoAnterior;
			while(aux!=null) {
				nodoAnterior = aux;
				if(dato>aux.getDato()) {  //derecha
					aux = aux.getNodoDer();
					if(aux==null)
						nodoAnterior.setNodoDer(nuevoNodo);
				}else { //izquierda
					aux = aux.getNodoIzq();
					if(aux==null)
						nodoAnterior.setNodoIzq(nuevoNodo);
				}
			}
		}
	}//metodo agergarElemento
	
	// encontar mayor 
	
	public void mostrarMenor(int dato) {
		
	}
	
	
	public void recorridoPreorden(NodoArbol nodoRaiz) {
		if(!(nodoRaiz==null)) {
			System.out.print(nodoRaiz.getDato() + " => ");
			recorridoPreorden(nodoRaiz.getNodoIzq());
			recorridoPreorden(nodoRaiz.getNodoDer());
		}
	}
	
			
	public void recorridoEnorden(NodoArbol nodoRaiz) {
		if(!(nodoRaiz==null)) {
			recorridoEnorden(nodoRaiz.getNodoIzq());
			System.out.print(nodoRaiz.getDato() + " => ");
			recorridoEnorden(nodoRaiz.getNodoDer());
		}
	}
				
	public void recorridoPostorden(NodoArbol nodoRaiz) {
		if(!(nodoRaiz==null)) {
			recorridoPostorden(nodoRaiz.getNodoIzq());
			recorridoPostorden(nodoRaiz.getNodoDer());
			System.out.print(nodoRaiz.getDato() + " => ");
		}
	}
	 
	
}//class






