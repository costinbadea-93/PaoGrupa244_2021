package ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer [] myArray = {2,3,4,2,4};
        Integer [] mySecondArray = new Integer[10];
        Integer [][] myThirdArray = {
                {2,3,4},
                {5,6,7},
                {9,10,11}
        };

        /**
         * Parcurgeri:
         */
        for(int i = 0; i < myArray.length; i ++) {
            System.out.println(myArray[i]);
        }

        for(Integer i : myArray){
            System.out.println(i);
        }

        Arrays.stream(myArray)
                .forEach(elem -> System.out.println(elem));

        Arrays.stream(myArray)
                .forEach(System.out::println);

    }
}
