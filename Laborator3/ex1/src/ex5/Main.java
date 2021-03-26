package ex5;

import ex5.model.Programator;
import ex5.service.MainService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainService mainService = new MainService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Alegeti una din optiunile urmatoare: ");
            System.out.println("(1).Afiseaza angajatii din sistem.");
            System.out.println("(2).Adauga angajat nou.");
            System.out.println("(0).Opreste programul.");
            int optiune = Integer.parseInt(scanner.nextLine());
            switch (optiune){
                case 1:
                    mainService.afiseazaAngajati();
                    break;
                case 2:
                    System.out.println("Intoruceti nume, prenumele, varsta si salariul angajatului:");
                    String dataAngajat = scanner.nextLine();
                    String[] fragments = dataAngajat.split(" ");
                    Programator programator = new Programator(
                            Double.parseDouble(fragments[3]),
                            fragments[0],
                            fragments[1],
                            Integer.parseInt(fragments[2])
                    );
                    mainService.adaugaProgramator(programator);
                    break;
                case 0:
                    System.out.println("Oprire program....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Optiunea aleasa este invalida, te rugam sa alegi alta optiune!");
            }
        }
    }
}
