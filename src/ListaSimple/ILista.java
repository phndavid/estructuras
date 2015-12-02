package ListaSimple;

public interface ILista<T> {
	
	public void add(T nodo);
	
	public void remove(T nodo);
	
	public void removePos(int pos);
	
	public void removeAll();
	
	public T get(int pos);
	

}
