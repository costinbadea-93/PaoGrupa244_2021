package ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int [] myArray = {2,4,8,6,9,1};
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
        Animal [] myArray = {
                new Animal("B1","Negru"),
                new Animal("C1","Rosu"),
                new Animal("A1","Alb")
        };
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}

class Animal implements Comparable<Animal>{
    private String nume;
    private String culoare;

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.nume.compareTo(o.getNume());
    }
}