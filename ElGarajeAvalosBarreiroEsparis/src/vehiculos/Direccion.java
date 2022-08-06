package vehiculos;
public class Direccion {

	private String calle;
	private int altura;
	
	public Direccion () {}
	
	public Direccion (String a, int b) {
		calle = a;
		altura = b;
	}
	@Override
	public String toString() {
		return " " + calle + " " + altura;
	}

	
}
