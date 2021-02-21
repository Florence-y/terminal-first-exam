package demo;

public class piJiu extends yinLiao {
    public piJiu(){
        super.jiaGe=4;
        super.mingCheng="pijiu";
    }
    public  double huoQuJiaGe(){
        return jiaGe;
    }
    public String huoQuMingCheng(){
        return mingCheng;
    }
    @Override
    public void daYin() {
        System.out.println("来一瓶八二年的啤酒！");
    }
}
