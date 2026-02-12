package lab2.problema3;

public class UsedCategory implements Category
{
	@Override public int getMaxSpeed ()
	{
		return 140;
	}

	@Override public double getPriceCOP (double base)
	{
		return base * 0.7;
	}

	@Override public String getEquipment ()
	{
		return "whatever's left";
	}
}
