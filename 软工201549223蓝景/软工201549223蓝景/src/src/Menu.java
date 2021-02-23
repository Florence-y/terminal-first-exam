
public class Menu {

    public static void main(){

        for(int i = 0;i < 3; i++){
            System.out.println();
        }
        System.out.println("\t\t"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t"+"||                                   ||");
        System.out.println("\t\t"+"||         1.查看或购买商品             ||");
        System.out.println("\t\t"+"||         2.填充货架(管理员权限)        ||");
        System.out.println("\t\t"+"||         3.   充值                  ||");
        System.out.println("\t\t"+"||         4.  退出系统                ||");
        System.out.println("\t\t"+"||                                   ||");
        System.out.println("\t\t"+"||                                   ||");
        System.out.println("\t\t"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //充值方法(多态)
    public void charge(Customer customer){
        customer.charge();
    }
    //获取折扣
    public void GetDiscount(Customer customer){
        customer.GetDiscount();
    }
    //支付行为
    public void pay(Customer customer){
        customer.pay(0);
    }
    //获取打印广告并打印清单方法
    public static Beverage print_show(int num){
        switch(num){
            case 1:
                cola Cola;
                Cola = new cola();
                return Cola;
            case 2:
                sprite Sprite;
                Sprite = new sprite();
                return Sprite;
            case 3:
                beer Beer;
                Beer = new beer();
                return Beer;
            case 4:
                juice Juice;
                Juice = new juice();
                return Juice;
            case 5:
                coffee Coffee;
                Coffee = new coffee();
                return Coffee;
            default:
                return null;

        }

    }
    //获取管理员权限方法
    public int get() throws InterruptedException{
        System.out.println("密码输入错误次数超过三次系统将强制退出");
        for(int k = 0; k < 3; k++){
            System.out.println("请输入管理员密码以获取填充商品权限"+"\n密码： ");
            java.util.Scanner i = new java.util.Scanner(System.in);
            int password = i.nextInt();
            if(password == 12345678 ){

                break;
            }else{
                System.out.println("密码错误！！！");
                if(k == 2)
                    return 0;
            }
        }
        return 0;

    }

}
