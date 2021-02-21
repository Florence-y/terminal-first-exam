package Vendingmachine;

public abstract class Abstractshelf{
    Coke[] cok=new Coke[8];

    Coffee[] cof =new Coffee[8];

    Maotai[] mao =new Maotai[8];

    Sprite[] spr =new Sprite[8];

    Redbull[] red =new Redbull[8];

    Vodka[] vod =new Vodka[8];

    Water[] wat =new Water[8];

    int i=-1;

    public int search(Coke[] cok){
        for(i=cok.length-1;i>=0;i--){
            if(cok[i].getName().equals("coke")){
                return i;
            }
        }System.out.println("无货售卖");return i;
    }
    public int search(Coffee[] cof){
        for(i=cof.length-1;i>=0;i--){
            if(cof[i].getName().equals("coffee")){
                return i;
            }
        }System.out.println("无货售卖");return i;
    }
    public int search(Maotai[] mao){
        for(i=mao.length-1;i>=0;i--){
            if(mao[i].getName().equals("maotai")){
                return i;
            }
        }System.out.println("无货售卖");return i;
    }
    public int search(Sprite[] spr){
        for(i=spr.length-1;i>=0;i--){
            if(spr[i].getName().equals("maotai")){
                return i;
            }
        }System.out.println("无货售卖");return i;
    }
    public int search(Redbull[] red){
        for(i=red.length-1;i>=0;i--){
            if(red[i].getName().equals("redbull")){
                return i;
            }
        }return i;
    }
    public int search(Vodka[] vod){
        for(i=vod.length-1;i>=0;i--){
            if(vod[i].getName().equals("vodka")){
            return i;
            }
        }System.out.println("无货售卖");return i;
    }
    public int search(Water[] wat){
        for(i=wat.length-1;i>=0;i--){
            if(wat[i].getName().equals("water")){
                    return i;
            }
        }System.out.println("无货售卖");return i;
    }
    public abstract void showshelf();
}
class Cokeshelf extends Abstractshelf{
    public Cokeshelf(){
        Coke[] cok=new Coke[8];}

    public Coke[] addshelf(){
    Coke[] cok=new Coke[8];
    for(int i=0;i<cok.length;i++){
        cok[i]=new Coke("coke", 600, 4);
    }
    return cok;
    }

    public void showshelf(Coke[] cok){
        for(int i = 0; i<cok.length; i++)
    {
        System.out.print(cok[i].getName());
        System.out.print("  ");
    }
    }

    @Override
    public void showshelf() {}
}
class Coffeeshelf extends Abstractshelf{
    public Coffeeshelf(){
        Coffee[] cok=new Coffee[8];}

    public Coffee[] addshelf(){
        Coffee[] cof=new Coffee[8];
        for(int i=0;i<cof.length;i++){
            cof[i]=new Coffee("coffee", 300, 8);
        }
        return cof;
    }

    public void showshelf(Coffee[] cof){
        for(int i = 0; i<cof.length; i++)
        {
            System.out.print(cof[i].getName());
            System.out.print("  ");
        }
    }

    @Override
    public void showshelf() {}
}
class Maotaishelf extends Abstractshelf{
    public Maotaishelf(){
        Maotai[] mao=new Maotai[8];}

    public Maotai[] addshelf(){
        Maotai[] mao=new Maotai[8];
        for(int i=0;i<mao.length;i++){
            mao[i]=new Maotai("maotai", 500, 1500);
        }
        return mao;
    }

    public void showshelf(Maotai[] mao){
        for(int i = 0; i<mao.length; i++)
        {
            System.out.print(mao[i].getName());
            System.out.print("  ");
        }
    }

    @Override
    public void showshelf() {}
}
class Spriteshelf extends Abstractshelf{
    public Spriteshelf(){
        Sprite[] spr=new Sprite[8];}

    public Sprite[] addshelf(){
        Sprite[] spr=new Sprite[8];
        for(int i=0;i<spr.length;i++){
            spr[i]=new Sprite("coke", 600, 4);
        }
        return spr;
    }

    public void showshelf(Sprite[] spr){
        for(int i = 0; i<spr.length; i++)
        {
            System.out.print(spr[i].getName());
            System.out.print("  ");
        }
    }

    @Override
    public void showshelf() { }
}
class Rebullshelf extends Abstractshelf{
    public Rebullshelf(){
        Redbull[] red=new Redbull[8];}

    public Redbull[] addshelf(){
        Redbull[] red=new Redbull[8];
        for(int i=0;i<red.length;i++){
            red[i]=new Redbull("redbull", 300, 5);
        }
        return red;
    }

    public void showshelf(Redbull[] red){
        for(int i = 0; i<red.length; i++)
        {
            System.out.print(red[i].getName());
            System.out.print("  ");
        }
    }

    @Override
    public void showshelf() { }
}
class Vodkashelf extends Abstractshelf{
    public Vodkashelf(){
        Vodka[] vod=new Vodka[8];}

    public Vodka[] addshelf(){
        Vodka[] vod=new Vodka[8];
        for(int i=0;i<vod.length;i++){
            vod[i]=new Vodka("vodka", 350, 100);
        }
        return vod;
    }

    public void showshelf(Vodka[] vod){
        for(int i = 0; i<vod.length; i++)
        {
            System.out.print(vod[i].getName());
            System.out.print("  ");
        }
    }

    @Override
    public void showshelf() {}
}
class Watershelf extends Abstractshelf{
    public Watershelf(){
        Water[] wat=new Water[8];}

    public Water[] addshelf(){
        Water[] wat=new Water[8];
        for(int i=0;i<wat.length;i++){
            wat[i]=new Water("water", 500, 2);
        }
        return wat;
    }

    public void showshelf(Water[] wat){
        for(int i = 0; i<wat.length; i++)
        {
            System.out.print(wat[i].getName());
            System.out.print("  ");
        }
    }

    @Override
    public void showshelf() {}
}