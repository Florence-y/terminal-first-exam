package demo;

public class huiYuan extends ren {
    public huiYuan(){

    }
    public huiYuan(yinLiao y){
        xingMing="huiyuan";
        miMa="1234321";
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
        return 0.8;
    }
    public void huaQian (double i){
        qian-=i;
    }
}
