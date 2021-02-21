import java.util.Calendar;

abstract class Beverage {


    Calendar calendar = Calendar.getInstance();//创建日期类，获取当前商品出售日期
    int mouth = calendar.get(Calendar.MONTH)+1;

    //饮料相关属性
    private double price;
    private int capacity;

    //构造方法
    public Beverage() {

    }

    //抽象方法，打印广告
    public abstract void PrintAdvertisement();

    //getter and setter
    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //打印票据方法
    public abstract void printList();

}
//雪碧类
class sprite extends Beverage {


    @Override
    public void PrintAdvertisement() {
        System.out.println();
        System.out.println("透心凉，心飞扬!");
        System.out.println();

    }

    @Override
    public void printList() {
            System.out.println("--------------票据--------------------");
            System.out.println("【\tSPRITE * 1\t\t购买日期:"+calendar.get(Calendar.YEAR)+"."+mouth+"."+calendar.get(Calendar.DAY_OF_MONTH)+"】");
            System.out.println("-------------------------------------");
        }

}

//啤酒类
class beer extends Beverage{


    @Override
    public void PrintAdvertisement() {
        System.out.println();
        System.out.println("雪花啤酒，畅饮缤纷夏日！");
        System.out.println();

    }

    @Override
    public void printList() {
        System.out.println("---------------票据-------------------");
        System.out.println("【\tBEER * 1\t\t购买日期:"+calendar.get(Calendar.YEAR)+"."+mouth+"."+calendar.get(Calendar.DAY_OF_MONTH)+"】");
        System.out.println("-------------------------------------");
    }

}

//可乐类
class cola extends Beverage {


    @Override
    public void PrintAdvertisement() {
        System.out.println();
        System.out.println(" When Coca-Cola is a Part of Your Life, You Can’t Beat the Feeling");
        System.out.println();
    }

    @Override
    public void printList() {
        System.out.println("------------------票据----------------");
        System.out.println("【\tCOLA * 1\t\t购买日期:"+calendar.get(Calendar.YEAR)+"."+mouth+"."+calendar.get(Calendar.DAY_OF_MONTH)+"】");
        System.out.println("-------------------------------------");
    }

}
//橙汁类
class juice extends Beverage {


    @Override
    public void PrintAdvertisement() {
        System.out.println();
        System.out.println("“橙”邀天下客,共享好“味”来");
        System.out.println();
    }

    @Override
    public void printList() {
        System.out.println("-----------------票据----——-----------");
        System.out.println("【\tJUICE * 1\t\t购买日期:"+calendar.get(Calendar.YEAR)+"."+mouth+"."+calendar.get(Calendar.DAY_OF_MONTH)+"】");
        System.out.println("-------------------------------------");
    }
}
//咖啡类
class coffee extends Beverage {


    @Override
    public void PrintAdvertisement() {
        System.out.println();
        System.out.println("每刻精彩瞬间,每杯雀巢咖啡");
        System.out.println();

    }

    @Override
    public void printList() {
        System.out.println("-----------------票据-----------------");
        System.out.println("【\tCOFFEE * 1\t\t购买日期:"+calendar.get(Calendar.YEAR)+"."+mouth+"."+calendar.get(Calendar.DAY_OF_MONTH)+"】");
        System.out.println("-------------------------------------");
    }

}
