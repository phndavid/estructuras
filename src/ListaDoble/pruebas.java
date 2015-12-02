package ListaDoble;

public class pruebas {

	public pruebas() {
		
		
	}
	public final static void main(String []agrs)
	{
		ListaDoble<Integer>enteros= new ListaDoble<Integer>();
		enteros.add(1);
		enteros.add(1);
		enteros.add(2);
		enteros.add(3);
		enteros.add(1);
		enteros.add(4);
		enteros.add(5);
		enteros.add(6);
		enteros.add(1);
		enteros.add(1);
		enteros.remove(1);
		enteros.add(69, 4);
		
		enteros.removePos(5);
		for (int i = 0; i < enteros.getSize(); i++) {
			System.out.println(enteros.get(i));
		}
		
	}
}
