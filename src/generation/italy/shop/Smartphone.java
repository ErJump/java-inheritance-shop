package generation.italy.shop;

public class Smartphone extends Prodotto{
	private int imeiCode;
	private int storage;
	
	Smartphone(int code, String name, String brand, double price, int iva, int imeiCode, int storage){
		super(code, name, brand, price, iva);
		this.imeiCode = imeiCode;
		this.storage = storage;
	}

	public int getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(int imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nIMEI Code: " + getImeiCode()
				+ "\nstorage: " + getStorage() + " GB";
	}
}
