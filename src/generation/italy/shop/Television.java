package generation.italy.shop;

public class Television extends Prodotto{
	private int tvInches;
	private boolean smart; 
	
	Television(int code, String name, String brand, double price, int iva, int tvInches, boolean smart){
		super(code, name, brand, price, iva);
		this.tvInches = tvInches;
		this.smart = smart;
	}

	public int getTvInches() {
		return tvInches;
	}

	public void setTvInches(int tvInches) {
		this.tvInches = tvInches;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nScreen size: " + getTvInches()
				+ "''\nsmart tv: " + isSmart();
	}
}
