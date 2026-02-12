package lab2.problema3;

public class VehiculeFactory
{
	public static Vehicule createVehicule (String type, Category cat)
	{
		switch (type.toLowerCase())
		{
			case "carro": return new LandVehicule("Carro", 30000000, cat);
			case "motocicleta": return new LandVehicule("Motocicleta", 15000000, cat);
			case "avion": return new AirVehicule("Avion", 200000000, cat);
			case "bote": return new WaterVehicule("Bote", 80000000, cat);
			default: return new WaterVehicule("Boat", -1, cat);
		}
	}
}
