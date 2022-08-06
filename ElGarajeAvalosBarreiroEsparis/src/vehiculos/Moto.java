package vehiculos;
public class Moto extends Vehiculo{

	private int cilindradas;

	public Moto(String marca, Cliente dueño, double kilometraje, int ruedas, int cilindradas) {
		super(marca, dueño, kilometraje, ruedas);
		this.cilindradas = cilindradas;
	}
	
	
	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", toString()=" + super.toString() + "]";
	}


	public double getKilometraje() {
		return kilometraje;
	}
	public int getRuedas() {
		return ruedas;
	}

}
