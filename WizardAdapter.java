//Adapter Design Pattern Assignment by Jay-Rads Villanueva
public class WizardAdapter implements Warrior
{
	public Wizard wizard;
	public WizardAdapter(Wizard sorcerer)
	{
		wizard=sorcerer;
	}
	public void attack()
	{
		wizard.performSpell();
	}
	public void defend()
	{
		wizard.heal();
	}
}
