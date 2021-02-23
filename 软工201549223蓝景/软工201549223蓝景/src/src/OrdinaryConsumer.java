import java.util.Scanner;

public class OrdinaryConsumer extends Customer {

    //获取折扣行为
    public void GetDiscount() {
        System.out.println("系统检测到你是普通用户，本次消费只享受9.5折优惠");
        System.out.println("你的余额还有"+this.getMoney()+"元，建议升级到会员享受更多优惠哦！");
    }

    //普通用户充值
    public void charge(){
        System.out.println("亲，你好，欢迎进入充值系统，升级会员将享有更多优惠哦");
        System.out.print("亲亲！请需要你想要充值的金额:");
        int count;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        if(count <= 0){
            System.out.println("非法充值，请重新操作");
            this.charge();
        }
        this.setMoney(this.getMoney()+count);
        System.out.print("亲亲，本次充值你需要支付"+count+"元哦！"+"正在充值，请等待");
        for(int j = 0; j < 6; j++){
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("充值成功！");
        System.out.println("你的账户余额为"+this.getMoney()+"元");

    }

    //普通用户支付行为
    @Override
    public void pay(int select){
        if (select == 1) {
            this.setMoney(this.getMoney() -3 * 0.95);
            System.out.println("你好，本次支付为你节省"+(3 - 3 * 0.95)+"欢迎下次光临！");
        } else if (select == 2) {
            this.setMoney(this.getMoney() -3 * 0.95);
            System.out.println("你好，本次支付为你节省"+(3 - 3 * 0.95)+"欢迎下次光临！");
        } else if (select == 3) {
            this.setMoney(this.getMoney() -5 * 0.95);
            System.out.println("你好，本次支付为你节省"+(5 - 5 * 0.95)+"欢迎下次光临！");
        } else if (select == 4) {
            this.setMoney(this.getMoney() - 2 * 0.95);
            System.out.println("你好，本次支付为你节省"+(2 - 2 * 0.95)+"欢迎下次光临！");
        } else if (select == 5) {
            this.setMoney(this.getMoney() - 4 * 0.95);
            System.out.println("你好，本次支付为你节省"+(4 - 4 * 0.95)+"欢迎下次光临！");
        }

    }

}


