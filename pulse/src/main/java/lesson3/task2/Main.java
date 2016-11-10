package lesson3.task2;

/**
 * Created by admin on 10.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Master master= new Master(100.00, 100.00);
        Trainee trainee = new Trainee(12.15, 22.25);

        System.out.println(master);
        System.out.println(trainee);

        Employee resultOfStudy = null;
        try {
            resultOfStudy = (Employee) master.teachSomeone(trainee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("<----------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------->");

        System.out.println(master);
        System.out.println(trainee);
        System.out.println(resultOfStudy);

    }
}
