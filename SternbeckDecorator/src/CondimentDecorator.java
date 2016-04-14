
public abstract class CondimentDecorator extends Beverage {
	private Beverage wrapped;
	
	public String getDescription(){
		return (this.getDescription()+"+ "+wrapped.getDescription());
	}

}
