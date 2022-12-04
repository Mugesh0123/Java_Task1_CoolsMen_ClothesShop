package coolmens;

public class DressShop {
	
	private String shirts;
	private String pants;
	private int available;
	private int ComboPrice;
	
	public String getShirts() {
		return shirts;
	}
	public void setShirts(String shirts) {
		this.shirts = shirts;
	}
	public String getPants() {
		return pants;
	}
	public void setPants(String pants) {
		this.pants = pants;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getComboPrice() {
		return ComboPrice;
	}
	public void setComboPrice(int comboPrice) {
		ComboPrice = comboPrice;
	}
	public DressShop(String shirts, String pants, int available, int comboPrice) {
		super();
		this.shirts = shirts;
		this.pants = pants;
		this.available = available;
		ComboPrice = comboPrice;
	}
	@Override
	public String toString() {
		return "\n coolmens Shop : \n Shirts : " + shirts + " \n Pants : " + pants + " \n Available : " + available + " \n ComboPrice : "
				+ ComboPrice + "\n";
	}
	
	

}
