package lab2.problema3;

public class EconomicCategory implements Category
{
	@Override public int getMaxSpeed ()
	{
		return 160;
	}

	@Override public double getPriceCOP (double base)
	{
		return base;
	}

	@Override public String getEquipment ()
	{
		return "Basic";
	}
}
