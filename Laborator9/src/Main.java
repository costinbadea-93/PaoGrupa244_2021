import threads.MyFirstThread;
import threads.MySecondThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //Threadurile permit unui program sa ruleze mai eficient, executand mai multe lucruri in paralel
        //Ciclurile de viata ale uni thread : new --start--->runnable -->running ---> terminated
        //                                                                       ---> block --->runnable


        //pentru a crea threaduri in java avem 2 optiuni: clasa Thread si interfata Runnable

        //cand chemam start(), un nou thread este creat si apoi este executata metoda run()
        //daca este chemat direct run, atunci nici un nou thread nu este creat iar metoda este apelata ca o metoda normala

//        MyFirstThread myFirstThread = new MyFirstThread();
////        myFirstThread.start();
//        System.out.println(Thread.currentThread().getName());
//        myFirstThread.run();

        MySecondThread mySecondThread = new MySecondThread();
//        mySecondThread.run();
        //runnable vs thread
        //este de preferat sa folosim runnable
        //java suporta single inheritance, de aceea se prefera runnable pentru o organizare mai buna a codului
        //un thread poate sa primeasca ca si parametru un runnable

//        Thread thread = new Thread(mySecondThread);
//        thread.start();

        Thread t1 = new MyFirstThread();
        Thread t2 = new MyFirstThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
