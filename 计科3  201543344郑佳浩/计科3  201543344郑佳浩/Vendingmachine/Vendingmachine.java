package Vendingmachine;

public class Vendingmachine {
    /*饮料初始化*************************************************************/
    Coke coke=new Coke("coke", 600, 4);
    Coffee coffee=new Coffee("coffee",300,8);
    Maotai maotai=new Maotai("maotai",500,1500);
    Sprite sprite=new Sprite("sprite",600,4);
    Redbull redbull=new Redbull("redbull",300,5);
    Vodka vodka=new Vodka("vodka",350,100);
    Water water=new Water("water",500,2);
    /*购物者初始化**********************************************************/
    vip vip=new vip("null","vip", 9999,"maotai");
    common common=new common("null","common",10,"water");
    /*货架初始化*************************************************************/
    Cokeshelf cokeshelf=new Cokeshelf();
    Coffeeshelf coffeeshelf=new Coffeeshelf();
    Maotaishelf maotaishelf=new Maotaishelf();
    Spriteshelf spriteshelf=new Spriteshelf();
    Rebullshelf redbullshelf=new Rebullshelf();
    Vodkashelf vodkashelf=new Vodkashelf();
    Watershelf watershelf=new Watershelf();
    Coke[] cok=new Coke[8];

    Coffee[] cof =new Coffee[8];

    Maotai[] mao =new Maotai[8];

    Sprite[] spr =new Sprite[8];

    Redbull[] red =new Redbull[8];

    Vodka[] vod =new Vodka[8];

    Water[] wat =new Water[8];

    /*********************************************************************/
    int T=1;
    int i=1;
    public Vendingmachine() {
        System.out.println("MENU:");
        System.out.println("[0]退出");
        System.out.println("[1]展示售货机");
        System.out.println("[2]填充货架");
        System.out.println("[3]确定身份");
        System.out.println("[4]充值");
        System.out.println("[5]vip购物");
        System.out.println("[6]common购物");
    }

}
