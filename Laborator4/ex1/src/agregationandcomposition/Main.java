package agregationandcomposition;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Agregare
         * -este un tip de relatie has-a
         * -amndoua entitatile pot exista separat
         * -week association
         */
        Student s1 = new Student("Andrei", 123);
        Student s2 = new Student("Ionut", 124);
        List<Student> students = Arrays.asList(s1);

        Department department = new Department("Department 1", students);

        System.out.println(department);


        /**
         * Composition
         * -este o relatie de tip "part-of"
         * -amandoua entitatile depind una de cealalta
         * -strong association
         */

        Engine e1 = new Engine("E1");
        Engine e2 = new Engine("E2");

        Car car = new Car("Audi", e2);
        System.out.println(car);

    }
}


class Student{
    private String firstName;
    private int id;

    public Student(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}


class Department{
    private String name;
    List<Student> students;

    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}

class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Car {
    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}