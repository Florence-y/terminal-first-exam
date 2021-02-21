package domain;



import java.util.Scanner;



import service.*;
import view.View;

public class Main {
	public static void main(String[] args) {
		Machine marchine=Machine.getMachine();
		Scanner scan=new Scanner(System.in);
		UserManager userManager=UserManager.getManager();
		boolean loopFlag=true;
		while(loopFlag) {
			try {
				System.out.println("默认用户为：root    密码：0000");
				int isLogFlag=userManager.logIn();
				if (isLogFlag!=-1) {
					System.out.println("登入成功...");
					EnterToContinue("按回车键继续...");
					View.printList(marchine.getShelfs());
				}else {
					System.out.println("登录失败，请重试");
				}
				while(isLogFlag!=-1) {
					System.out.println("\n\n");
					View.printOptionOfControl();
					int option=Input.inputInt(1,8);
					switch(option) {
					case 1:
						View.printList(marchine.getShelfs());
						break;
					case 2:
						userManager.buyDesireDrink();
						EnterToContinue("按回车键继续...");
						break;
					case 3:
						System.out.print("请输入货架号：");
						int numOfBuy=Input.inputInt(1, 6);
						userManager.buyChoiceDrink(numOfBuy-1);
						EnterToContinue("按回车键继续...");
						break;
					case 4:
						marchine.addShelfDrink();
						EnterToContinue("按回车键继续...");
						break;
					case 5:
						userManager.addMoney();
						EnterToContinue("按回车键继续...");
						break;
					case 6:
						userManager.setUserDesireDrink();
						EnterToContinue("按回车键继续...");
						break;
					case 7:
						View.printUserSetting();
						int userSettingOption=Input.inputInt(1,4);
						switch (userSettingOption) {
						case 1:
							userManager.changeUser();
							EnterToContinue("按回车键继续...");
							break;
						case 2:
							userManager.addUser();
							EnterToContinue("按回车键继续...");
							break;
						case 3:
							isLogFlag=-1;
							EnterToContinue("按回车键继续...");
							break;
						case 4: 
							userManager.deleteUser();
							EnterToContinue("按回车键继续...");
							break;
						}
						break;
					case 8:
						isLogFlag=-1;
						loopFlag=false;
						EnterToContinue("按回车键确认退出...");
						System.out.println("售货机已上锁，人机分离10米后原地爆炸，请尽快撤离，注意安全");
						break;
					}
				}				
			} catch (Exception e) {
				System.out.println("售货机发生故障，正在重启");
				EnterToContinue("按回车键继续...");
			}
		}
	}
	
	public static void EnterToContinue(String str) {
		System.out.println(str);
		try {
	        System.in.read();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}
