package COLAPRIORIDAD;

public interface IColaPrioridad<T> {
	public void enQueue(T nodo);
	public void deQueue();
	public void clear();
	public boolean isEmpty();
	public boolean isFull();
}
