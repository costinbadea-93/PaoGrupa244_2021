package interfaces;

import implementations.MyInterface;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void m1(int a1, int a2) {
        System.out.println(a1 + a2);
    }
//    @Override
//    public void m1() {
//        System.out.println("Hello!");
//    }
}
