package ListaSimple;

public class pruebas {

	public pruebas() {
		// TODO Auto-generated constructor stub
	}
	
	public final static void main(String[]args){
		ListaSimple< Integer> enter= new ListaSimple<>();
		enter.add(78);
		enter.add(45,0 );
		enter.add(27,0);
		enter.removePos(1);
		System.out.println(enter.get(0 ));
	}

	
}
