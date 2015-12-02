package Pila;

public class Pila1 <T> implements IPila<T> {

	private NodoDoble<T> primero;
	
	public void push(T elemento) {
		
		NodoDoble<T> ultimo= new NodoDoble<T>(elemento);
		ultimo.setSiguiente(null);
		NodoDoble<T> siguiente= primero;
		
		
		if(primero==null){
			primero=ultimo;
			primero.setAnterior(null);
			primero.setSiguiente(null);
				}
		else{
			
			while(siguiente.getSiguiente()!=null){
				siguiente=siguiente.getSiguiente();
			}
			
			siguiente.setSiguiente(ultimo);
			ultimo.setAnterior(siguiente);
			
		}
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pop() {
		NodoDoble<T> siguiente= primero;
		
		while(siguiente.getSiguiente()!=null){
			siguiente=siguiente.getSiguiente();
		}
		NodoDoble<T> anterior= siguiente.getAnterior();
		anterior.setSiguiente(null);
		siguiente.setAnterior(null);
		// TODO Auto-generated method stub
		
	}

	@Override
	public T peek() {
		NodoDoble<T> siguiente= primero;
		
		while(siguiente.getSiguiente()!=null){
			siguiente=siguiente.getSiguiente();
		}
		return siguiente.getElemento();
	}

	@Override
	public boolean isEmpty() {
		boolean verdad=false;
		if(primero==null){
			verdad=true;
		}
		return false;
	}

	@Override
	public void clear() {
		primero=null;
		
	}
	
	
	




}
