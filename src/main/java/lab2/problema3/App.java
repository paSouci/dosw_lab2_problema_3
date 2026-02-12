package lab2.problema3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
	private static void mainTest ()
	{
		Scanner scanner = new Scanner(System.in);
		List<Vehicule> cart = new ArrayList<>();

		String continueOption;
		do {
			System.out.println("Seleccione un tipo de vehiculo (carro, motocicleta, avion, bote): ");
			String type = scanner.nextLine();

			System.out.println("Seleccione una categoria (1 = Economica, 2 = Lujosa, 3 = Usado): ");
			int categoryOption = scanner.nextInt();
			scanner.nextLine();

			Category cat = new EconomicCategory();

			switch (categoryOption) {
				case 1 -> cat = new EconomicCategory();
				case 2 -> cat = new LuxuryCategory();
				case 3 -> cat = new UsedCategory();
			}

			Vehicule vehicle = VehiculeFactory.createVehicule(type, cat);
			cart.add(vehicle);

			System.out.println("Anadir otro vehiculo? (si/no)");
			continueOption = scanner.nextLine();

		} while (continueOption.equalsIgnoreCase("si"));

		System.out.println("\n--- Resumen de compra ---");

		for (int i = 0; i < cart.size(); i++) { cart.get(i).showInfo(i + 1); }
		double total = cart.stream().mapToDouble(Vehicule::calculatePrice).sum();
		System.out.println("Total a pagar: (COP)" + total);
	}

	public static void main(String[] args)
	{
		mainTest();
	}
}
