
public class CatTest {

	public static void main(String[] args) {
	Car1 car4 = new Car1("Ford", 15000, 1995);
System.out.println(car4.carBrand);
	Car1 car5 = new Car1("Toyota", 22000, 2003);
System.out.println(car5.carBrand);	
	car5.carBrand = "Nissan";
System.out.println(car5.carBrand);
	}

}
