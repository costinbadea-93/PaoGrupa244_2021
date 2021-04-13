package csv.model;

public class Animal {
    private String name;
    private String culoare;

    public Animal(String name, String culoare) {
        this.name = name;
        this.culoare = culoare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
