package polymorphism;

public class Main {
    public static void main(String[] args) {
        /**
         * //suprascriere
         *Reguli:
         *- modificatorul de acces pentru metoda suprascrisa nu poate fi mai restrictiv decat metoda de suprascriere
         * - metodele final nu pot fi spurascrise
         * - metodele statice nu pot fi suprascrise
         * - metodele private nu pot fi suprascrise
         *- return type poate fi acelasi tip sau un subtip
         * - reguli pentru exceptii(le vom discuta mai tarziu)
         *
         *
         * //supraincarcare
         * Reguli:
         * -amandoua trebuie sa aiba acelasi nume de metoda;
         * -amandoua trebuie sa aiba numar diferiti de parametri;
         * -pot sa aiba acelasi numar de parametrii insa de tip diferit;
         * -(pot dar nu este obligatoriu) sa aiba tip diferit de return;
         * -(pot dar nu este obligatoriu) sa aiba modificatori de acces diferiti;
         * -(pot dar nu este obligatoriu) sa arunce exceptii diferite checked sau unchecked;
         */

        /**
         * static, final
         */
    }
}

class Animal{
    public void saySomething(){

    }
}

class Pisica extends Animal{
    /**
     * suprascriere
     */
    @Override
    public void saySomething() {
        //do something
    }

    /**
     * supraincarcare
     */

    public void sayAnything(){
        //
    }
    public void sayAnything(String msg){
        //
    }
}