package machine;

import java.util.*;//Scanner输入

public class Machine //主类
{
    public static void main(String[] args)//main方法
    {
    System.out.println("欢迎光临饮料自动售货机！请选择您需要的服务选项");

    Menu choice=new Menu(); //创建menu对象 来使用菜单
    choice.myMenu();//调用
    Scanner reader=new Scanner(System.in);   
    int num;//序号
    num=reader.nextInt();  //输入num序号 字符串转int

    Display dis=new Display(); //创建diaplay对象 来显示选择序号后显示的内容
    dis.myDisplay(num);
    }
}




class Menu   //菜单类
{    				
    public void myMenu()  //方法
  {
    System.out.println("① 购买饮品");
    System.out.println("② 填充饮品");
    System.out.println("③ 退出");
  }
}

class Display  //选择菜单后显示内容 类
{
    public void myDisplay(int num) //方法
  {
    {
    switch(num)
    {
      case 1: //购买
        System.out.println("当前饮品有：");
        Water buy1=new Water();
        buy1.drinkName();
        Orange buy2=new Orange();
        buy2.drinkName();
        Cola buy3=new Cola();
        buy3.drinkName();
        Consume2 result2=new Consume2();//创建 获得消费者各个信息对象
        result2.getConsumer();//调用
        result2.consumerDiscount(); //调用
        //消费者姓名、身份、充值
        System.out.println("欢迎您下次光临！");
        break;

      case 2: //填充
        Water fill1=new Water();
        fill1.amount=10;
        Orange fill2=new Orange();
        fill2.amount=10;
        Cola fill3=new Cola();
        fill3.amount=10;
        System.out.println("填充完成！");
        break;
      case 3: //退出
        System.out.println("欢迎您下次光临！");
        break;
      default:
        System.out.println("输入错误，请重新输入！");      
      }
    }while(num!=3);
  } 
}




//饮料的抽象类（三类：矿泉水、橙汁、可乐）
abstract class Drinks
{
    double price;//价格
    double volume;//容量
    String name;//名字
    public int amount;//数量

    abstract void advertisingLanguage();//广告语抽象方法
    abstract void drinkName();//饮料名字抽象方法
}

//饮料的继承
class Water extends Drinks // 子类 矿泉水
{
    private String name="矿泉水";
    private double volume=500.0;
    private double price=3.0;
    public int amount=10;

    void drinkName() //饮品详情
    {
      System.out.println("1.饮品："+name+"  容量："+volume+"ml  价格：￥"+price+"  剩余"+amount+"瓶");
      
    }
    void advertisingLanguage() //广告语
    {
      System.out.println("给你的肠胃洗个澡！");
    }
}

class Orange extends Drinks // 子类 橙汁
{
    private String name="橙汁";
    private double volume=500.0;
    private double price=5.0;
    public int amount=10;

    void drinkName() //饮品详情
    {
      System.out.println("2.饮品："+name+"  容量："+volume+"ml  价格：￥"+price+"  剩余"+amount+"瓶");
    }
    void advertisingLanguage() //广告语
    {
      System.out.println("一瓶橙汁 十粒橙子！");
    }
}

class Cola extends Drinks // 子类 可乐
{
    private String name="可乐";
    private double volume=400.0;
    private double price=5.0;
    public int amount=10;

    void drinkName() //饮品详情
    {
      System.out.println("3.饮品："+name+"  容量："+volume+"ml  价格：￥"+price+"  剩余"+amount+"瓶");
    }
    void advertisingLanguage() //广告语
    {
      System.out.println("所有男生女生！二氧化碳的快乐来啦！");
    }
}

//消费者姓名、身份、余额、想要购买的饮品 抽象类
abstract class Consumer
{
    public String consumerName;//消费者名字
    public String consumerIdentity;//消费者身份
    public double consumerMoney=0;//消费者余额
    public int consumerWant;//消费者想要的饮品

    abstract void consumerDiscount();//折扣的抽象方法

    abstract void getConsumer(); //抽象方法

}

class Consume2 extends Consumer
{
    public void getConsumer() //实现抽象类中的抽象方法
    {
      System.out.println("请输入您的姓名：");
      Scanner in=new Scanner(System.in);   
      consumerName=in.nextLine();  

      System.out.println("您是否为会员(Yes/No)");
      Scanner into=new Scanner(System.in);   
      consumerIdentity=into.next(); 

      System.out.println("您的余额为￥"+consumerMoney);
      System.out.println("是否需要进行充值（1.need\t 2.not）"); //余额充值
      Scanner read=new Scanner(System.in);   
      int num1;//序号
      num1=read.nextInt(); 
      switch(num1)
      {
      case 1:
        System.out.println("请输入充值钱数：");
        Scanner scan=new Scanner(System.in);   
        double add=scan.nextInt(); 
        consumerMoney=consumerMoney+add;
        System.out.println("充值成功！您的余额为￥"+consumerMoney);
        break;
      case 2:
        break;
      }
    
    System.out.println("您心里想选购的饮品是:(请输入序号)");
    Scanner scanf=new Scanner(System.in);   
    consumerWant=scanf.nextInt(); 
    }
//}

//折扣
    void consumerDiscount() //实现抽象类中的抽象方法
    {
      if(consumerIdentity.equals("Yes" )) //是会员 有折扣
        {
          System.out.println("尊敬的会员，您将享有7折的优惠！");
          if(consumerWant==1)
            {
        	  if(consumerMoney<3.0*0.7)
        		  System.out.println("您的余额不足，无法购买");
        	  else
        	  {
        		  consumerMoney=consumerMoney-3.0*0.7;
                  System.out.println("成功购买矿泉水，您的余额为："+consumerMoney);
                  Water buy4=new Water();
                  buy4.amount=buy4.amount-1;
                  buy4.advertisingLanguage();
        	  }
            
            }
          if(consumerWant==2)
            {
        	  if(consumerMoney<5.0*0.7)
        		  System.out.println("您的余额不足，无法购买");
        	  else
        	  {
        		  consumerMoney=consumerMoney-5.0*0.7;
                  System.out.println("成功购买橙汁，您的余额为："+consumerMoney);
                  Orange buy5=new Orange();
                  buy5.amount=buy5.amount-1;
                  buy5.advertisingLanguage();
        	  }
            }
          if(consumerWant==3)
            {
        	  if(consumerMoney<5.0*0.7)
        		  System.out.println("您的余额不足，无法购买");
        	  else 
        	  {
                  consumerMoney=consumerMoney-5.0*0.7;
                  System.out.println("成功购买可乐，您的余额为："+consumerMoney);
                  Cola buy6=new Cola();
                  buy6.amount=buy6.amount-1;
                  buy6.advertisingLanguage();
        	  }
        	  
            }
        }
    else if(consumerIdentity.equals("No" ))
      {
          System.out.println("尊敬的顾客，您将享有9折的优惠！");
          if(consumerWant==1)
            {
        	  if(consumerMoney<3.0*0.9)
        		  System.out.println("您的余额不足，无法购买");
        	  else
        	  {
                  consumerMoney=consumerMoney-3.0*0.9;
                  System.out.println("成功购买矿泉水，您的余额为："+consumerMoney);
                  Water buy1=new Water();
                  buy1.amount=buy1.amount-1;
                  buy1.advertisingLanguage();
        	  }

            }
          if(consumerWant==2)
            {
        	  if(consumerMoney<5.0*0.9)
        		  System.out.println("您的余额不足，无法购买");
        	  else
        	  {
        	      consumerMoney=consumerMoney-5.0*0.9;
                  System.out.println("成功购买橙汁，您的余额为："+consumerMoney);
                  Orange buy2=new Orange();
                  buy2.amount=buy2.amount-1; 
                  buy2.advertisingLanguage();
        	  }
            }
          if(consumerWant==3)
            {
        	  if(consumerMoney<5.0*0.9)
        		  System.out.println("您的余额不足，无法购买");
        	  else
        	  {
                  consumerMoney=consumerMoney-5.0*0.9;
                  System.out.println("成功购买可乐，您的余额为："+consumerMoney);
                  Cola buy3=new Cola();
                  buy3.amount=buy3.amount-1;
                  buy3.advertisingLanguage();
        	  }
            }
      }
    }
}

