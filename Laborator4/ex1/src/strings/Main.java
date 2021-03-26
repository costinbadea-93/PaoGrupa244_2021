package strings;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello world";
        s1 = s1.concat("something");
        System.out.println(s1);

        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append(" something");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("Hello world");
        stringBuffer.append(" something");
        System.out.println(stringBuffer.toString());

        //stringBuilder nu este synchronised (2 fire de executie pot chema aceiasi metoda simultan)
        //stringBuilder este mai eficient

    }
}
