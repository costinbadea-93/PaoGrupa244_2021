import implementations.MyInterface;
import interfaces.MyInterfaceImpl;
import model.Angajat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        MyInterfaceImpl myInterface = new MyInterfaceImpl();
//        myInterface.m1();

//        MyInterface myInterface1 = () -> System.out.println("Hello from lambda!!!");
//        myInterface1.m1();

//        MyInterface myInterface1 = (a1,a2) -> System.out.println(a1 + a2);
//        myInterface1.m1(5, 6);

        /**
         * Consumer
         * Supplier
         * Predicate
         * BiPredicate
         * UnaryOperator
         * BinaryOperator
         * Function
         * BiFunction
         */

        List<Integer> myList = Arrays.asList(4,3,2,1,5,6);

        for(int i : myList) {
            if(i %2 == 0) {
                System.out.println(i * i);
            }
        }

        /**
         * ====================================================
         *   operatii intermediare     |    operatie terminala
         * ====================================================
         * operatii intermediare:
         * filter, map, flatMap, distinct, sorted, peek, limit, skip
         *
         * operatii terminale:
         * forEach, forEachOrdered, toArray, reduce, collect, min
         * ,max, count, anyMatch,allMatch,noneMatch, findFirst, findAny
         *
         *
         */
        Predicate<Integer> predicate =  p -> { return p%2 == 0;};
        Function<Integer, Integer> function = p -> p*p;
        Consumer<Integer> consumer = p -> System.out.println(p);

//        myList.stream()
//                .filter(p -> p%2 == 0)
//                .map(p -> p*p)
//                .forEach(p -> System.out.println(p));

        myList.stream()
                .filter(predicate)
                .map(function)
                .forEach(consumer);

//        List<List<Integer>> l1 = Arrays.asList(
//          Arrays.asList(1,2,3,4),
//          Arrays.asList(5,6,7,8)
//        );
//        List<Integer> l2 = l1.stream().flatMap(Collection::stream)
//                .collect(Collectors.toList());
//        System.out.println(l2);

//        Stream.iterate(0, i -> i + 1)
//                .limit(10)
//                .forEach(e -> System.out.println(e));

        boolean anyMatch = myList.stream().anyMatch(predicate);
        boolean allMatch = myList.stream().allMatch(predicate);
        System.out.println(allMatch);
        System.out.println(anyMatch);

        Optional<Integer> max = myList.stream()
                .max(((o1, o2) -> o1.compareTo(o2)));

        int maxFromOptional = max.get();
        System.out.println(maxFromOptional);

//        Angajat angajat = new Angajat("Ionut", 2000);
//        if(angajat.getSalariu() == null) {
//            //....
//        }else {
//            //...
//        }
//
//        int sal = angajat.getSalariu().orElseThrow(() -> new RuntimeException("Nu avem salariu"));
//        System.out.println(sal);


    }
}
