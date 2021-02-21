package demo;

public abstract class ren {
    public String xingMing;
    public String miMa;
    public double qian;
    public yinLiao xiang;
    public abstract double huoQuZheKou();
    public  void chongZhi(double qian){
        this.qian+=qian;
    }
    public void he(){
        xiang.daYin();
    }
}
