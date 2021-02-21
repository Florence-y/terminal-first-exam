package view;

import domain.*;
import service.UserManager;


public class View {

	public  static void printList(Shelf[] shelfs) {
		System.out.println("########################自助售货机#####################");
		System.out.println("编号\t1\t2\t3\t4\t5\t6");
		System.out.println("名称\t"+shelfs[0].getDrinkType().getType()+"\t"+shelfs[1].getDrinkType().getType()
				+"\t"+shelfs[2].getDrinkType().getType()+"\t"+shelfs[3].getDrinkType().getType()
				+"\t"+shelfs[4].getDrinkType().getType()+"\t"+shelfs[5].getDrinkType().getType());
		System.out.println("价格\t"+shelfs[0].getDrinkType().getPrice()+"\t"+shelfs[1].getDrinkType().getPrice()
				+"\t"+shelfs[2].getDrinkType().getPrice()+"\t"+shelfs[3].getDrinkType().getPrice()
				+"\t"+shelfs[4].getDrinkType().getPrice()+"\t"+shelfs[5].getDrinkType().getPrice());
		System.out.println("容积\t"+shelfs[0].getDrinkType().getVolume()+"ml\t"+shelfs[1].getDrinkType().getVolume()
				+"ml\t"+shelfs[2].getDrinkType().getVolume()+"ml\t"+shelfs[3].getDrinkType().getVolume()
				+"ml\t"+shelfs[4].getDrinkType().getVolume()+"ml\t"+shelfs[5].getDrinkType().getVolume()+"ml");
		System.out.println("数量\t"+shelfs[0].getLeft()+"\t"+shelfs[1].getLeft()
				+"\t"+shelfs[2].getLeft()+"\t"+shelfs[3].getLeft()
				+"\t"+shelfs[4].getLeft()+"\t"+shelfs[5].getLeft());
		
		System.out.println("#######################################################");
	}
	
	public static void printOptionOfControl() {
		System.out.println("--------------------------------------------控制面板------------------------------------------");
		System.out.println("\t\t\t\t\t[1] 显式饮料机");
		System.out.println("\t\t\t\t\t[2] 购买用户喜欢的饮料");
		System.out.println("\t\t\t\t\t[3] 购买指定货架的饮料");
		System.out.println("\t\t\t\t\t[4] 通知老板填充货架");
		System.out.println("\t\t\t\t\t[5] 充值");
		System.out.println("\t\t\t\t\t[6] 设置用户喜欢的饮料");
		System.out.println("\t\t\t\t\t[7] 用户设置");
		System.out.println("\t\t\t\t\t[8] 退出");
		double UserRemain=UserManager.getManager().getCurrentUser().getMoney();
		System.out.println("-----当前用户:"+UserManager.getManager().getCurrentUser().getName()
				+"   当前用户ID:"+UserManager.getManager().getCurrentUser().getId()
				+"   用户余额:"+String.format("%.2f", UserRemain)
				+"   喜欢的饮料："+UserManager.getManager().getCurrentUser().getDesireDrink().getType()
				+"   用户类型："+UserManager.getManager().getCurrentUser().getUserType()
				+"    当前用户数量:"+UserManager.getManager().getCountOfUser()+"------");
		System.out.print("请选择：");
		
	}
	
	public static void printTpyeOfUser() {
		System.out.println("[1]普通用户");
		System.out.println("[2]VIP");
		System.out.println("[3]SVIP");
	}
	
	public static void printTpyeOfDrink() {
		System.out.println("[1]Coco");
		System.out.println("[2]Mizone");
		System.out.println("[3]Pepsi");
		System.out.print("请输入喜欢的饮料：");
	}
	
	public static void printUserSetting() {
		System.out.println("[1]切换用户");
		System.out.println("[2]创建用户");
		System.out.println("[3]注销用户");
		System.out.println("[4]删除用户");

	}
	
	public static void printAddMoney() {
		System.out.println("[1] 充值1￥");
		System.out.println("[2] 充值2￥");
		System.out.println("[3] 充值5￥");
		System.out.println("[4] 充值10￥");
		System.out.println("[5] 手动输入");
	}
	

	
//	public static void main(String[] args) {
//		printOptionOfControl();
////		printAddMoney();
//	}
}
