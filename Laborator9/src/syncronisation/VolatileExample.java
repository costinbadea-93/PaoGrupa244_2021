package syncronisation;

public class VolatileExample  extends Thread{
    volatile boolean keepRunning  = true;

    @Override
    public void run() {
        long count  = 0;
        while (keepRunning) {
            count++;
        }
        System.out.println("Thred terminated." + count);
    }

    public static void main(String[] args) {
        VolatileExample t1 = new VolatileExample();
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After sleeping .....");
        t1.keepRunning = false;
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("keepRunnin = " + t1.keepRunning);
    }
}
