package COLASIMPLE;

public class Cola<T> implements ICola<T>{
	private Nodo<T> front;
	private Nodo<T> back;

	public Cola() {
		
	}

	@Override
	public void enQueue(T nodo) {
		Nodo<T> nuevo= new Nodo(nodo);
		Nodo<T> primero = front;
		if(primero==null){
			front = nuevo;		
						
		}
		else{
		
				back.setSiguiente(nuevo);
					
		}
		back=nuevo;
		
	}

	@Override
	public void deQueue() {
		Nodo<T>nextFront= front.getSiguiente();
		front.setSiguiente(null);
		front=nextFront;
		
		
	}

	@Override
	public void clear() {
		
		Nodo<T>antes=null;
		
		while(front!=null){
			Nodo<T>siguiente= front;
			while(siguiente!=back){
				antes=siguiente;
				siguiente=siguiente.getSiguiente();
			}
			if(antes==front){
				front=null;
			}
			antes.setSiguiente(null);
			back=antes;
			
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		boolean vacio= false;
		if(front==null){
			vacio=true;
		}
		return vacio;
	}

	
	

	public Nodo<T> getFront() {
		return front;
	}

	public void setFront(Nodo<T> front) {
		this.front = front;
	}

	public Nodo<T> getBack() {
		return back;
	}

	public void setBack(Nodo<T> back) {
		this.back = back;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
