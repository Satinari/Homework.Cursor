package homework13;

public class Main {
    static Egg mAnotherOption;

    public static void main(String[] args) {
        mAnotherOption = new Egg();
        System.out.println("Dispute started...");
        mAnotherOption.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
            System.out.println("Chicken!");
        }

        if (mAnotherOption.isAlive()){
            try {
                mAnotherOption.join();
            } catch (InterruptedException e){}
            System.out.println("The egg appeared first!");
        } else {
            System.out.println("The egg appeared chicken!");
        }
        System.out.println("The dispute is over");
    }
}
