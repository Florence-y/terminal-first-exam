package demo;

public class shouHuoJi {
    private huoJia[] hj=new huoJia[10];
    yinLiao b=new baiShi();
    yinLiao x=new xueBi();
    yinLiao p=new piJiu();
    public shouHuoJi(){
        int i;
        for(i=0;i<3;i++){
            hj[i]=new huoJia(b);
        }
        for(i=3;i<6;i++){
            hj[i]=new huoJia(x);
        }
        for(i=6;i<10;i++){
            hj[i]=new huoJia(p);
        }
    }
    public void zhanShi(){
        int i;
        for(i=0;i<10;i++){
            System.out.print(i+"\t\t");
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.print(hj[i].huoQuYinLiao()+"\t");
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.print(hj[i].huoQuShuMu()+"\t\t");
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.print("￥"+hj[i].huoQuJiaGe()+"\t");
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.print(hj[i].huoQuRongLiang()+"ml\t");
        }
    }
    public void buHuo(){
        int i;
        for(i=0;i<10;i++){
            hj[i].buChong();
        }
    }
    public String yinLiaoMing(int i){
        return hj[i].huoQuYinLiao();
    }
    public double yinLiaoJiaGe(int i){
        return hj[i].huoQuJiaGe();
    }
    public double naChuYinLiao(int i){
        return hj[i].naChuYinLiao();
    }
    public int huoQuShuMu(int i){
        return hj[i].huoQuShuMu();
    }

}
