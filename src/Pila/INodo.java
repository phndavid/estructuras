package Pila;

public interface INodo <T>{
	
	public INodo<T>getSiguiente();
	public void setSiguiente(INodo<T> siguiente);
	public T getElemento();
	public void setElemento(T elemento);
	
}
