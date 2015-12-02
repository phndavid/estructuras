package COLASIMPLE;

public interface ICola<T> {
	public void enQueue(T nodo);
	public void deQueue();
	public void clear();
	public boolean isEmpty();
	public boolean isFull();

}
