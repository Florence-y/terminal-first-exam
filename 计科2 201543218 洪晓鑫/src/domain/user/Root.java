package domain.user;

import domain.drink.Drink;

public class Root extends User{

	
	
	
	/**
	 * 
	 */
	public Root() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param id
	 * @param password
	 * @param money
	 * @param desireDrink
	 */
	public Root(String name, String id, String password, double money, Drink desireDrink,String userType) {
		super(name, id, password, money, desireDrink,userType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void addMoney(double money) {
		System.out.println("Sorry，默认用户不予许充值");	
	}

	@Override
	public void buyAndGetDiscount(int shelfId) {
		// TODO Auto-generated method stub
		System.out.println("默认用户不予许购买，请先创建用户");
	}
	

}
