package vehiculos;
import sistemaGaraje.Garaje;
public class Cliente {

	private String nombre;
	private String apellido;
	private long dni;
	private long telefono;
	private Direccion direccion;
	private double precioArreglo;
	
	public Cliente (String nom, String ape, long du, long tel, Direccion dir) {
		nombre= nom;
		apellido = ape;
		dni = du;
		telefono = tel;
		direccion = dir;
	}
	public double solicitarPresupuesto(Auto wheel, Garaje price) {
		precioArreglo = wheel.getRuedas() * price.getPrecioRueda();
		System.out.println("El presupuesto del arreglo de las ruedas del auto es: " + precioArreglo);
		return precioArreglo;
	}
	public double solicitarPresupuesto(Moto wheel, Garaje price) {
		precioArreglo = wheel.getRuedas() * price.getPrecioRueda();
		System.out.println("El presupuesto del arreglo de las ruedas de la moto es: " + precioArreglo);
		return precioArreglo;
	}
	@Override
	public String toString() {
		return "\nCliente \nnombre: " + nombre + "\napellido: " + apellido + "\ndni: " + dni + "\ntelefono: " + telefono
				+ "\ndireccion: " + direccion;
	}
}
