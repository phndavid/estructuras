package COLASIMPLE;

public class Nodo<T> {

	private Nodo<T> primero;

	private Nodo<T> siguiente;

	private T elemento;

	public Nodo(T elemento1) {
		this.elemento = elemento1;
	}

	public Nodo<T> getPrimero() {
		return primero;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> nodo) {
		this.siguiente = nodo;
	}

	public void setPrimero(Nodo<T> nodo) {
		this.primero = nodo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "Nodo ["+ getElemento() +" ]";
	}
	
}