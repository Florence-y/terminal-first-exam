package demo;

import java.util.Scanner;

public class demo_text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shouHuoJi shj=new shouHuoJi();
        shj.zhanShi();

        yinLiao bbaiShi=new baiShi();
        yinLiao xxueBi=new xueBi();
        yinLiao ppiJiu=new piJiu();
        puYong py=new puYong(bbaiShi);
        huiYuan hy=new huiYuan(xxueBi);
        int yonghuleixing;
        System.out.println();
        while(true){
            System.out.println("请输入用户名及密码:");
            String yhm=sc.nextLine();
            String mima=sc.nextLine();
            if(yhm.equals(py.xingMing)&&mima.equals(py.miMa)){
                yonghuleixing =0;
                break;
            }else if(yhm.equals(hy.xingMing)&&mima.equals(hy.miMa)){
                yonghuleixing =1;
                break;
            }else{
                System.out.println("输入错误，请重新输入:");
            }
        }
        if(yonghuleixing==1) {
            System.out.println("登陆成功！");
            while(true) {
                System.out.print("余额:￥");
                System.out.printf("%.2f\n",hy.yuE());
                System.out.println("推荐购买" +hy.xiang.mingCheng);
                System.out.println("请选择业务:");
                System.out.println("1.选择货架购买\n" +
                        "2.充值\n" +
                        "3.补充货物\n" +
                        "0.退出系统");
                int xuanze = sc.nextByte();
                if(xuanze>3||xuanze<0) {
                    System.out.println("您的输入有误，请重新输入.");
                    continue;
                }
                switch(xuanze){
                    case 0:
                        return;
                    case 2:
                        System.out.println("请输入充值金额:");
                        int jine=sc.nextByte();
                        hy.chongZhi(jine);
                        System.out.print("充值成功，余额:￥");
                        System.out.printf("%.2f\n",hy.yuE());
                        System.out.println("按回车键继续.");
                        sc.nextLine();
                        sc.nextLine();
                        break;
                    case 3:
                        shj.buHuo();
                        System.out.println("补充成功！");
                        shj.zhanShi();
                        System.out.println();
//                        System.out.println("按回车键继续.");
//                        sc.nextLine();
//                        sc.nextLine();
                        break;
                    case 1:
                        System.out.println("请选择货架:");
                        int xuanZeHuoJia=sc.nextByte();
                        if(shj.huoQuShuMu(xuanZeHuoJia)==0){
                            System.out.println("该货架空了，请补充货架.");
                            break;
                        }
                        System.out.println("您是会员用户，购买有八折优惠。");
                        double huafei=hy.huoQuZheKou()*shj.yinLiaoJiaGe(xuanZeHuoJia);
                        System.out.print("购买"+
                                shj.yinLiaoMing(xuanZeHuoJia)+
                                "花费￥");
                        System.out.printf("%.2f\n",huafei);

                        hy.huaQian(hy.huoQuZheKou()*shj.yinLiaoJiaGe(xuanZeHuoJia));
                        System.out.print("余额:￥");
                        System.out.printf("%.2f\n",hy.yuE());
                        shj.naChuYinLiao(xuanZeHuoJia);
                        System.out.println("按回车键继续.");
                        sc.nextLine();
                        sc.nextLine();
                        break;
                }
                shj.zhanShi();
                System.out.println();
            }
        }else{
            System.out.println("登陆成功！");
            while(true) {
                System.out.print("余额:￥");
                System.out.printf("%.2f\n",py.yuE());
                System.out.println("推荐购买" +py.xiang.mingCheng);
                System.out.println("请选择业务:");
                System.out.println("1.选择货架购买\n" +
                        "2.充值\n" +
                        "3.补充货物\n" +
                        "0.退出系统");
                int xuanze = sc.nextByte();
                if(xuanze>3||xuanze<0) {
                    System.out.println("您的输入有误，请重新输入.");
                    continue;
                }
                switch(xuanze){
                    case 0:
                        return;
                    case 2:
                        System.out.println("请输入充值金额:");
                        int jine=sc.nextByte();
                        py.chongZhi(jine);
                        System.out.print("充值成功，余额:￥");
                        System.out.printf("%.2f\n",py.yuE());
                        System.out.println("按回车键继续.");
                        sc.nextLine();
                        sc.nextLine();
                        break;
                    case 3:
                        shj.buHuo();
                        System.out.println("补充成功！");
                        shj.zhanShi();
                        System.out.println();
//                        System.out.println("按回车键继续.");
//                        sc.nextLine();
//                        sc.nextLine();
                        break;
                    case 1:
                        System.out.println("请选择货架:");

                        int xuanZeHuoJia=sc.nextByte();
                        if(shj.huoQuShuMu(xuanZeHuoJia)==0){
                            System.out.println("该货架空了，请补充货架.");
                            break;
                        }
                        System.out.println("您是普通用户，购买有九折优惠。");
                        double huafei=py.huoQuZheKou()*shj.yinLiaoJiaGe(xuanZeHuoJia);
                        System.out.print("购买"+
                                shj.yinLiaoMing(xuanZeHuoJia)+
                                "花费￥");
                        System.out.printf("%.2f\n",huafei);

                        py.huaQian(py.huoQuZheKou()*shj.yinLiaoJiaGe(xuanZeHuoJia));
                        System.out.print("余额:￥");
                        System.out.printf("%.2f\n",py.yuE());
                        shj.naChuYinLiao(xuanZeHuoJia);
                        System.out.println("按回车键继续.");
                        sc.nextLine();
                        sc.nextLine();
                        break;
                }
                shj.zhanShi();
                System.out.println();
            }
        }
    }
}
