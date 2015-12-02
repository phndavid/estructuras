package COLAPRIORIDAD;

public class Numero implements IPrioridad<Integer> {
	private int contenido;
	private int prioridad;
	public Numero(int cont, int prio) {
		contenido=cont;
		prioridad=prio;
	}

	@Override
	public Integer getPrioridad() {
		
		return prioridad;
	}
	public Integer getcontenido(){
		return contenido;
	}

}
