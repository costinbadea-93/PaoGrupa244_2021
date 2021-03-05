public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        for(int i = 0; i < args.length; i ++){
            System.out.println(args[i]);
        }

        /**
         * Primitive types
         * byte short int long float double boolean char
         */

        /**
         * Byte Short Integer Long Float Double Boolean Character
         */

        int n1 = 10;
        Integer n2 = 10;
        System.out.println("Rezultatul compararii  n1 cu n2 este " + Integer.compare(n1,n2));

        long n3 = 15;
        Long n4 = 20L;

        float n5 = 4.5f;
        Float n6 = 4.7f;

        char n7 = 'C';
        char n9 = '\u004D';
        //pt lectiile urmatoare(nu este in scopul laboratorului 1)
        String n8 = "Hello world";
        System.out.println(n7);
        System.out.println(n9);

        /**
         * Instructiuni de control
         */

        //de decizie

        if(n1 > 10 ){
            //instr1
        } else{
            //instr2
        }

        if(n1 > 10) {
            //instr 1
        }else if(n1 < 10) {
            //instr 2
            //..... oricate else if
        }else{
            //instr n
        }

        switch (n1){
            case 10 :
                //instr 1
                break;
            case 20:
                //instr 2
                break;
            default:
                //instructiune default
        }

        // instructiuni repetitive
        for(int i = 0; i < 10; i++) {
            //instr
        }

        for(String i : args){
            System.out.println(i);
        }

        while(n1 < 10){
            n1 ++;
            System.out.println(n1);
        }

        do{

        }while(n1 < 10);

        // branching-ing instructions(brake, contiune, return)

        // brake si return pot fi folosite in instructiunile repetitive

        m1();


        //operators
        // ? ternary operator
        // i++
        // ++i


        /**
         * Exercitiu :
         * Se vor pasa ca argumente 2 numere si tipul de operatie
         * si se va afisa rezultatul in consola.
         */

    }


   public static void m1(){
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
            if( i == 5){
                return;
            }
        }
       System.out.println("Hello world");
   }
}
