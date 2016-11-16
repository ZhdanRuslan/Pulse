package lesson4;

public class Main {

    public static void main(String[] args) {

        Detail detail = new Detail("detail");
        Detail detail1 = new Detail("detail1");
        Detail detail2 = new Detail("detail2");
        Detail detail3 = new Detail("detail3");
        Detail detail4 = new Detail("detail4");
        Detail detail5 = new Detail("detail5");


        Worker worker = new Worker();
        CrazyWorker crazyWorker = new CrazyWorker();
        LeadingWorker leadingWorker = new LeadingWorker();

        Unit result = worker.addDetail(new Unit(), detail);

        result = crazyWorker.addDetail(result, detail1, detail2);

        result = leadingWorker.addDetail(result, detail3, detail4, detail5);
    }

}
