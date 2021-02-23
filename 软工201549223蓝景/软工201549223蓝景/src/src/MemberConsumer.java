

public class MemberConsumer extends Customer {

    //获取折扣行为
    public void GetDiscount() {
        System.out.println("你好！系统检测到你是会员用户，本次消费你将享受8折优惠哦！");
        System.out.println("尊贵的会员你好！你的余额为"+this.getMoney()+"欢迎下次惠顾哦！");
    }

    //会员充值行为
    public void charge(){
        System.out.println("尊贵的会员用户，你好，欢迎进入会员充值系统，本次充值将享有优惠哦" + "\n" + "\"亲亲！请需要你想要充值的金额:\"");
        java.util.Scanner i = new java.util.Scanner(System.in);
        int count = i.nextInt();
        if(count <= 0){
            System.out.println("非法充值，请重新操作");
            this.charge();
        }
        this.setMoney(this.getMoney()+count);
        System.out.println("亲，鉴于你是会员用户，充值将随机免减1~10元哦！");
        count = count -(int)(1+Math.random()*(10-1+1));
        System.out.print("亲亲，本次充值你只需要支付"+count+"元哦！"+"正在充值，请等待");
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

    //会员行为支付
    @Override
    public void pay(int select) {
        switch(select){
            case 1:
            case 2:
                this.setMoney(this.getMoney() -3 * 0.8);
                System.out.println("尊贵的会员，本次支付为你节省"+(3 - 3 * 0.8)+"欢迎下次光临！");
                break;
            case 3:
                this.setMoney(this.getMoney() -5 * 0.8);
                System.out.println("尊贵的会员，本次支付为你节省"+(5 - 5 * 0.8)+"欢迎下次光临！");
                break;
            case 4:
                this.setMoney(this.getMoney() - 2 * 0.8);
                System.out.println("尊贵的会员，本次支付为你节省"+(2 - 2 * 0.8)+"欢迎下次光临！");
                break;
            case 5:
                this.setMoney(this.getMoney() - 4 * 0.8);
                System.out.println("尊贵的会员，本次支付为你节省"+(4 - 4 * 0.8)+"欢迎下次光临！");
                break;
            default :
                System.out.println("输入错误！！！");
                break;
        }


    }



}

