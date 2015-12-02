package Pila;

public interface  IPila <T> {
	public void push(T elemento);
	/**
	 * Elimina el metodo en el tope de la fila
	 */
	public void pop();
	
	public T peek();
	
	public boolean isEmpty();
	
	public void clear();
}
