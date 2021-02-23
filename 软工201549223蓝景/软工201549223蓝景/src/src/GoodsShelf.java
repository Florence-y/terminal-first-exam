
//行为：A、给货架添加饮料 B、拿出一瓶饮料
public class GoodsShelf {

    //货架属性
    private int colaCount;//可乐数量
    private int spriteCount; //雪碧数量
    private int beerCount;//啤酒数量
    private int juiceCount;//橙汁数量
    private int coffeeCount;//咖啡数量
    //无参构造器，初始化饮料数量
    public GoodsShelf() {
        this.colaCount = 20;
        this.spriteCount = 20;
        this.beerCount = 20;
        this.juiceCount = 30;
        this.coffeeCount = 50;
    }

    //拿出一瓶饮料
    public void take(int i) throws InterruptedException{
        switch(i){
            case 1:
                System.out.print("你选择的商品是可口可乐!"+"正在出货");

                for(int k = 0;k < 6;k++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println("购买成功！");
                if(this.getColaCount() <=0 ){
                    System.out.println("当前货架商品不足，请等待填充");
                }
                this.setColaCount(this.getColaCount());
                break;
            case 2:
                System.out.print("你选择的商品是雪碧!正在出货");

                for(int k = 0;k < 6;k++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println("购买成功！");
                if(this.getSpriteCount() <= 0){
                    System.out.println("当前货架商品不足，请等待填充");
                }
                this.setSpriteCount(this.getSpriteCount());
                break;
            case 3:
                System.out.print("你选择的商品是啤酒!正在出货");

                for(int k = 0;k < 6;k++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println("购买成功！");
                if(this.getBeerCount() <= 0){
                    System.out.println("当前货架商品不足，请等待填充");
                }
                this.setBeerCount(this.getBeerCount());
                break;
            case 4:
                System.out.print("你选择的商品是橙汁!正在出货");

                for(int k = 0;k < 6;k++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println("购买成功！");
                if(this.getBeerCount() <= 0){
                    System.out.println("当前货架商品不足，请等待填充");
                }
                this.setJuiceCount(this.getJuiceCount());
                break;
            case 5:
                System.out.print("你选择的商品是咖啡!正在出货");

                for(int k = 0;k < 6;k++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println("购买成功！");
                if(this.getBeerCount() <= 0){
                    System.out.println("当前货架商品不足，请等待填充");
                }
                this.setCoffeeCount(this.getCoffeeCount());
                break;
            default :
                System.out.println("抱歉，暂时没有该商品");
                break;
        }
    }
    //getter and setter
    public int getColaCount() {
        return colaCount;
    }

    public void setColaCount(int colaCount) {
        this.colaCount = colaCount;
    }

    public int getSpriteCount() {
        return spriteCount;
    }

    public void setSpriteCount(int spriteCount) {
        this.spriteCount = spriteCount;
    }

    public int getBeerCount() {
        return beerCount;
    }

    public void setBeerCount(int beerCount) {
        this.beerCount = beerCount;
    }
    public int getJuiceCount() {
        return juiceCount;
    }
    public void setJuiceCount(int juiceCount) {
        this.juiceCount = juiceCount;
    }
    public int getCoffeeCount() {
        return coffeeCount;
    }
    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount = coffeeCount;
    }

    }
