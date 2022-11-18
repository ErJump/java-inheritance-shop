package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto pr1 = new Prodotto(1, "motosega", "Bosch", 20, 20);
		System.out.println(pr1);
		System.out.println("-----------------");
		
		Smartphone sp1 = new Smartphone(2, "Galaxy 22", "Samsung", 999, 19, 123456789, 256);
		System.out.println(sp1);
	}
}
