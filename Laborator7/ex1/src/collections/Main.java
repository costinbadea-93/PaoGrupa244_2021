package collections;

import singleton.MyService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        ListIterator<Integer> integerListIterator = arrayList.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }

        System.out.println(arrayList);

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println(hashSet);

        Set<Animal> animals = new HashSet<>();
        animals.add(new Animal("A1", "negru"));
        animals.add(new Animal("A1", "negru"));
        animals.add(new Animal("A2", "alb"));
        System.out.println(animals);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(6);
        System.out.println(treeSet);

        Set<Animal> animalTreeSet = new TreeSet<>(new AnimalComparator());
        animalTreeSet.add(new Animal("A1", "negru"));
        animalTreeSet.add(new Animal("A1", "negru"));
        animalTreeSet.add(new Animal("A6", "alb"));
        animalTreeSet.add(new Animal("A4", "alb"));
        System.out.println(animalTreeSet);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("A1", "negru"));
        animalList.add(new Animal("A1", "negru"));
        animalList.add(new Animal("A6", "alb"));
        animalList.add(new Animal("A4", "alb"));
        System.out.println(animalList);

//        Collections.sort(animalList, new collections.AnimalComparator());
//        System.out.println(animalList);

        Collections.sort(animalList, ((o1, o2) -> o1.getNume().compareTo(o2.getNume())));
        System.out.println(animalList);

//        Collections.sort(animalList, Comparator.comparing(collections.Animal::getNume));
//        System.out.println(animalList);

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A","1");
        hashMap.put("C","2");
        hashMap.put("B","3");
        System.out.println(hashMap);

        Map<String, Animal> treeMap = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
        treeMap.put("1", new Animal("A1", "5"));
        treeMap.put("3", new Animal("A4", "9"));
        treeMap.put("2", new Animal("A4", "4"));
        System.out.println(treeMap);

        treeMap.entrySet()
                .stream()
                .forEach(stringAnimalEntry -> System.out.println(stringAnimalEntry.getKey() + " " + stringAnimalEntry.getValue()));

        treeMap.entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getValue().getCuloare().compareTo(o2.getValue().getCuloare()))
                .forEach(System.out::println);


        MyService myService = MyService.getInstance();
    }
}



class AnimalComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNume().compareTo(o2.getNume());
    }
}

class Animal  {
    private String nume;
    private String culoare;

    public Animal(){}

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nume, animal.nume) &&
                Objects.equals(culoare, animal.culoare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, culoare);
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
        return "collections.Animal{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }


}
//class collections.Animal implements Comparable<collections.Animal> {
//    private String nume;
//    private String culoare;
//
//    public collections.Animal(String nume, String culoare) {
//        this.nume = nume;
//        this.culoare = culoare;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        collections.Animal animal = (collections.Animal) o;
//        return Objects.equals(nume, animal.nume) &&
//                Objects.equals(culoare, animal.culoare);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nume, culoare);
//    }
//
//    public String getNume() {
//        return nume;
//    }
//
//    public void setNume(String nume) {
//        this.nume = nume;
//    }
//
//    public String getCuloare() {
//        return culoare;
//    }
//
//    public void setCuloare(String culoare) {
//        this.culoare = culoare;
//    }
//
//
//    @Override
//    public String toString() {
//        return "collections.Animal{" +
//                "nume='" + nume + '\'' +
//                ", culoare='" + culoare + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(collections.Animal o) {
//        return this.nume.compareTo(o.getNume());
//    }
//}