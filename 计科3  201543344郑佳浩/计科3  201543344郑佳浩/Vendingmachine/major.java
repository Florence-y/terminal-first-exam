package Vendingmachine;

import Vendingmachine.Vendingmachine;

import java.util.Scanner;

public class major {
    public static void main(String [] args){
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
        /*货架初始化*********************************************************/
        Cokeshelf cokeshelf=new Cokeshelf();
        Coffeeshelf coffeeshelf=new Coffeeshelf();
        Maotaishelf maotaishelf=new Maotaishelf();
        Spriteshelf spriteshelf=new Spriteshelf();
        Rebullshelf redbullshelf=new Rebullshelf();
        Vodkashelf vodkashelf=new Vodkashelf();
        Watershelf watershelf=new Watershelf();
        Coke[] cok=new Coke[8];
        cok=cokeshelf.addshelf();
        Coffee[] cof =new Coffee[8];
        cof=coffeeshelf.addshelf();
        Maotai[] mao =new Maotai[8];
        mao=maotaishelf.addshelf();
        Sprite[] spr =new Sprite[8];
        spr=spriteshelf.addshelf();
        Redbull[] red =new Redbull[8];
        red=redbullshelf.addshelf();
        Vodka[] vod =new Vodka[8];
        vod=vodkashelf.addshelf();
        Water[] wat =new Water[8];
        wat=watershelf.addshelf();
        /*使用的常量初始化***********************************************/
        double T=0;
        int I=7;

     while(true)

     {   Vendingmachine vendingmachine=new Vendingmachine();
        Scanner scan1 = new Scanner(System.in);
        int a=scan1.nextInt();
        if(a==0){break;}/*跳出循环，关闭机器*/
        if(a==1){
            cokeshelf.showshelf(cok);
            System.out.println();
            coffeeshelf.showshelf(cof);
            System.out.println();
            maotaishelf.showshelf(mao);
            System.out.println();
            spriteshelf.showshelf(spr);
            System.out.println();
            redbullshelf.showshelf(red);
            System.out.println();
            vodkashelf.showshelf(vod);
            System.out.println();
            watershelf.showshelf(wat);
            System.out.println();

        }/*展示对象数组实现展示货架*****/
        if(a==2){
            cok=cokeshelf.addshelf();
            cof=coffeeshelf.addshelf();
            mao=maotaishelf.addshelf();
            spr=spriteshelf.addshelf();
            red=redbullshelf.addshelf();
            vod=vodkashelf.addshelf();
            wat=watershelf.addshelf();
        }/*为所有对象数组重新赋值实现补货*/
        if(a==3){
            System.out.println("请输入姓名:");
            Scanner scan2 = new Scanner(System.in);
            String b=scan2.nextLine();
            System.out.println("请输入身份(vip or common):");
            Scanner scan3 = new Scanner(System.in);
            String c=scan3.nextLine();
            System.out.println("请输入存款:");
            Scanner scan4 = new Scanner(System.in);
            int d=scan4.nextInt();
            System.out.println("请输入想要的饮料(可选饮料详见货架展示):");
            Scanner scan5 = new Scanner(System.in);
            String e=scan5.nextLine();

            if(c.equals("vip")){
                vip.setName(b);
                vip.setMoney(d);
                vip.setWantdrinks(e);
            }
            if(c.equals("common")){
                common.setName(b);
                common.setMoney(d);
                common.setWantdrinks(e);
            }
        }/*输入身份，为vip or common 对象重新赋值*/
         if(a==4){
             System.out.println("请输入充值数目:");
             Scanner scan6 = new Scanner(System.in);
             double f=scan6.nextDouble();
             vip.deposit(vip.getMoney(),f);
             common.deposit(common.getMoney(),f);
         }/*充值操作*/
            if(a==5){if(vip.getName().equals("null")){
                System.out.println("请输入身份");
                System.out.println("");
            }else{ /* 实现vip购买*/
                if(vip.getWantdrinks().equals("coke")){
                    I=cokeshelf.search(cok);
                    if(I>=0){
                    vip.earn(coke.getPrice());
                    T=vip.buying();
                    if(T==1){
                        cok[I].setName("null");
                        coke.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {vip.drinking(coke);
                        System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        };
                    }
                    }
                }
                if(vip.getWantdrinks().equals("coffee")){
                I=coffeeshelf.search(cof);
                if(I>=0){
                    vip.earn(coffee.getPrice());
                    T=vip.buying();
                   if(T==1) {
                        cof[I].setName("null");
                        coffee.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {vip.drinking(coffee);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                   }
                }}
                if(vip.getWantdrinks().equals("maotai")){
                    I=maotaishelf.search(mao);
                    if(I>=0){vip.earn(maotai.getPrice());
                    T=vip.buying();
                    if(T==1){
                        mao[I].setName("null");
                        maotai.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {vip.drinking(maotai);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(vip.getWantdrinks().equals("sprite")){
                    I=spriteshelf.search(spr);
                    if(I>=0){vip.earn(sprite.getPrice());
                    T=vip.buying();
                    if(T==1){
                        spr[I].setName("null");
                        sprite.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {vip.drinking(sprite);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(vip.getWantdrinks().equals("redbull")){
                    I=redbullshelf.search(red);
                    if(I>=0){vip.earn(redbull.getPrice());
                    T=vip.buying();
                    if(T==1){
                        red[I].setName("null");
                        redbull.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {   vip.drinking(redbull);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(vip.getWantdrinks().equals("vodka")){
                    I=vodkashelf.search(vod);
                    if(I>=0){vip.earn(vodka.getPrice());
                    T=vip.buying();
                    if(T==1){
                        vod[I].setName("null");
                        vodka.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {vip.drinking(vodka);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(vip.getWantdrinks().equals("water")){
                    I=watershelf.search(wat);
                    if(I>=0){vip.earn(water.getPrice());
                    T=vip.buying();
                    if(T==1){
                        wat[I].setName("null");
                        water.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {vip.drinking(coke);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}

            }
        }
            if(a==6){if(common.getName().equals("null")){
                System.out.println("请输入身份");
                System.out.println("");
            }else{ /*实现common购买*/
                if(common.getWantdrinks().equals("coke")){
                    I=cokeshelf.search(cok);
                    if(I>=0){common.earn(coke.getPrice());
                    T=common.buying();
                    if(T==1){
                        cok[I].setName("null");
                        coke.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(coke);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(common.getWantdrinks().equals("coffee")){
                    I=coffeeshelf.search(cof);
                    if(I>=0){common.earn(coffee.getPrice());
                    T=common.buying();
                    if(T==1){
                        cof[I].setName("null");
                        coffee.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(coffee);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(common.getWantdrinks().equals("maotai")){
                    I=maotaishelf.search(mao);
                    if(I>=0){common.earn(maotai.getPrice());
                    T=common.buying();
                    if(T==1){
                        mao[I].setName("null");
                        maotai.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(maotai);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(common.getWantdrinks().equals("sprite")){
                    I=spriteshelf.search(spr);
                    if(I>=0){common.earn(sprite.getPrice());
                    T=common.buying();
                    if(T==1){
                        spr[I].setName("null");
                        sprite.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(sprite);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(common.getWantdrinks().equals("redbull")){
                    I=redbullshelf.search(red);
                    if(I>=0){common.earn(redbull.getPrice());
                    T=common.buying();
                    if(T==1){
                        red[I].setName("null");
                        redbull.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(redbull);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                        }
                    }
                }}
                if(common.getWantdrinks().equals("vodka")){
                    I=vodkashelf.search(vod);
                    if(I>=0){common.earn(vodka.getPrice());
                    T=common.buying();
                    if(T==1){
                        vod[I].setName("null");
                        vodka.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(vodka);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                            }
                    }
                }}
                if(common.getWantdrinks().equals("water")){
                    I=watershelf.search(wat);
                    if(I>=0){common.earn(water.getPrice());
                    T=common.buying();
                    if(T==1){
                        wat[I].setName("null");
                        water.buy();
                        System.out.println("输入[1]饮用饮料！");
                        Scanner scan6 = new Scanner(System.in);
                        int r=scan6.nextInt();
                        if(r==1)
                        {common.drinking(water);
                            System.out.println("");}
                        else{
                            System.out.println("饮料已被带回家");
                            System.out.println("");
                            }
                        }
                    }}

                }
            }
     }
    }
}
