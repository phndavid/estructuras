package Pila;

public class pruebas {

	public pruebas() {
		// TODO Auto-generated constructor stub
	}
	public final static void main (String [ ]args){
		Pila1<Integer>pila= new Pila1<>();
		pila.push(4);
		pila.push(2);
		pila.push(5);
		pila.pop();
		pila.pop();
		System.out.println(pila.peek());
	}

}
