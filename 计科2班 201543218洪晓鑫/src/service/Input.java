package service;

import java.util.Scanner;

import domain.drink.*;

public class Input {
	static Scanner scan=new Scanner(System.in);
	public static int inputInt(int start,int end) {
		int number=scan.nextInt();
		return number;
	}
	public static String inputString() {
		String str=scan.next();
		return str;
	}
	public static int inputDouble(int start,int end) {
		int number=scan.nextInt();
		return number;
	}
	public static Drink inputDrink() {
		int numOfDrinkOption=inputInt(1,3);
		Drink drink = null;
		if(numOfDrinkOption==1) {
			drink=new Coco(2.5, "Coco", 300);
		}else if(numOfDrinkOption==2) {
			drink=new Mizone(5.0,"Mizone",600);
		}else if(numOfDrinkOption==3) {
			drink=new Pepsi(8.0,"Pepsi",1000);
		}else {
			
		}
		return drink;
	}
}
