package lab2.problema3;

public class LuxuryCategory implements Category
{
	@Override public int getMaxSpeed ()
	{
		return 250;
	}

	@Override public double getPriceCOP (double base)
	{
		return base * 1.5;
	}

	@Override public String getEquipment ()
	{
		return "Air + GPS + Premium design";
	}
}
