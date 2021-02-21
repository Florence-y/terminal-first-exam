package vendingmachine;
/**
饮料（抽象父类）
 */
public abstract class Drink
{
/**
 * @param pepsiPrice 百事可乐价格
 *  @param cocoPrice 可口可乐价格
 *   @param bearPrice 啤酒价格
 */
	private  double pepsiPrice=3.5,cocoPrice=3.0,bearPrice=5.0;
/**
 * @param pepsiVolume百事可乐容量
 *  @param cocoVolume可口可乐容量
 *   @param bearVolume啤酒容量
 */
	private  static int pepsiVolume=200,cocoVolume=300,bearVolume=250;
	private int goodsNum;
/**
 * 打印广告（抽象方法）
 */
	public abstract void printf();
	
}

