package vehiculos;
public class Auto extends Vehiculo{
	
	protected int puertas;
	
	public Auto(String marca, Cliente dueño, double kilometraje, int ruedas, int puertas) {
		super(marca, dueño, kilometraje, ruedas);
		this.puertas = puertas;
	}
	
	@Override
	public String toString() {
		return "Auto [puertas=" + puertas + ", toString()=" + super.toString() + "]";
	}

	public double getKilometraje() {
		return kilometraje;
	}
	public int getRuedas() {
		return ruedas;
	}
	
}
