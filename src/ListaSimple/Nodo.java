package ListaSimple;

public class Nodo<T> implements INodo<T>{

	

	private Nodo<T> siguiente;

	private T elemento;

	public Nodo(T elemento1) {
		this.elemento = elemento1;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(INodo<T> nodo) {
		this.siguiente = (Nodo<T>) nodo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}



}