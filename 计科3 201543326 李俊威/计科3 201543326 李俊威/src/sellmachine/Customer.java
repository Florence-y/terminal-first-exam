package sellmachine;

public class Customer extends Client{
    public void customer(String newName){
        if(newName.equals("乔默月")){
            name=newName;
            money=8.00D;
            id="VIP";
            drink="Coffee";
        }
        else if(newName.equals("奥特曼")){
            name=newName;
            money=4.00D;
            id="ordinary";
            drink="Coco";
        }
    }
    public void discount(double newPrince){             //折扣  VIP减免一元  普通用户原价
        if(id.equals("VIP")){
            money=money-(double)(newPrince*0.8);            //VIP打八折
        }
        else if(id.equals("ordinary")){                // 普通用户 原价
            money=money-(double)newPrince;
        }
    }
    public  void addMoney(int newAddMoney){
        money=money+newAddMoney;
    }
    public void drinkdrink(Drink drink){
        drink.advertisement();
    }
    public void customerData(String newName){
        System.out.println("登录成功！！！");
        System.out.println("    用户资料     ");
        System.out.println("名称:"+name);
        System.out.println("余额:"+money);
        System.out.println("等级："+id);
        System.out.println("心仪饮料:"+drink);
    }

}

