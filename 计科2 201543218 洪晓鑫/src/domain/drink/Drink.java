package domain.drink;




public abstract class Drink {
	private double price;
	private String type;
	private int volume;
	
	
	
	/**
	 * 
	 */
	public Drink() {
		super();
	}
	/**
	 * @param price
	 * @param type
	 * @param volume
	 */
	public Drink(double price, String type, int volume) {
		super();
		this.price = price;
		this.type = type;
		this.volume = volume;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	public abstract void doAdvertise();
	
	
}
