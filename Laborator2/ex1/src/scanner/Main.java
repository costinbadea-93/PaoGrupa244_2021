package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\LaboratorPao2021\\Laborator2\\ex1\\src\\scanner\\data.txt";
        Scanner consoleScanner = new Scanner(System.in);
        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        System.out.println("Introduceti un sir de caractere de la tastatura: ");
//        String text = consoleScanner.nextLine();
//        System.out.println("Ati introdus de la tastatura: " + text);

//        System.out.println("Introduceti numere de la tastatura pana la intalnirea lui 0: ");
//        int sum = 0;
//        while (true){
//            int nr = consoleScanner.nextInt();
//            System.out.println("Ati introdus de la tastatura " + nr);
//            sum = sum + nr;
//            System.out.println("Suma numerelor introduse pana in acest moment este " + sum);
//            if(nr == 0) {
//                System.out.println("Suma finala este " + sum);
//                break;
//            }
//        }
    }
}
