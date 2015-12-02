package Pila;

public class NodoDoble<T> {
	
	private NodoDoble<T> siguiente;
	private NodoDoble<T> anterior;

	private T elemento;

	public NodoDoble(T elemento1) {
		this.elemento = elemento1;
	}

	

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}
	
	public NodoDoble<T> getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NodoDoble<T> nodo) {
		this.anterior = nodo;
	}
	
	public void setSiguiente(NodoDoble<T> nodo) {
		this.siguiente = nodo;
	}

	


	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

}
