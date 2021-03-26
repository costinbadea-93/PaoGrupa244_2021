package ex5.model;

public abstract class Angajat {
    private double salariu;

    public Angajat(double salariu) {
        this.salariu = salariu;
    }

    public  abstract double salariuTotal();

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "salariu=" + salariu +
                '}';
    }
}
