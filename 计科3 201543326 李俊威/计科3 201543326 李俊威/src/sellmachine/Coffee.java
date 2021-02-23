package sellmachine;

public class Coffee extends Drink{
    public void Data(){
        drinkName="Coffee";
        drinkPrice=5;
        drinkVolume=350;
    }
    public void advertisement(){
        System.out.println("广告语:缓解疲劳,就喝我！");
    }
}
