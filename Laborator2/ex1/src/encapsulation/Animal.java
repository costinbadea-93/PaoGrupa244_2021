package encapsulation;

public class Animal {
    //private(doar in interiorul clasei), protected(pachete si subpachete), public(acces global), "default"(accesul se poate face doar in suresele aceluiasi pachet)
     private String nume;
     private String culoare;

     public Animal(){}

    /**
     *
     * @param nume
     * @param culoare
     * 1.putem avea oricati constructori cu numar diferit de parametrii
     * 2.daca nu avem definit nici un constructor, atunci va fi folosit constructorul default
     * 3.modificatorul de access poate fi public/ private(e.g: singleton pattern)
     */
    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
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
}
