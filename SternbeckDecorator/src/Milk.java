
public class Milk extends CondimentDecorator{

	private Beverage wrapped;
	
	public Milk(Beverage beverage){
		wrapped = beverage;
		description = "Frische Vollmilch " +wrapped.getDescription();
	}
	
	public float cost(){
		return (0.5f+wrapped.cost());
	}
	public String getDescription(){
		return description;
	}
}
