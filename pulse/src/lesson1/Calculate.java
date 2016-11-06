package lesson1;

/**
 * Created by admin on 06.11.2016.
 */
public class Calculate {

    public static void doOperation(int param1, int param2, String operation) {

        switch (operation) {
            case "+":
                System.out.println(param1 + param2);
                break;
            case "-":
                System.out.println(param1 - param2);
                break;
            case "*":
                System.out.println(param1 * param2);
                break;
            case "/":
                System.out.println(param1 / param2);
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}
