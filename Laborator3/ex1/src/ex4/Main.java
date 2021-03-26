package ex4;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("A1");
        Animal a2 = new Animal("A1");

        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        // daca doua obiecte sunt egale, ele au acelasi hash code
        // doua obiecte care au acelasi hash cod, nu sunt neaparat egale
    }
}


class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}