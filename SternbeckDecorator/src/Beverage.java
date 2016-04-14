
public abstract class Beverage {
	protected String description = "StandardBeverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract float cost();

}
