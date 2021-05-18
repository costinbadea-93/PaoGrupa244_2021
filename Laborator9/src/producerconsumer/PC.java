package producerconsumer;
import java.util.ArrayList;
import java.util.List;

public class PC {
    List<Integer> integerList = new ArrayList<>();
    int capacity = 5;

    public void produce() throws InterruptedException{
        int value = 0;
        while(true){
            synchronized (this){
                while (integerList.size() == capacity){
                    wait();
                }
                integerList.add(value ++);
                System.out.println("We produced task - " + value);
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException{
        while (true){
            synchronized (this){
                while (integerList.size() == 0) {
                    wait();
                }
                int removedElement = integerList.remove(0);
                System.out.println("We consumed task " + removedElement);
                notify();
                Thread.sleep(500);
            }
        }
    }
}
