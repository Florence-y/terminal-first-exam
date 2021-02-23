package sellmachine;

public abstract  class Client {
    public String name;
    public double money;
    public String drink;
    public String id;
    public abstract void customer(String newName);
    public abstract void customerData(String newNname);
    public abstract void discount(double newPrise);
    public abstract void addMoney(int newAddMoney);
    public abstract void  drinkdrink(Drink drink);
}
