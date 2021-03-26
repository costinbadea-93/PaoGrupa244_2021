package ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Bobita");
//        System.out.println(animal);
        int [] myArray = new int[0];

        myArray = add(myArray, 3);
        myArray = add(myArray, 5);
        myArray = add(myArray, 2);
        myArray = add(myArray, 8);
        System.out.println(Arrays.toString(myArray));

    }

    public static int[] add(int[] myInitialArray, int elem){
        int [] temp = new int[myInitialArray.length + 1];
//        for(int i = 0; i < myInitialArray.length; i ++) {
//            temp[i] = myInitialArray[i];
//        }
        System.arraycopy(myInitialArray, 0, temp, 0, myInitialArray.length);
        temp[myInitialArray.length] = elem;
        return temp;
    }
}


class Animal{
    private String nume;

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                '}';
    }
}