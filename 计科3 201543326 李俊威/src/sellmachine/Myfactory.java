package sellmachine;

public class Myfactory {
    public Drink CreateDrink(String drinkname) {
        switch(drinkname)
        {
            case "Coffee":
                return new Coffee();
            case "Bear":
                return new Bear();
            case "Coco":
                return new Coco();
            case "Pepsi":
                return new Pepsi();
            case "Milk":
                return new Milk();

        }
        return null;
    }

}
