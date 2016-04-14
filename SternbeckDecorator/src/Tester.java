
public class Tester {

	public static void main(String[] args) {
		Beverage milkdark = new Milk(new DarkRoast());
		System.out.println(milkdark.getDescription());
		System.out.println(milkdark.cost());
		Beverage milknotsodark = new Milk(new Milk(new DarkRoast()));
		System.out.println(milknotsodark.getDescription());
		System.out.println(milknotsodark.cost());

	}

}
