public class SaleMachine extends GoodsShelf{

    //属性
    private int GoodsShelf[] = new int[10];

    public SaleMachine() {

    }

    //构造方法
    public int[] getGoodsShelf() {
        return GoodsShelf;
    }

    public void setGoodsShelf(int[] goodsShelf) {
        GoodsShelf = goodsShelf;
    }
    //展示售货机
    public void showList(){
        System.out.println("************欢迎光临心灵感应自动售货机*************");
        System.out.println("当前售货机商品如下");
        System.out.println("商品名称"+"\t\t"+"价格"+"\t\t"+"剩余量");
        System.out.println("可口可乐"+"\t\t"+"3元/瓶\t\t"+this.getColaCount()+"\n"+"雪碧"+"\t\t"+"3元/瓶\t\t"+this.getSpriteCount()+"\n"+"啤酒"+"\t\t"+"5元/瓶\t\t"+this.getBeerCount()+"\n"+"果汁"+"\t\t"+"2元/罐\t\t"+this.getJuiceCount()+"\n"+"咖啡\t\t"+"4元/瓶\t\t"+this.getCoffeeCount());
        System.out.println("更多饮料请等待后续更新哦!");
    }
    //出售商品
    public void sale(int num){
        switch(num){
            case 1:
                this.setColaCount(this.getColaCount()-1);
                System.out.println("当前可乐还剩余"+this.getColaCount()+"瓶，欢迎你继续购买。");
                break;
            case 2:
                this.setSpriteCount(this.getSpriteCount()-1);
                System.out.println("当前雪碧还剩余"+this.getSpriteCount()+"瓶，欢迎你继续购买。");
                break;
            case 3:
                this.setBeerCount(this.getBeerCount()-1);
                System.out.println("当前啤酒还剩余"+this.getBeerCount()+"瓶，欢迎你继续购买。");
                break;
            case 4:
                this.setJuiceCount(this.getJuiceCount()-1);
                System.out.println("当前橙汁还剩余"+this.getJuiceCount()+"罐，欢迎你继续购买。");
                break;
            case 5:
                this.setCoffeeCount(this.getCoffeeCount()-1);
                System.out.println("当前咖啡还剩余"+this.getCoffeeCount()+"瓶，欢迎你继续购买。");
                break;
            default:
                System.out.println("输入错误！！！");
                break;
        }
    }

    //填充商品
    public void fill() throws InterruptedException{
        this.setColaCount(20);
        Thread.sleep(1000);
        System.out.println("密码正确，开始填充"+"\n"+"可乐填充完毕！");
        this.setSpriteCount(20);
        Thread.sleep(1000);
        System.out.println("雪碧填充完毕！");
        this.setBeerCount(20);
        Thread.sleep(1000);
        System.out.println("啤酒填充完毕！");
        this.setJuiceCount(30);
        Thread.sleep(1000);
        System.out.println("橙汁填充完毕！");
        this.setCoffeeCount(50);
        Thread.sleep(1000);
        System.out.println("咖啡填充完毕！"+"\n"+"所有商品已经填充完毕，请重新操作！");

    }
    //获取管理员权限并填充商品
    public int get() throws InterruptedException{
        System.out.println("密码输入错误次数超过三次系统将强制退出");
        for(int j = 0;j < 3; j++){
            System.out.println("请输入管理员密码以获取填充商品权限"+"\n密码： ");
            java.util.Scanner i = new java.util.Scanner(System.in);
            int password = i.nextInt();
            if(password == 12345678 ){
                this.fill();
                break;
            }else{
                System.out.println("密码错误！！！");
                if(j == 2)
                    return 0;
            }
        }
        return 0;

    }
}



