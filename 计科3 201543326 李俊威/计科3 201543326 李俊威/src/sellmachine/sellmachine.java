package sellmachine;
import java.util.*;
import java.util.Scanner;
public class sellmachine extends Thread{
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("可登录成功的用户名:乔默月 奥特曼");
        System.out.println("-----------------------------------------------------");

        System.out.println("欢迎使用心灵感应饮料自动售卖机！！！");
        System.out.println("当前售卖机情况:");
        shelve.show1();
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的用户名:");
        String userName;
        userName = in.nextLine();
        Client user = new Customer();
        while (!userName.equals("乔默月")&!userName.equals("奥特曼")) {
            System.out.println("登录失败");
            System.out.print("请输入您的用户名:");  // 乔默月 和 奥特曼 是已经录进去的用户名
            userName = in.nextLine();
        }
        user.customer(userName);
        Myfactory factory = new Myfactory();
        String drink1 = user.drink;
        Drink mydrink = factory.CreateDrink(drink1);
        System.out.println("请稍后..... 正在登录");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("登录失败！");
        }
        user.customerData(userName);
        mydrink.Data();
        do {
            System.out.println("菜单: 1.自动购买您想要的饮料 2.出售饮料 3.展示售货机当前信息 4.填充货架 5.充值金钱 6.退出");
            System.out.print("请选择你想要的操作:");
            Scanner in1 = new Scanner(System.in);
            choice = in1.nextInt();
            switch (choice) {
                case 3:
                    shelve.show1();
                    break;
                case 4:
                    shelve.addDrink();
                    break;
                case 1:
                    System.out.println("检测到您心仪的饮料为 "+user.drink);
                    if (user.money >= (double)mydrink.drinkPrice) {
                        System.out.println("请稍等,您心仪的饮料正在路上！！！");
                        try {
                            sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("购买失败！");
                        }
                        System.out.println("购买成功!");
                        user.discount(mydrink.drinkPrice);

                        System.out.println("剩余金额:" + user.money);
                        int num1 = shelve.numDrink(user.drink);
                        shelve.buyDrink(num1, 1);
                        user.drinkdrink(mydrink);   //喝饮料
                    } else if (user.money < (double)mydrink.drinkPrice) {
                        do {
                            System.out.println("对不起,您的余额不足,请充值----------");
                            System.out.print("充值金额:");
                            int addMoney1 = in.nextInt();
                            user.addMoney(addMoney1);
                            System.out.println("充值成功！0.0");
                            System.out.println("余额:" + user.money);
                            user.discount(mydrink.drinkPrice);
                        } while (user.money < (double)mydrink.drinkPrice);
                        System.out.println("请稍等,您心仪的饮料正在路上！！！");
                        try {
                            sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("购买失败！");
                        }
                        System.out.println("购买成功!");
                        System.out.println("余额:" + user.money);
                        int num2 = shelve.numDrink(user.drink);
                        shelve.buyDrink(num2, 1);
                        user.drinkdrink(mydrink);

                    }
                    break;
                case 2:
                    shelve.show1();
                    System.out.print("请输入您想要的饮料编号:");
                    Map<Integer, String> hm = new HashMap<Integer, String>();
                    hm.put(1, "Coffee");
                    hm.put(2, "Milk");
                    hm.put(3, "Coco");
                    hm.put(4, "Pepsi");
                    hm.put(5, "Bear");
                    Scanner in2 = new Scanner(System.in);
                    int choice2;
                    choice2 = in2.nextInt();
                    Drink mydrink1 = factory.CreateDrink(hm.get(choice2));
                    System.out.println("您选择了" + hm.get(choice2));
                    mydrink1.Data();
                    System.out.print("数量:");
                    int num4;
                    num4 = in2.nextInt();
                    int num3 = shelve.numDrink(hm.get(choice2));
                    if (user.money >= (double)(mydrink1.drinkPrice * num4)) {
                        System.out.println("购买成功!");
                        user.discount(mydrink1.drinkPrice * num4);
                        System.out.println("剩余金额:" + user.money);
                        shelve.buyDrink(num3, num4);
                        user.drinkdrink(mydrink1);
                    }
                    else if (user.money < (double)(mydrink1.drinkPrice * num4)){
                        do {
                            System.out.println("对不起,您的余额不足,请充值----------");
                            System.out.print("充值金额:");
                            int addMoney2 = in.nextInt();
                            user.addMoney(addMoney2);
                            System.out.println("充值成功！0.0");
                            System.out.println("余额:" + user.money);

                        } while (user.money < (double)(mydrink1.drinkPrice * num4));
                        try {
                            sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("购买失败！");
                        }
                        System.out.println("购买成功!");
                        user.discount((double)(mydrink1.drinkPrice * num4));
                        System.out.println("余额:" + user.money);
                        shelve.buyDrink(num3, num4);
                        user.drinkdrink(mydrink1);
                    }
                    break;
                case 5:
                    System.out.print("请输入您想要充值的金额:");
                    int add=0;
                    add=in.nextInt();
                    user.addMoney(add);
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {}
                    System.out.println("充值成功！");
                    System.out.print("您的余额:"+user.money);
                    System.out.println();

                    }
            }
            while (choice != 6) ;
            System.out.println("感谢您的使用！欢迎下次光临！");
        }
}


