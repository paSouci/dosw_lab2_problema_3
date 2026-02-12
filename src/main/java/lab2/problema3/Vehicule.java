package lab2.problema3;

public abstract class Vehicule
{
	protected String name;
	protected double basePrice;
	protected Category cat;

	public Vehicule (String name, double basePrice, Category cat)
	{
		this.name = name;
		this.basePrice = basePrice;
		this.cat = cat;
	}

	public double calculatePrice ()
	{
		return cat.getPriceCOP(basePrice);
	}

	public void showInfo (int number)
	{
		System.out.println("Vehiculo " + number + ":");
		System.out.println("Tipo: " + name);
		System.out.println("Velocidad maxima: " + cat.getMaxSpeed() + " km/h");
		System.out.println("Precio: $" + calculatePrice());
		System.out.println("Equipo: " + cat.getEquipment());
		System.out.println();
	}
}
