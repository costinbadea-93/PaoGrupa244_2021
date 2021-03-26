package ex5.model;

public class Programator extends Angajat {
    private String nume;
    private String prenume;
    private int varsta;

    public Programator(double salariu, String nume, String prenume, int varsta) {
        super(salariu);
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public double salariuTotal() {
        return getSalariu() + (1.5 * getSalariu());
    }

    @Override
    public String toString() {
        return "Programator{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
