package csv.utils;

import csv.model.Animal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CsvReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\LaboratorPao2021\\Laborator6\\ex1\\src\\csv\\data.csv";
        try(Scanner sc = new Scanner(new File(filePath))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String [] dataLine = line.split(",");
                if(dataLine[0].equals("nume") && dataLine[1].equals("culoare")){
                    System.out.println("Header data!!!!");
                }else {
                    Animal animal = new Animal(dataLine[0], dataLine[1]);
                    System.out.println(animal);
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
