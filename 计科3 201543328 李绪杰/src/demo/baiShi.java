package demo;

public class baiShi extends yinLiao {
    public baiShi(){
        super.jiaGe=3.5;
        super.mingCheng="baishi";
    }
    public  double huoQuJiaGe(){
        return jiaGe;
    }
    public String huoQuMingCheng(){
        return mingCheng;
    }
    @Override
    public void daYin() {
        System.out.println("喝百事可乐百事都可乐！");
    }
}
