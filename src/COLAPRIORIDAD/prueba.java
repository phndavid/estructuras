package COLAPRIORIDAD;

public class prueba {

	public static void main(String[] args) {
		
		Numero numero1= new Numero(1, 3);
		Numero numero2= new Numero(2, 1);
		Numero numero3= new Numero(3, 2);
		Numero numero4= new Numero(4, 2);
		Numero numero5= new Numero(4, 0);
		Numero numero6= new Numero(6, 0);
		
		ColaPrioridad<Numero> nueva = new ColaPrioridad();
		nueva.enQueue(numero1);
		nueva.enQueue(numero2);
		nueva.enQueue(numero3);
		nueva.enQueue(numero4);
		nueva.enQueue(numero5);
		nueva.enQueue(numero6);
		
		NodoDoble<Numero>siguiente=nueva.getFront();
		
		//	nueva.clear();
			//System.out.println(uno.getElemento());


//			nueva.deQueue();
//			System.out.println(nueva.getFront().getElemento()+"A");
			
		
			
			
			
		
		//nueva.add(5);
		

	//	System.out.println(nueva.convertirCadena());
	}

}