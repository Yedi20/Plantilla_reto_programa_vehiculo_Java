package prueba;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo suzuki = new  Vehiculo();
		
		int rango;
		
		suzuki.capacidad =8;
		suzuki.capacidad = 17;
		suzuki.mgp = 23;
		
		rango = suzuki.capacidad * suzuki.mgp;
		
		System.out.println("El suzuki puede llevar " +suzuki.pasajeros+ " Pasajeros con un rango de: "
				+rango+ " Milla ");
		
	}

}
