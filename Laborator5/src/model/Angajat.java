package model;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Angajat {
    private String nume;
    private int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Optional<Integer> getSalariu() {
        if(this.nume.equals("Ionut")) {
            return Optional.of(salariu);
        }
        return Optional.empty();
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
