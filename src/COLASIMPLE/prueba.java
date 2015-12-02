package COLASIMPLE;

public class prueba {

	public static void main(String[] args) {
		
		int numero  = 9;
		
		Cola<Integer> nueva = new Cola();
		nueva.enQueue(0);
		nueva.enQueue(1);
		nueva.enQueue(2);
		nueva.enQueue(3);
		
		
		
			System.out.println(nueva.getBack());
			
			nueva.clear();
			if(nueva.isEmpty()){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
			
			
	
			
	
			
			
			
		
	}
}
