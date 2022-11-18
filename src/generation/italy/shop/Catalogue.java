package generation.italy.shop;

import java.util.Scanner;

public class Catalogue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prodotto[] catalogue = new Prodotto[3];
		
		for (int i = 0; i < catalogue.length; i++) {
			System.out.println("digitare tipo prodotto: ");
			String category = sc.next().toLowerCase();
			
            System.out.println("digitare codice prodotto: ");
            int code = sc.nextInt();
            
            System.out.println("digitare nome prodotto: ");
            String name = sc.next();
            
            System.out.println("digitare marca prodotto: ");
            String brand = sc.next();
            
            System.out.println("digitare prezzo prodotto: ");
            double price = sc.nextDouble();
            
            System.out.println("digitare iva prodotto: ");
            int iva = sc.nextInt();
			
            if (category.equals("smartphone")) {
            	
                System.out.println("digitare codice imei prodotto: ");
                String imeiCode = sc.next();
                
                System.out.println("digitare memoria prodotto: ");
                int storage = sc.nextInt();
                
                catalogue[i] = new Smartphone(code, name, brand, price, iva, imeiCode, storage);                
            } else if (category.equals("tv")) {
            	
                System.out.println("digitare pollici prodotto: ");
                int tvInches = sc.nextInt();
                
                System.out.println("indicare se il prodotto è smart: ");
                boolean smart = sc.nextBoolean();
                
                catalogue[i] = new Television(code, name, brand, price, iva, tvInches, smart);
            } else if (category.equals("cuffie")){
            	
                System.out.println("digitare colore prodotto: ");
                String color = sc.next();
                
                System.out.println("indicare se il prodotto è wireless: ");
                boolean wireless = sc.nextBoolean();
                
                catalogue[i] = new Headphones(code, name, brand, price, iva, color, wireless);
            }
			
		}
		
		sc.close();
		
		System.out.println("Catalogo: ");
		for (int i = 0; i < catalogue.length; i++) {
			System.out.println(catalogue[i]);
			System.out.println("---");
		}
	}
}
