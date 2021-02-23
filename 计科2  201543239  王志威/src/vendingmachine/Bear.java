package vendingmachine;

/**
 * 啤酒
 * @author WEIR
 *
 */
public class Bear extends Drink implements canDrink  
{
/**
 * 打印啤酒的广告
 */
	public  void printf() {
		System .out.println("广告语：我有故事，你有酒吗？");
	}
}