package lesson1;

import lesson1.exc.OutOfBoundsException;
import lesson1.exc.WrongOperationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arg1 = 0, arg2 = 0;
        String operation = null;

        while (true) {

            try {
                System.out.println("Input first param: ");
                arg1 = scanner.nextInt();
            } catch (InputMismatchException exc) {
                System.out.println("Not integer arg in param 1. Bye! ");
                break;
            }

            try {
                System.out.println("Input second param: ");
                arg2 = scanner.nextInt();
            } catch (InputMismatchException exc) {
                System.out.println("Not integer arg in param 2. Bye! ");
                break;
            }

            System.out.println("Input operation e.q (+ - * /) : Bye! ");
            operation = scanner.next();

            try {
                Calculate.doOperation(arg1, arg2, operation);
            } catch (WrongOperationException e) {
                System.out.println("Wrong operation in param 3. Try again. ");
            } catch (OutOfBoundsException e) {
                System.out.println("Value in param1 and param 2 must be between [-1000 1000] ");
            }
            scanner.close();
        }
    }
}
