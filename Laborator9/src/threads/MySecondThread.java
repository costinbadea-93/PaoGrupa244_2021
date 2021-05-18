package threads;

public class MySecondThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i < 10; i ++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
