abstract class Customer {

    //消费者相关属性
    private final String name;
    private final String identification;
    private double money;
    private String like;
    //构建方法
    public Customer() {
        super();
        this.name = "***";
        this.identification = "ox123456";
        this.money = 50;
        this.like = "cola";
    }
    //getter和setter
    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getLike() {
        return like;
    }


    //消费者相关行为
    //获取折扣
    public abstract void GetDiscount();
    public void GetDiscount(Customer customer){
        customer.GetDiscount();
    }
    //充值钱
    public void charge(){
        System.out.println("请需要你想要充值的金额:");
        java.util.Scanner i = new java.util.Scanner(System.in);
        int count = i.nextInt();
        if(count <= 0){
            System.out.println("充值异常！！请重新操作");
            this.charge();
        }
        this.money = this.money + count;
        System.out.println("充值成功！你的账户余额为"+this.money);
    }

    //支付行为
    public abstract void pay(int select);

    //喝饮料(多态的运用)
    public void  drink(Beverage beverage){
        beverage.PrintAdvertisement();
    }

    //显示用户信息方法
    public void show(){
        System.out.println("心灵自动感应售卖机感应到你的名字是是"+getName()+"\n"+"你的余额还有"+getMoney()+"元\n"+"你的身份证明是"+getIdentification());
        System.out.println("你好，心灵自动售货机感应到你的个人喜欢的饮料是"+getLike()+"你可以选择购买或者更改你喜欢的饮品");
    }

    //获取售货机打印的购物单
    public void getList(Beverage beverage){beverage.printList();}

}

