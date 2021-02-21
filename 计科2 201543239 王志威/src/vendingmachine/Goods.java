package vendingmachine;

/**
 * 货架
 */
public class Goods {
	
	private int pepsiAmount1=10,cocoAmount2=10,bearAmount3=10,cocoAmount4=10,cocoAmount5=10,pepsiAmount6=10;
/**
 * 填充货架
 */
	public void setAmount() {
		this.pepsiAmount1=10;this.cocoAmount2=10;this.bearAmount3=10;this.cocoAmount4=10;this.cocoAmount5=10;this.pepsiAmount6=10;
	}
/**
 * 拿出一瓶饮料
 * @param order2 货架编号
 */
	public void changeAmount(int order2) {
			switch(order2){
			case 0:break;
			case 1: pepsiAmount1--;break;
			case 2: cocoAmount2--; break;
			case 3: bearAmount3--; break;
			case 4: cocoAmount4--; break;
			case 5: cocoAmount5--; break;
			case 6: pepsiAmount6--;break;
			}
	}
/**
 * 展示饮料数量		
 */
	public void showAmount() {
				System .out.println(pepsiAmount1+"           "+cocoAmount2+"          "+bearAmount3+"          "+cocoAmount4+"          "+cocoAmount5+"          "+pepsiAmount6);
				System .out.println("");
				for(int i=0;i<7;i++) {
				System .out.print("===============");
			}
			System .out.println("");
		}			
}