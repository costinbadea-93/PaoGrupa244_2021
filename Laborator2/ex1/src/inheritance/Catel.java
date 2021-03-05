package inheritance;

import java.util.Scanner;

public class Catel extends Animal{
    private String nume;
    private String culoare;

    public Catel(String rasa, String nume, String culoare) {
        super(rasa);
        this.nume = nume;
        this.culoare = culoare;
    }
}
