package demo;

public class huoJia {
    public huoJia (yinLiao y){
        this.y=y;
        shuMu=10;
    }
    private yinLiao y;
    private int shuMu;
    public  void buChong(){
        shuMu=10;
    }
    public int huoQuShuMu(){
        return shuMu;
    }
    public double naChuYinLiao(){
        if(shuMu==0){
            return -1;
        }
        shuMu--;
        y.daYin();
        return this.y.jiaGe;
    }
    public String huoQuYinLiao(){
        return y.mingCheng;
    }
    public double huoQuJiaGe(){
        return y.jiaGe;
    }
    public int huoQuRongLiang(){
        return y.rongLiang;
    }
}
