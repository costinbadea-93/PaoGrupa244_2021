package csv.utils;

import csv.model.Animal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class CsvWriter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\LaboratorPao2021\\Laborator6\\ex1\\src\\csv\\data.csv";
        List<Animal> animals = Arrays.asList(
                new Animal("Bobita", "Negru"),
                new Animal("Bobita1", "Alb"),
                new Animal("Bobita2", "Rosu")
        );
        try(PrintWriter printWriter = new PrintWriter(filePath)){
            StringBuilder stringBuilder = new StringBuilder();

            //csv header
            reportRecord(stringBuilder,"nume", "culoare");

            //csv content body
            animals.forEach(animal -> {
                reportRecord(stringBuilder, animal.getName(), animal.getCuloare());
            });

            printWriter.write(stringBuilder.toString());
            System.out.println("Report generated!!");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static StringBuilder reportRecord( StringBuilder sb , String c1, String c2) {
        sb.append(c1);
        sb.append(",");
        sb.append(c2);
        sb.append("\n");
        return sb;
    }
}
