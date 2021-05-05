package homework11;

import java.util.concurrent.SynchronousQueue;

public class Main {
    private SynchronousQueue<Integer> q = new SynchronousQueue<Integer>();
    private Thread t1 = new Thread() {

        @Override
        public void run() {
            while (true) {
                super.run();
                try {
                    System.out.println("Ping");
                    q.put(1);
                    q.put(2);
                } catch (Exception e) {

                }
            }
        }
    };

    private Thread t2 = new Thread() {
        @Override
        public void run() {
            while (true) {
                super.run();
                try {
                    q.take();
                    System.out.println("Pong");
                    q.take();
                } catch (Exception e) {
                }
            }
        }
    };

    public static void main(String[] args) {
        Main p = new Main();
        p.t1.start();
        p.t2.start();
    }
}

