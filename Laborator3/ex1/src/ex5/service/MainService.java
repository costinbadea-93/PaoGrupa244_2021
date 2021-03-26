package ex5.service;

import ex5.model.Angajat;
import ex5.model.Programator;

public class MainService {
   private static Angajat[] angajati = new Angajat[0];

   public MainService(){
       Programator p1 = new Programator(3000,"Ionescu", "Alexandru", 24);
       Programator p2 = new Programator(6000,"Georgescu", "Andrei", 27);
       adaugaProgramator(p1);
       adaugaProgramator(p2);
   }

   public void adaugaProgramator(Programator programator){
       angajati = adaugaInArray(angajati, programator);
       System.out.println("S-a adaugat angajatul " + programator.getNume() + " " + programator.getPrenume() + "" +
               " cu salariul " + programator.getSalariu() + " de baza si  " + programator.salariuTotal() + "salariu total!!!");
   }

   public void afiseazaAngajati() {
       for(int i=0; i< angajati.length; i ++) {
           System.out.println(angajati[i]);
       }
//       Arrays.stream(angajati)
//               .forEach(System.out::println);
   }

   private static Angajat[] adaugaInArray(Angajat[] angajati, Angajat angajat) {
       Angajat[] temp = new Angajat[angajati.length + 1];
       System.arraycopy(angajati,0, temp, 0, angajati.length);
       temp[angajati.length] = angajat;
       return temp;
   }
}
