package sistemaGaraje;
import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.Vehiculo;
public class Garaje {

	private int ocupacionAuto;
	private int ocupacionMoto;
	private double kmPromedio;
	private int precioRueda;
	private int contador;
	private int contadorM;
	private int totalAutosYMotos;
	
	public Garaje (int ocu, int ocu2, int price) {
		ocupacionAuto = ocu;
		ocupacionMoto = ocu2;
		precioRueda = price;
	}
	public int getPrecioRueda() {
		return precioRueda;
	}
	public void ingresaVehiculo (Vehiculo vehiculo) {
		contador = contador + 1;
		if (contador > ocupacionAuto) {
			System.out.println("SISTEMA DE AVISO: No hay mas espacio para autos");
		contador = contador - 1;
		} else {
			kmPromedio = kmPromedio + vehiculo.getKilometraje();
			System.out.println("Con el ingreso, el total actual de autos es: " + contador);
		}
	}
	public void egresaVehiculo (Auto car) { 
		contador = contador - 1;
		System.out.println("Con el egreso el total de vehiculos es: " + contador);
	}
	public void egresaVehiculo (Moto mbk) { 
		contadorM = contadorM - 1;
		System.out.println("Con el egreso el total de vehiculos es: " + contadorM);
	}
	public int totalVehiculos () {
		totalAutosYMotos = contador + contadorM;
		System.out.println("La cantidad actual de vehiculos en el garaje es: " + totalAutosYMotos);
		return totalAutosYMotos;
	}
	public double obtenerKmMedio() {
		totalAutosYMotos = contador + contadorM;
		kmPromedio=kmPromedio/totalAutosYMotos;
		System.out.println("El kilometraje promedio es: " + kmPromedio);
		return kmPromedio;
	}

	public void obtenerInfoGaraje(Auto a1, Moto m1, Moto m2) {
		System.out.println("El garaje tiene una capacidad total para autos de :" + ocupacionAuto +
				"\nY para motos: " + ocupacionMoto +
				"\nEl precio por rueda es de: " + precioRueda +
				"\nActualmente hay "+contador+" autos y "+contadorM+" motos"+
				"\nEl kilometraje promedio es: "+kmPromedio+
				"\nLos vehiculos ingresados son: \n*****\n" + a1.toString() + "\n*****\n" + m1.toString()+ "\n*****\n" + m2.toString());
	}
}
