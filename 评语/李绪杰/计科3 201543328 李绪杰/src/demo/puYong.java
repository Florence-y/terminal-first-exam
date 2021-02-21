package demo;

public class puYong extends ren {
    public puYong(){

    }
    public puYong(yinLiao y){
        xingMing="puyong";
        miMa="12321";
        qian=10;
        xiang=y;
    }
    public double yuE(){
        return qian;
    }
    public void chongZhi(double qian){
        this.qian+=qian;
    }
    public double huoQuZheKou(){
        return 0.9;
    }
    public void huaQian (double i){
        qian-=i;
    }
}
