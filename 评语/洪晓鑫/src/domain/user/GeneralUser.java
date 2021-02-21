package domain.user;

import domain.Machine;
import domain.drink.Drink;
import service.UserManager;

public class GeneralUser extends User{
	private double discount=1;

	/**
	 * 
	 */
	public GeneralUser() {
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
	public GeneralUser(String name, String id, String password, double money, Drink desireDrink,String userType) {
		super(name, id, password, money, desireDrink,userType);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void addMoney(double addMoney) {
		money+=addMoney;
		System.out.println("充值成功...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyAndGetDiscount(int shelfId) {
		// TODO Auto-generated method stub
		Machine machine=Machine.getMachine();
		User user=UserManager.getCurrentUser();
		if(user.getMoney()<machine.getShelfs()[shelfId].getDrinkType().getPrice()*discount) {
			System.out.println("购买失败，余额不足");
		}else {
			machine.getShelfs()[shelfId].sellDrink();
			user.setMoney(user.getMoney()-machine.getShelfs()[shelfId].getDrinkType().getPrice()*discount);
			System.out.println("成功买入"+machine.getShelfs()[shelfId].getDrinkType().getType());
			machine.getShelfs()[shelfId].getDrinkType().doAdvertise();
		}
	}

}
