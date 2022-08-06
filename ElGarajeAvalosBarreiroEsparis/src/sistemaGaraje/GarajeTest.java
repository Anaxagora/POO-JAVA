package sistemaGaraje;
import vehiculos.Auto;
import vehiculos.Cliente;
import vehiculos.Direccion;
import vehiculos.Moto;
import vehiculos.Vehiculo;
public class GarajeTest {

	public static void main(String[] args) {
		Garaje g1 = new Garaje(1,2,800);
		Cliente c1 = new Cliente("Nicolas", "Barreiro", 39066032l, 1531780214L, new Direccion ("Baldomero", 3383));
		Moto m1 = new Moto("HONDA", c1, 100.50, 2, 700);
		Auto a1 = new Auto("CITROEN", c1, 100.50, 2, 5);
		
		System.out.println(m1);
		System.out.println("");
		System.out.println(a1);
		


		
	}
}
