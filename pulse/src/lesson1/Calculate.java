package lesson1;

/**
 * Created by admin on 06.11.2016.
 */
public class Calculate {

    public static void doOperation(int firstOper, int secOper, String operation) {

        switch (operation) {
            case "+":
                System.out.println(firstOper + secOper);
                break;
            case "-":
                System.out.println(firstOper - secOper);
                break;
            case "*":
                System.out.println(firstOper * secOper);
                break;
            case "/":
                System.out.println(firstOper / secOper);
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}
