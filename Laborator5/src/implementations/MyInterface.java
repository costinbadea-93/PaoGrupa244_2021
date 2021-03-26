package implementations;

@FunctionalInterface
public interface MyInterface {
     void m1(int a1, int a2);
//     void m2();
//     void m3();
//     void m4();

     default void m5(){

     }

    static void m6(){

    }
}
