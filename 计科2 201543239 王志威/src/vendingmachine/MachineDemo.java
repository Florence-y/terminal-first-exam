package vendingmachine;

/**
 * 心灵感应售货机
 * @author WEIR
 *
 */
public class MachineDemo 
{
	private static int [] vending= new int [10];
	vendingmachine.Goods g=new vendingmachine.Goods();
/**
 * 售货机信息
 */
	public void machineInformation() {
			for(int i=0;i<7;i++) {
				System .out.print("===============");
			}	
			System .out.println("");
			System .out.println("");
			System .out.print("编号：\t");
			System .out.println("1            2           3           4           5           6");
			System .out.print("名称：\t");
			System .out.println("Pepsi        Coco        Bear        Coco        Coco        Pepsi");
			System .out.print("价格：\t");
			System .out.println("3.5          3.0         5.0         3.0         3.0         3.5");
			System .out.print("容量：\t");
			System .out.println("200ml        300ml       250ml       300ml       300ml       200ml");
			System .out.print("数量：\t");	
			g. showAmount();
	}
/**
 * 填充货架
 */
	public void fill() {
		g.setAmount();
	}
/**
 * 出售饮料
 * @param order2 输入的货架编号
 */
	public void sell(int order2) {
		g. changeAmount(order2);
	}
}

 