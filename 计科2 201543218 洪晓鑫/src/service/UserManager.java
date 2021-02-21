package service;


import java.util.*;

import domain.Machine;
import domain.drink.*;
import domain.user.*;
import view.View;

public class UserManager {
	private static final int MAX_USER=4;
	private static User[] users=new User[MAX_USER];
	private static User currentUser=new Root("root", "10001", "0000", 99999, new Mizone(5.0,"Mizone",600),"root");
	private static int countOfUser=1;
	
	
	/**
	 * 
	 */
	private UserManager() {
		super();
		users[0]=currentUser;
	}
	private static UserManager userManager=new UserManager();
	public static UserManager getManager() {
		return userManager;
	}
	
	
	/**
	 * @return the countOfUser
	 */
	public static int getCountOfUser() {
		return countOfUser;
	}


	/**
	 * @return the currentUser
	 */
	public static User getCurrentUser() {
		return currentUser;
	}


	public void addUser() {
		if(countOfUser>=MAX_USER) {
			System.out.println("Sorry,当前用户数量已到达最大用户数");
			return;
		}
		View.printTpyeOfUser();
		System.out.print("请选择用户类型：");
		int option=Input.inputInt(1,3);
		
		boolean isSameName=false;
		String newUserName;
		do {
			System.out.print("请输入用户名：");
			newUserName=Input.inputString();
			int i = 0;
			for (; i < countOfUser; i++) {
				if(newUserName.equals(users[i].getName())) {
					isSameName=true;
					System.out.println("该用户名已被使用，请重试");
					break;
				}
			}
			if(i==countOfUser) {
				isSameName=false;
			}
		} while (isSameName);
		
		String newUserId=String.valueOf(User.getCoutnOfId());
		User.addCountOfId();
		
		System.out.print("请输入密码：");
		String newUserPassword=Input.inputString();
		
		int newUserMoney=(int)(Math.random()*10)+1;
		
		View.printTpyeOfDrink();
		Drink newUserDesireDrink=Input.inputDrink();
		
		if(option==1) {
			users[countOfUser]=new GeneralUser(newUserName,newUserId,newUserPassword,newUserMoney,newUserDesireDrink,"普通用户");
		}else if(option==2) {
			users[countOfUser]=new VIP(newUserName,newUserId,newUserPassword,newUserMoney,newUserDesireDrink,"VIP");
		}else if(option==3) {
			users[countOfUser]=new SVIP(newUserName,newUserId,newUserPassword,newUserMoney,newUserDesireDrink,"SVIP");
		}
		System.out.println("用户创建成功，您的用户ID为："+users[countOfUser].getId());
		countOfUser++;
		
	}
	
	public int logIn() {
		System.out.print("请输入用户名或用户ID：");
		String logNameOrId=Input.inputString();
		return logInCheck(logNameOrId);
	}
	
	public int logInCheck(String LogNameOrId) {
		for (int i = 0; i < countOfUser; i++) {
			if(LogNameOrId.equals(users[i].getName()) || LogNameOrId.equals(users[i].getId())) {
				System.out.print("请输入密码:");
				String password=Input.inputString();
				if(password.equals(users[i].getPassword())) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public void changeUser() {
		if(countOfUser<=1) {
			System.out.println("Sorry,当前只有一个用户，请先创建用户");
			return;
		}
		int result=logIn();
		if(result!=-1) {
			currentUser=users[result];
			System.out.println("用户切换成功");
		}
	}
	
	public void deleteUser() {
		int delete=logIn();
		if(delete!=-1&&delete!=0) {
			if(users[delete]!=currentUser) {
				for (int i = delete; i < countOfUser-1; i++) {
					users[i]=users[i+1];
				}
				users[countOfUser-1]=null;
				countOfUser--;
				System.out.println("用户开除成功,该用户睡觉去了");	
			}else {
				System.out.println("删除失败，不予许删除当前账户，请先切换账户");
			}
		}else if(delete!=-1&&delete==0) {
			System.out.println("删除失败，该用户为默认用户");
		}else {
			System.out.println("删除失败");
		}
	}
	
	public void setUserDesireDrink() {
		View.printTpyeOfDrink();
		Drink drink=Input.inputDrink();
		currentUser.setDesireDrink(drink);
	}
	
	public void addMoney() {
		View.printAddMoney();
		int numOfMoneyOption=Input.inputInt(1, 4);
		switch(numOfMoneyOption) {
		case 1:
			currentUser.addMoney(1);
			break;
		case 2:
			currentUser.addMoney(2);
			break;
		case 3:
			currentUser.addMoney(3);
			break;
		case 4:
			currentUser.addMoney(10);
			break;
		case 5:
			System.out.print("请输入充值金额：");
			int addMoney=Input.inputDouble(0, 100000000);
			if(addMoney>10) {
				System.out.println("不好意思，不可以充这么多");
			}else {
				currentUser.setMoney(currentUser.getMoney()+addMoney);
			}
			break;
		}
	}
	
	public void buyChoiceDrink(int shelfId) {
		if("10001".equals(currentUser.getId())) {
			System.out.println("默认用户没有购买权限，请先创建用户");
			return;
		}
		Machine machine=Machine.getMachine();
		currentUser.buyAndGetDiscount(shelfId);
	}
	
	public void buyDesireDrink() {
		Machine machine=Machine.getMachine();
		
		for (int i = 0; i < machine.getCountOfshelf(); i++) {
			if(machine.getShelfs()[i].getDrinkType().getType().equals(currentUser.getDesireDrink().getType())) {
				if(machine.getShelfs()[i].getLeft()>0) {
					buyChoiceDrink(i);
					return;
				}
			}
		}
		System.out.println("购买失败，没有想要的饮料");
	}
	
	
}
