package consumer;

/**
 * 消费者
 * @author WEIR
 *
 */
public abstract class Person{
/**
 * 消费者名字
 */
	protected String name;
/**
 * 钱
 */
	protected double money=0.00;
/**
 * 用户名
 */
	public String id;
/**
 * 喜欢的饮料
 */
	protected String like;
/**
 * 折扣
 */
	double discount;
	
/**
 * 获取折扣的抽象方法
 * @return 返回对应消费者的折扣
 */
	public abstract double getDiscount();	
}
