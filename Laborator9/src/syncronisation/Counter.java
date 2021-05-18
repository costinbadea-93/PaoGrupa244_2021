package syncronisation;

public class Counter {
    public synchronized void printCounter(int n, String threadName) {
//        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println((n * i) + " from " + threadName);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
//    }
}


class T1 extends Thread{
    Counter counter;
    public T1(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
       counter.printCounter(50, Thread.currentThread().getName());
    }
}

class T2 extends Thread{
    Counter counter;
    public T2(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.printCounter(100, Thread.currentThread().getName());
    }
}

class Main{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new T1(counter);
        Thread t2 = new T2(counter);
        t1.start();
        t2.start();
    }
}