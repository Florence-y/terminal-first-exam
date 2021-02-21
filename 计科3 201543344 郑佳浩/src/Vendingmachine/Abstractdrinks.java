package Vendingmachine;

public abstract class Abstractdrinks {
    private String drinksname;
    private int volume;
    private double price;
    public String getName() {
        return drinksname;
    }
    public void setName(String name) {
        this.drinksname = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy();

    public Abstractdrinks(){
        super();
    }
    public Abstractdrinks(String drinksname,int volume ,int price){
      super();
      this.drinksname=drinksname;
      this.volume=volume;
      this.price=price;
    }
}
/*************************************************/
class Coke extends Abstractdrinks implements drink{

    public void buy(){
        System.out.println("永远快乐！！！");
    }
    public void drink(){
        System.out.println("再来一瓶！请付钱！");
    };
    public Coke(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/***********************************************/
class Coffee extends Abstractdrinks implements drink{
    public void buy(){
        System.out.println("永不困倦！");
    }
    public void drink(){
        System.out.println("再来一瓶！请付钱！");
    };
    public Coffee(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/*************************************************/
class Maotai extends Abstractdrinks implements drink{
    public void buy(){
        System.out.println("茅台兴国！！！");
    }
    public void drink(){
        System.out.println("你竟然舍得喝而不是拿去卖！");
    };
    public Maotai(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/***************************************************/
class Sprite extends Abstractdrinks implements drink{
    public void buy(){
        System.out.println("清凉时刻！");
    }
    public void drink(){
        System.out.println("再来一瓶！请付钱！");
    };
    public Sprite(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/******************************************************/
class Redbull extends Abstractdrinks implements drink{
    public void buy(){
        System.out.println("牛的力量！！！");
    }
    public void drink(){
        System.out.println("我被强化了！");
    };
    public Redbull(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/************************************************************/
class Vodka extends Abstractdrinks implements drink{
    public void buy(){
        System.out.println("火焰如甘泉般清凉！！");
    }
    public void drink(){
        System.out.println("吨~吨~吨~");
    };
    public Vodka(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/*************************************************************/
class Water extends Abstractdrinks implements drink{
    public void buy(){
        System.out.println("水是生命之源！");
    }
    public void drink(){
        System.out.println("成功补水~");
    };
    public Water(String name, int volume, int price) {
        super(name, volume, price);
    }
}
/************************************************************/
class Blank extends  Abstractdrinks implements drink{

    @Override
    public void buy() {

    }

    @Override
    public void drink() {

    }
}
/*************************************************************/
 interface drink{
    void drink();
 }