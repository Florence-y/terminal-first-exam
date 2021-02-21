package domain.user;

import domain.drink.Drink;

public abstract class User {
	protected String name;
	protected String id;
	protected double money;
	protected Drink desireDrink;
	protected String password;
	private static int countOfId=10002;
	private String userType;
	/**
	 * 
	 */
	public User() { 
		super();
	}
	/**
	 * @param name
	 * @param id
	 * @param money
	 * @param desireDrink
	 */
	public User(String name, String id, String password,double money, Drink desireDrink,String userType) {
		super();
		this.name = name;
		this.id = id;
		this.password=password;
		this.money = money;
		this.desireDrink = desireDrink;
		this.userType=userType;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	/**
	 * @return the desireDrink
	 */
	public Drink getDesireDrink() {
		return desireDrink;
	}
	/**
	 * @param desireDrink the desireDrink to set
	 */
	public void setDesireDrink(Drink desireDrink) {
		this.desireDrink = desireDrink;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	public String getUserType() {
		return userType;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void addCountOfId() {
		countOfId++;
	}
	public static int getCoutnOfId() {
		return countOfId;
	}
	
	
	public abstract void buyAndGetDiscount(int shelfId);
	public abstract void addMoney(double money);
}
