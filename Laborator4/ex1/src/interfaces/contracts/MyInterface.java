package interfaces.contracts;

public interface MyInterface {
    void saySomething();
    int addOperation(int a1, int a2);

    default void m1(){
       //
    }

    static void m2(){
        //
    }
}
