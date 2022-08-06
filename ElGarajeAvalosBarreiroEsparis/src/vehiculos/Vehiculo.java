package vehiculos;

public class Vehiculo {

	protected String marca;
	protected Cliente due�o;
	protected double kilometraje;
	protected int ruedas;
	
	public Vehiculo(String marca, Cliente due�o, double kilometraje, int ruedas) {
		this.marca = marca;
		this.due�o = due�o;
		this.kilometraje = kilometraje;
		this.ruedas = ruedas;
	}

	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", due�o=" + due�o + ", kilometraje=" + kilometraje + ", ruedas=" + ruedas
				+ "]";
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public int getRuedas() {
		return ruedas;
	}
	

	
}
