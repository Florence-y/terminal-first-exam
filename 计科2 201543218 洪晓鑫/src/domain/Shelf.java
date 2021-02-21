package domain;

import domain.drink.Coco;
import domain.drink.Drink;
import domain.drink.Mizone;
import domain.drink.Pepsi;
import domain.user.User;
import service.UserManager;

public class Shelf {
	private int left;//目前拥有的饮料
	private final static int SEAT=5;//最多可以存放的饮料个数
	private Drink drinkType;//存放的饮料种类
	/**
	 * 
	 */
	public  Shelf() {
		super();
		left=(int)(Math.random()*5)+1; 
		int numOfrandom=(int)(Math.random()*3+1);
		if(numOfrandom==1) {
			drinkType=new Coco(2.5,"Coco",300);
			
		}else if(numOfrandom==2) {
			drinkType=new Mizone(5,"Mizone",600);
		}else {
			drinkType=new Pepsi(8,"Pepsi",1000);
		}
	}
	/**
	 * @return the left
	 */
	public int getLeft() {
		return left; 
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(int left) {
		this.left = left;
	}
	/**
	 * @return the drinkType
	 */
	public Drink getDrinkType() {
		return drinkType;
	}
	/**
	 * @param drinkType the drinkType to set
	 */
	public void setDrinkType(Drink drinkType) {
		this.drinkType = drinkType;
	}
	/**
	 * @return the seat
	 */
	public static int getSeat() {
		return SEAT; 
	}
	
	
	public void addDrink() {
			left=SEAT;		
	}
	
	public void sellDrink() {
		if(left>0) {
			left--;
		}else {
			System.out.println("购买失败，储货不足");
		}
	}
}
