import java.io.*;
import java.util.Objects;

public class MainInterface {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws InterruptedException, IOException {

            //创建对象
            SaleMachine machine = new SaleMachine();
            GoodsShelf g = new GoodsShelf();
            OrdinaryConsumer ordinary = new OrdinaryConsumer();
            MemberConsumer member = new MemberConsumer();
            //函数调用显示菜单
            Menu.main();
            while(true){
                //接收用户输入
                String s1 = in.readLine();

                //用户选择支付方式
                //用户选择充值方式1
                switch (s1){
                    case "1"://查看获购买商品
                        machine.showList();//显示商品
                        member.show();//显示当前用户信息(包括喜欢的饮品)
                        //用户选择支付方式
                        System.out.println("亲!请问你是普通用户还是会员用户呢");
                        System.out.println("1.普通用户                           2.会员用户");
                        String s2 = in.readLine();
                        System.out.print("请输入： ");
                        switch(s2){
                            case "1":
                                ordinary.GetDiscount();//调用获取折扣方法
                                System.out.print("尊贵的会员用户，请选择一种你喜欢的饮料:  ");
                                java.util.Scanner i = new java.util.Scanner(System.in);
                                int select1 = i.nextInt();
                                ordinary.pay(select1);//调用支付方法
                                g.take(select1);//调用取货方法,取出饮料
                                machine.sale(select1);//调用出售方法
                                ordinary.drink(Objects.requireNonNull(Menu.print_show(select1)));//，喝饮料，调用广告语
                                ordinary.getList(Objects.requireNonNull(Menu.print_show(select1)));//获取票据
                                machine.showList();//显示剩余商品
                                break;
                            case "2":
                                ordinary.GetDiscount();//调用获取折扣方法
                                System.out.print("尊贵的会员用户，请选择一种你喜欢的饮料:  ");
                                java.util.Scanner j = new java.util.Scanner(System.in);
                                int select2 = j.nextInt();
                                member.pay(select2);//调用支付方法
                                g.take(select2);//调用取货方法,取出饮料
                                machine.sale(select2);//调用出售方法
                                member.drink(Objects.requireNonNull(Menu.print_show(select2)));//喝饮料，调用广告语
                                ordinary.getList(Objects.requireNonNull(Menu.print_show(select2)));//获取票据
                                machine.showList();//显示剩余商品
                                break;
                            default :
                                System.out.println("错误报告！！！");
                                System.out.println("请重新操作");
                                break ;
                        }
                        break;
                    case "2"://填充商品
                        machine.get();//调用获取管理员权限方法
                        break;
                    case "3"://充值
                        //用户选择充值方式
                        System.out.println("亲!请问你是普通用户还是会员用户呢");
                        System.out.println("1.普通用户                           2.会员用户");
                        String s3 = in.readLine();
                        System.out.print("请输入： ");
                        switch(s3){
                            case "1":
                                ordinary.charge();//普通充值
                                break;
                            case "2":
                                member.charge();//会员充值
                                break;
                            default :
                                System.out.println("错误报告！！！");
                                System.out.println("请重新操作");
                                break;

                        }
                        break;
                    case "4"://退出系统
                        System.out.println("你已退出系统！");
                        return ;
                    default :
                        System.out.println("错误报告！！！");
                        System.out.println("请重新操作");
                        break;

                }
                }

            }
        }




