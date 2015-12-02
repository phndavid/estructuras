package COLAPRIORIDAD;



public class ColaPrioridad<T extends IPrioridad<Integer>> implements IColaPrioridad<T>{
	private NodoDoble<T > front;
	private NodoDoble  <T> back;
	private int size;

	public ColaPrioridad() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enQueue(T nodo) {
		NodoDoble<T> nuevo=new NodoDoble(nodo);
		if(size==0){
			front=nuevo;
			front.setSiguiente(back);
			back=nuevo;
			back.setAnterior(front);
			size++;
		}
		else{
			if(front==back){
				if(front.getElemento().getPrioridad()<=nodo.getPrioridad()){
					front.setSiguiente(nuevo);
					nuevo.setAnterior(front);
					back=nuevo;
					back.setAnterior(front);
					front.setSiguiente(back);
					size++;
				}
				else{
					nuevo.setSiguiente(back);
					front=nuevo;
					back.setAnterior(front);
					front.setSiguiente(back);
					size++;
					
				}
			}
			else{
				NodoDoble<T>ultimo=back;
				if(ultimo.getElemento().getPrioridad()<=nodo.getPrioridad()){
					nuevo.setAnterior(back);
					back=nuevo;
					size++;
				}
				else{
					
					while(ultimo!=null){
						NodoDoble<T>siguiente= ultimo.getSiguiente();
						if(ultimo.getElemento().getPrioridad()==nodo.getPrioridad()){
							ultimo.setSiguiente(nuevo);
							nuevo.setAnterior(ultimo);
							nuevo.setSiguiente(siguiente);
							siguiente.setAnterior(nuevo);
							size++;
							break;
						}
						else if (ultimo.getElemento().getPrioridad()<=nodo.getPrioridad()&&siguiente.getElemento().getPrioridad()>nodo.getPrioridad()){
							ultimo.setSiguiente(nuevo);
							nuevo.setAnterior(ultimo);
							nuevo.setSiguiente(siguiente);
							siguiente.setAnterior(ultimo);
							size++;
							break;
						}
						else{
							ultimo=ultimo.getAnterior();
						}
						
					}
				}
				
				
				
				
				
			}
		}
		
		

		
		
	}

	@Override
	public void deQueue() {
		NodoDoble<T>nextFront= front.getSiguiente();
		front.setSiguiente(null);
		front=nextFront;
		
	}

	@Override
	public void clear() {
		front= null;
		back=null;
	}

	@Override
	public boolean isEmpty() {
		boolean vacio= false;
		if(front==null){
			vacio=true;
		}
		return vacio;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public NodoDoble<T> getFront() {
		return front;
	}

	public void setFront(NodoDoble<T> front) {
		this.front = front;
	}

	public NodoDoble<T> getBack() {
		return back;
	}

	public void setBack(NodoDoble<T> back) {
		this.back = back;
	}

}
