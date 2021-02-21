package domain.drink;

public class Pepsi extends Drink {

	
	
	
	

	/**
	 * 
	 */
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param price
	 * @param type
	 * @param volume
	 */
	public Pepsi(double price, String type, int volume) {
		super(price, type, volume);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void doAdvertise() {
		// TODO Auto-generated method stub
		System.out.println("广告位招租：201543218");
	}



}
