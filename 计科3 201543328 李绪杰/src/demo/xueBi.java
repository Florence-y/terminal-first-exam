package demo;

public class xueBi extends yinLiao {
    public xueBi(){
        super.jiaGe=3;
        super.mingCheng="xuebi";
    }
    public  double huoQuJiaGe(){
        return jiaGe;
    }
    public String huoQuMingCheng(){
        return mingCheng;
    }
    @Override
    public void daYin() {
        System.out.println("透心凉心飞扬！");
    }
}
