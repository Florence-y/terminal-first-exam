package sellmachine;

public class shelve {
    static int[] num = {9, 10, 10, 10, 10};
    static int[] price = {5, 3, 2, 2, 3};
    static String[] drinkName = {"Coffee", "Milk", "Coco", "Pepsi", "Bear"};
    public static void show1() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("编号:  1                2                3                4                5");
        System.out.println("名称:  " + drinkName[0] + "           " + drinkName[1] + "             " + drinkName[2] + "             " + drinkName[3] + "            " + drinkName[4]);
        System.out.println("单价:  " + price[0] + "                " + price[1] + "                " + price[2] + "                " + price[3] + "                " + price[4]);
        System.out.println("容量:  350ml            450ml            350ml            350ml            450ml");
        System.out.println("数量:  " + num[0] + "                " + num[1] + "               " + num[2] + "               " + num[3] + "               " + num[4]);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
    }
    public static void buyDrink(int num1,int num2){
        num[num1]=num[num1]-num2;

    }
    public static int numDrink(String newDrinkName){
        if(newDrinkName.equals("Coffee")){
            return 0;
        }
        else if(newDrinkName.equals("Milk")){
            return 1;
        }
        else if(newDrinkName.equals("Coco")){
            return 2;
        }
        else if(newDrinkName.equals("Pepsi")){
            return 3;
        }
        else if(newDrinkName.equals("Bear")){
            return 4;
        }
        return 5;
    }
    public static void addDrink(){
        for (int i = 0; i < 5; i++)
            if (num[i] != 10)
                num[i] = 10;
    }
}
