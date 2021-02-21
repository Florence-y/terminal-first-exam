package consumer;

import java.util.Scanner;

/**
 * 会员消费者
 * @author WEIR
 */
public  class Vip extends Person 
{
	Scanner in=new Scanner(System.in);
/**
 * 获取money
 * @param money 钱
 */
	public void setMoney(double money) {
		this.money=0.00;
	}
/**
 * 返回money
 * @return 返回钱
 */
	public double getMoney(){
		return money;
	}
/**
 * 获取姓名
 * @param name  消费者名字
 */
	public void setMoney(String name) {
		this.name=name;
	}
/**
 * 返回姓名
 * @return 返回名字
 */
	public String getName(){
		return name;
	}
/**
 * 返回喜欢的饮料
 * @return  返回喜欢的饮料
 */
	public String getPrice() {
		return like;
	}
/**
 * 获取折扣
 */
	public double getDiscount() {
			return 6.0;
	}
}


