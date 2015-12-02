package ListaSimple;



public class ListaSimple<T> implements ILista<T> {

	private Nodo<T> primero;
	private int posicion;
	private int size;

	public ListaSimple(){
		primero = null;
		posicion = 0;
		size=0;
	}
	
	@Override
	public void add(T nodo) {
		Nodo<T> nuevo = new Nodo<T>(nodo);
		
		if (primero == null) {
			primero = nuevo;
		} else {
			Nodo<T> siguiente = primero         ;
			while (siguiente.getSiguiente()!=null) {
				siguiente = siguiente.getSiguiente();
			}
			siguiente.setSiguiente(nuevo);
			size++;
		}
	}
	public void add(T elemento, int pos){
		if(pos<=size){
			Nodo<T> anterior= primero;
			Nodo<T> siguiente= anterior.getSiguiente();
			Nodo<T> nuevo= new Nodo<>(elemento);
			int contador=0;
			if(pos==0){
				nuevo.setSiguiente(anterior);
				primero=nuevo;
				size++;
			}else{
				while(contador!=pos){
					anterior=anterior.getSiguiente();
					contador++;
				}
				anterior.setSiguiente(nuevo);
				size++;
				nuevo.setSiguiente(siguiente);
				
			}
			
			
		}
		
		
		
		
	}

	@Override
	public void remove(T nodo) {
		
		Nodo<T> siguiente= primero;
		
		while(siguiente!=null){
			
			if(primero.getElemento().equals(nodo)){
				Nodo<T>elemento=primero.getSiguiente();
				primero=elemento;
			}else{//	System.out.println(primero.getElemento());
				
			
				
				Nodo<T> siguis= siguiente.getSiguiente();
				if(siguis!=null){
					if(siguis.getElemento().equals(nodo)){
						
						if(siguis.getSiguiente()==null){
							siguiente.setSiguiente(null);
						}
						else{
							siguiente.setSiguiente(siguis.getSiguiente());
						}
						
						
					}
				}
				
				
			//	anterior=anterior.getSiguiente();
			}
				//System.out.println(siguiente.getElemento());
			siguiente=siguiente.getSiguiente();
			
		}
		
	
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void removePos(int pos) {
		int contador =1;
		Nodo<T>siguiente= primero;
		if(pos==0){
			primero= siguiente.getSiguiente();
		}
		else{
			while(siguiente.getSiguiente()!=null){
				Nodo<T> siguiente1= siguiente.getSiguiente();
				if(contador== pos){
					
					siguiente.setSiguiente(siguiente1.getSiguiente());	
						
						break;
					
				}
				siguiente=siguiente.getSiguiente();
				contador++;
			}
			
		}
	

	}
	public void removeAll(){
		
		primero= null;
	}

	

	@Override
	public T get(int pos) {
		Nodo<T> siguiente= primero;
		T n=null;
		int contador=0;
		if(pos<=size){
			while (pos!=contador){
				siguiente= siguiente.getSiguiente();
				contador++;
				
			}
			n= siguiente.getElemento();
		}else{
			
			try {
				throw new Exception("posicion mayor que el tamaño");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return n;
	}

	public Nodo<T> getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
