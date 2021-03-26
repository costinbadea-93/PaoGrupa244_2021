package immutableclass;

public final class Animal {
    private final String nume;
    private final String culoare;

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }
}
