package lesson3.task2;

/**
 * Created by admin on 10.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Master master= new Master(100.00, 100.00);
        Trainee trainee = new Trainee();

        System.out.println(master);
        System.out.println(trainee);

        master.teachSomeone(trainee);

        System.out.println("<--------------------------------------->");

        System.out.println(master);
        System.out.println(trainee);

    }
}
