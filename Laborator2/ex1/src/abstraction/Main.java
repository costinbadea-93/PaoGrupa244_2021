package abstraction;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MySecondClass mySecondClass = new MySecondClass();
        myClass.saySomething();
        mySecondClass.saySomething();
    }
}


interface MyInterface{
   void saySomething();

   //in laboratoarele urmatoare
//   default void m1(){
//
//   }
//
//   static void m2(){
//
//   }
}

abstract class MyAbstractClass{
    public abstract void saySomething();
    public void sayHello(){
        System.out.println("Hello!");
    }
}

class MyClass extends MyAbstractClass{
    @Override
    public void saySomething() {
        System.out.println("Hello from MyClass");
    }
}

class MySecondClass implements MyInterface{
    @Override
    public void saySomething() {
        System.out.println("Hello from MySecondClass");
    }
}