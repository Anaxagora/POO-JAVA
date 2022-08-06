package vehiculos;

public class Vehiculo {

	protected String marca;
	protected Cliente dueño;
	protected double kilometraje;
	protected int ruedas;
	
	public Vehiculo(String marca, Cliente dueño, double kilometraje, int ruedas) {
		this.marca = marca;
		this.dueño = dueño;
		this.kilometraje = kilometraje;
		this.ruedas = ruedas;
	}

	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", dueño=" + dueño + ", kilometraje=" + kilometraje + ", ruedas=" + ruedas
				+ "]";
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public int getRuedas() {
		return ruedas;
	}
	

	
}
