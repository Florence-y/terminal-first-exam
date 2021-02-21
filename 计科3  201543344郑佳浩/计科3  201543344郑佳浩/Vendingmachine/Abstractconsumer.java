package Vendingmachine;

public abstract class Abstractconsumer {

    Coke coke=new Coke("coke", 600, 4);
    Coffee coffee=new Coffee("coffee",300,8);
    Maotai maotai=new Maotai("maotai",500,1500);
    Sprite sprite=new Sprite("sprite",600,4);
    Redbull redbull=new Redbull("redbull",300,5);
    Vodka vodka=new Vodka("vodka",350,100);
    Water water=new Water("water",500,2);
  /*******/

    private String name;
    private String status;
    private double money;
    private String wantdrinks;
    private double earn;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status =status;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getWantdrinks() {
        return wantdrinks;
    }

    public void setWantdrinks(String wantdrinks) {
        this.wantdrinks = wantdrinks;
    }

    public void setEarn(double earn) {
        this.earn = earn;
    }

    public double getEarn(){return earn;}

    /*******/

/*******/
    public double buying() {
    if(getMoney()>=getEarn()){
        setMoney(getMoney()-getEarn());
        System.out.println("余额:"+getMoney());
        return 1;
    }
    else{
        System.out.println("你给不起！");
        System.out.println(" ");
        return 0;
    }
    }
/*******/
    public void deposit(double deposited,double recharge){
        setMoney(deposited+recharge);
    }
/******/
    public void drinking(){}
    public void drinking(Coke coke){ coke.drink(); }
    public void drinking(Coffee coffee){coffee.drink();}
    public void drinking(Maotai maotai){maotai.drink();}
    public void drinking(Sprite sprite){sprite.drink();}
    public void drinking(Redbull redbull){redbull.drink();}
    public void drinking(Vodka vodka){vodka.drink();}
    public void drinking(Water water){water.drink();}
 /*****/
    public Abstractconsumer(){
        super();
    }
    public Abstractconsumer(String name,String status ,int money,String wantdrinks){
        super();
        this.name=name;
        this.status=status;
        this.money=money;
        this.wantdrinks=wantdrinks;
    }
}
/********************************************************************/
class vip extends Abstractconsumer{
    public void earn(){}
    public double earn(double money){
        this.setEarn(money*0.8);
        return getEarn();
    }
    public vip(){
        super();
    }
    public vip(String name,String status ,int money,String wantdrinks){
        super();
        this.setName(name);
        this.setstatus(status);
        this.setMoney(money);
        this.setWantdrinks(wantdrinks);
    }
}
/**********************************************************************/
class common extends Abstractconsumer{

    public void earn(){
    }
    public double earn(double money){
        this.setEarn(money*0.95);
        return getEarn();
    }
    public common(){
        super();
    }
    public common(String name,String status ,int money,String wantdrinks){
        super();
        this.setName(name);
        this.setstatus(status);
        this.setMoney(money);
        this.setWantdrinks(wantdrinks);
    }
}