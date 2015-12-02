package ListaDoble;

import java.security.spec.EllipticCurve;

import ListaSimple.Nodo;

public class ListaDoble <T> implements ILista<T> {
	
	private NodoDoble<T> primero;
	private int posicion;
	private int size;

	public ListaDoble() {
		primero= null;
		size=0;
	}

	@Override
	public void add(T nodo) {
		NodoDoble< T> nuevo= new NodoDoble(nodo);
		if(size==0&&primero==null){
			primero=nuevo;
			nuevo.setAnterior(null);
			nuevo.setSiguiente(null);
			size++;
			
		}else{
			NodoDoble<T>siguiente= primero;
			while(siguiente.getSiguiente()!=null){
				siguiente=siguiente.getSiguiente();
			}
			siguiente.setSiguiente(nuevo);
			nuevo.setAnterior(siguiente);
			nuevo.setSiguiente(null);
			size++;
		}
		
	}
	@Override
	public void add(T elemento, int pos) {
		if(pos<size){
			NodoDoble<T>nuevo= new NodoDoble<>(elemento);
			if( pos ==0){
				nuevo.setSiguiente(primero);
				primero.setAnterior(nuevo);
				primero=nuevo;
				size++;
			}
			else{
				int contador=0;
				NodoDoble<T>siguiente= primero;
				while(siguiente!=null){
					if(pos==contador){
						NodoDoble< T>anterior= siguiente.getAnterior();
						anterior.setSiguiente(nuevo);
						nuevo.setAnterior(anterior);
						nuevo.setSiguiente(siguiente);
						siguiente.setAnterior(nuevo);
						size++;
						break;
					}
					else{
						contador++;
						siguiente=siguiente.getSiguiente();
					}
				}
			}
		
		
		}
	}

	@Override
	public void remove(T nodo) {
		if(primero!=null){
			NodoDoble<T>siguiente= primero.getSiguiente();
			while(siguiente!=null){
			
				if(primero.getElemento().equals(nodo)){
					primero=primero.getSiguiente() ;
					primero.setAnterior(null);
					size--;
					
				}
				else{
					if(siguiente.getElemento().equals(nodo)){
						if(siguiente.getSiguiente()==null){
							NodoDoble<T>anterior=siguiente.getAnterior();
							anterior.setSiguiente(null);
							size--;
						}else{
							NodoDoble<T>anterior=siguiente.getAnterior();
							anterior.setSiguiente(siguiente.getSiguiente());
							siguiente.getSiguiente().setAnterior(anterior);
							size--;
						}
						
					}
				
						
					
				}
								
				
				
				siguiente= siguiente.getSiguiente();
			}
	
			
		
		}
		
	}

	@Override
	public void removePos(int pos) {
		if(pos<size){
			
			if(pos==0){
				NodoDoble<T>siguiente= primero.getSiguiente();
				primero=siguiente;
				primero.setAnterior(null);
				size--;
			}	
			else{
				NodoDoble<T>siguiente= primero;
				int contador=0;
				while(siguiente!=null){
					if(pos==contador){
						if(siguiente.getSiguiente()==null){
							NodoDoble<T>anterior=siguiente.getAnterior();
							anterior.setSiguiente(null);
							size--;
							break;
						}
						else{
							NodoDoble<T>anterior=siguiente.getAnterior();
							NodoDoble<T>siguienteOne= siguiente.getSiguiente();
							anterior.setSiguiente(siguienteOne);
							siguienteOne.setAnterior(anterior);
							size--;
							break;
							
						}
						
					}
					else
					{
						contador++;
						siguiente=siguiente.getSiguiente();
					}
				}
			}
		}
		
		
	}

	@Override
	public void removeAll() {
		primero=null;
		
	}

	@Override
	public T get(int pos) {
		T elemento = null;
		NodoDoble<T>siguiente= primero;
		int contador=0;
		if(pos==0){
			elemento= primero.getElemento();
		}
		else{
			while(siguiente!=null){
				if(pos==contador){
					elemento=siguiente.getElemento();
					break;
				}else{
					contador++;
					siguiente= siguiente.getSiguiente();
				}
			}
		}
		
		
		
		
		return elemento;
	}

	public NodoDoble<T> getPrimero() {
		return primero;
	}

	public void setPrimero(NodoDoble<T> primero) {
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
