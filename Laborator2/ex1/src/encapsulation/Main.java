package encapsulation;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal("Bobi","negru");
        System.out.println("Animalul are numele " + animal1.getNume() + " si culoarea " + animal1.getCuloare());
    }
}
