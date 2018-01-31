
public class LaptopTest {

	public static void main(String[] args) {
		
	Laptop1 laptop3 = new Laptop1("Toshiba", "Windows", 2015);
System.out.println(laptop3.LaptopBrand);
System.out.println(laptop3.OperatingSystem);
	Laptop1 laptop4 = new Laptop1("Chrome Book", "Google Chrome's OS", 2018);
System.out.println(laptop4.LaptopBrand);
System.out.println(laptop4.OperatingSystem);
	laptop4.OperatingSystem = "Mac10 OS";
System.out.println(laptop4.OperatingSystem);
	}

}
