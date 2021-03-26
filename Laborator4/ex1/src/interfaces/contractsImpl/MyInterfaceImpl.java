package interfaces.contractsImpl;

import interfaces.contracts.MyInterface;
//O clasa poate extinde o singura clasa insa poate implementa
//oricate interfete
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void saySomething() {
        System.out.println("Hello world");
    }

    @Override
    public int addOperation(int a1, int a2) {
        return a1 + a2;
    }
}
