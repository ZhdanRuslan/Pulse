package lesson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arg1 = 0;
        int arg2 = 0;

        while (true){

            try {
                arg1 = scanner.nextInt();
            } catch (InputMismatchException exc){
                System.out.println("Wrong value! Try again.");
                continue;
            }

            try {
                arg2 = scanner.nextInt();
            } catch (InputMismatchException exc){
                System.out.println("Wrong value! Try again.");
                continue;
            }

            String operation = scanner.next();

            Calculate.doOperation(arg1, arg2, operation);
        }
    }
}
