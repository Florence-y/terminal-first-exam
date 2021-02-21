package main;

import java.util.Scanner;

import consumer.Common;
import consumer.Person;
import consumer.Vip;
import vendingmachine.Bear;
import vendingmachine.Coco;
import vendingmachine.Drink;
import vendingmachine.Goods;
import vendingmachine.MachineDemo;
import vendingmachine.Pepsi;
import vendingmachine.canDrink;

/**
 * 展示
 * @author WEIR
 *
 */
public class show{
/**
 * 主函数
 * @param args 接收主函数的一个数组
 */
	public static void main(String [] args) {
		
		double  money=0.00;
		int order;
		String idTest=null,like=null,id=null;
		Scanner in=new Scanner(System.in);
		boolean flag=true;
		Order o=new Order();
		 MachineDemo m=new MachineDemo();
		 m. machineInformation() ;
		 System .out.print("你想使用的用户名是：");
		while(flag) {
			String str1="允晴";
			String str2="允晴2号";
			idTest=in.nextLine();
			
			if(str1.equals(idTest)){
				id=idTest;like="Pepsi";
				flag=false;
			}else if(str2.equals(idTest)) {
				like="Coco";id=idTest;
				flag=false;
			}else {
				System .out.println("没有该用户!"); System .out.print("你想使用的用户名是：");
			}
		}
		
		new Option().show();
		while(!flag) {
	/**
	 * 异常处理
	 */
			try {
				order=new Scanner(System.in).nextInt();
			if(order>8) {
					System.out.println("输入错误");new Option().show();continue;
				}else if(order==8) {
					flag=false;break;
				}
			o.run(order,id,money,like);
			id=o.getId();
			like = o.getLike();	
			money=o.getMoney();	
			}catch (Exception e) {
				System .out.println("请输入一个整数！");
				System .out.print("请输入命令：");
			}	
		}		
	}
}
/**
 * 命令
 * @author WEIR
 *
 */
class Order
{
	private int order,order2;
	private String id,like;
	private double money,price,discount;
	private int goodsNum;
	MachineDemo m=new MachineDemo();
/**
 * 用父类Person建立对象	
 */
	Person v=new Vip();
	Person cm=new Common();	
/**
 * 用父类Drink建立对象	
 */
	Drink c=new Coco();
	Drink p1=new Pepsi();
	Drink b=new Bear();
	
	Goods g=new Goods();
	
	Scanner in=new Scanner(System.in);
/**
 * 获取money
 * @param money 钱
 */
	public void setMoney(double money) { 
		this.money=money;
	}
/**
 * 返回money
 * @return
 */
	public double getMoney() {
		return money;
	}
/**
 * 获取id
 * @param id  用户名
 */
	public void setId(String id) {
		this.id=id;
	}
/**
 * 返回id
 * @return
 */
	public String getId() {
		return id;
	}
/**
 * 获取like
 * @param like  喜欢的饮料
 */
	public void setLike(String like) {
		this.like=like;
	}
/**
 * 返回like
 * @return
 */
	public String getLike() {
		return like;
	}
	canDrink canDrink;
/**
 * 打印广告的接口	
 */
	public void Printf() {
		canDrink.printf();
	}
/**
 * 百事接口
 */
	canDrink pp=new Pepsi();
/**
 * 可口接口
 */
	canDrink pc=new Coco(); 
/**
 * 啤酒接口
 */
	canDrink pb=new Bear();
	
/**
 * 运行命令
 * @param order  命令
 * @param id   用户名
 * @param money 钱
 * @param like 喜欢的饮料
 */
	public void run(int order ,String id,double money,String like)
	{	
	
		switch(order) {
		case 1:{	m.machineInformation();
					setId(id);setLike(like);
					System .out.println("当前的用户是："+id);
					setMoney(money);
					System .out.println("当前的余额是："+new java.text.DecimalFormat("0.00").format(money)+"￥");
					new Option().show();
					break;
		}
		case 2:{	System .out.print("充值金额：");
					money+=in.nextInt();
					setId(id);setLike(like);
					if(money>0&&money<=100) {
						setMoney(money);
						System .out.println("充值成功");
					}else if(money<0)
						System .out.println("充值失败");
					else if(money>100)
						System .out.println("数值太大，充值失败");
					 new Option().show();
					 break;
		}
		case 3:{	
					
					setId(id);
					idDiffent(id);
					if(money<price) {System .out.println("金额不足");new Option().show();break;}
					setLike(like);
					if(like.equals("Pepsi")||like.equals("Bear")||like.equals("Coco")) {
					   System .out.print("恭喜你成功购买了"+like+" 此次的折扣是"+discount+"折");
					   System .out.println("原价："+price+"折后价："+new java.text.DecimalFormat("0.00").format(price*discount*0.1));
						setMoney(money-price*discount*0.1);
					  if(id.equals("允晴")) {
						  m.sell(1);pp.printf();
					  }
					  else {
					    	m.sell(2);pc.printf();
					  }
					  money-=(price*discount*0.1);
					}else
						System .out.println("没有这种饮料");
					new Option().show();
					break;
		}
		case 4:{m.fill();	
				g.setAmount();
				setId(id);
				System .out.println("货架填充完成");
				new Option().show();break;
		}
		case 5:{ System .out.print("你想使用的用户名是：");
				String str1="允晴";
				String str2="允晴2号";
				id=in.nextLine();
				if(id.equals(str1)||id.equals(str2)) {
					setId(id);
				}else {
					System .out.println("没有该用户!");
				}
				new Option().show();
				break;
		}
		case 6:{
				setId(id);
				System .out.println(id+"  喜欢的饮料是：");
				like=in.nextLine();
				setLike(like);
				new Option().show();
				break;
		}
		case 7:{
			setId(id);
			idDiffent(id);
			System .out.println("请输入货架编号：");
			order2=in.nextInt();
			m.sell(order2);
			goodsNum=order2;
			price=getPrice(order2);
			String drinkkind=getDrink(order2);
			System .out.print("恭喜你成功购买了"+drinkkind+" 此次的这款为："+discount+"折");
			System .out.println("原价："+getPrice(goodsNum)+"折后价："+price*discount*0.1);
			
/**
 * 打印广告语
 */
			if(goodsNum==1||goodsNum==6)             pp.printf();
			if(goodsNum==3)                          pb.printf();
			if(goodsNum==2||goodsNum==4||goodsNum==5)pc.printf();
			
			setMoney(money-price*discount*0.1);
			new Option().show();
			break;
		}
		}
	}
/**
 * 获取价格
 * @param goodsNum  货架编号
 * @return 返回对应的饮料价格
 */
public double getPrice (int goodsNum){
		if(goodsNum==1||goodsNum==6)
			return 3.0;
		else if(goodsNum==3)
			return 5.0;
		else if(goodsNum==2||goodsNum==4||goodsNum==5)
			return 3.5;
		else 
			return 0.0;
	}
/**
 * 按货架编号找到对应得饮料
 * @param goodsNum  货架编号
 * @return  返回饮料名称
 */
public String getDrink (int goodsNum){
	if(goodsNum==1||goodsNum==6)
		return "Pepsi";
	else if(goodsNum==3)
		return "Bear";
	else if(goodsNum==2||goodsNum==4||goodsNum==5)
		return "Coco";
	else 
		return null;
}
/**
 * 根据id不同有不同的操作
 * @param id  用户名
 */
public void idDiffent(String id) {
	if(id.equals("允晴")) {
		discount=v.getDiscount();g.changeAmount(1);price=getPrice(1);like="Pepsi";
	}
	if(id.equals("允晴2号")) {
		discount=cm.getDiscount();g.changeAmount(2);price=getPrice(2);like="Coco";
	}		
	}
}