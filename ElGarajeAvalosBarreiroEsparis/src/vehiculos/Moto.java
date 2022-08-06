package vehiculos;
public class Moto extends Vehiculo{

	private int cilindradas;

	public Moto(String marca, Cliente due�o, double kilometraje, int ruedas, int cilindradas) {
		super(marca, due�o, kilometraje, ruedas);
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
