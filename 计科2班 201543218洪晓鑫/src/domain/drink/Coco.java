package domain.drink;

public class Coco extends Drink {

	public Coco() {
		super();
	}
	
	/**
	 * @param price
	 * @param type
	 * @param volume
	 */
	public Coco(double price, String type, int volume) {
		super(price, type, volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAdvertise() {
		// TODO Auto-generated method stub
		System.out.println("广告位招租：201543218");
	}

}
