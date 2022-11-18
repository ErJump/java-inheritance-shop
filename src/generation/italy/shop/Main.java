package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto pr1 = new Prodotto(1, "motosega", "Bosch", 20, 20);
		System.out.println(pr1);
		System.out.println("-----------------");
		
		Smartphone sp1 = new Smartphone(2, "Galaxy 22", "Samsung", 999, 19, "123456789", 256);
		System.out.println(sp1);
		System.out.println("-----------------");

		Television tv1 = new Television(3, "Gigantoschermus", "Sony", 1500, 22, 65, true);
		System.out.println(tv1);
		System.out.println("-----------------");
		
		Headphones hp1 = new Headphones(4, "MK2 Studio", "AIAIAI", 300, 18, "black", false);
		System.out.println(hp1);
	}
}
