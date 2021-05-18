package service;

import model.Car;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReportGeneratorService {
    private static final String reportsPath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\LaboratorPao2021\\Laborator8\\ex1\\src\\reports\\CarsOrderedByNameReport";
    private ReportGeneratorService(){}

    private static class  SINGLETON_HOLDER{
        private static final ReportGeneratorService INSTANCE = new ReportGeneratorService();
    }

    public static ReportGeneratorService getInstance() {
        return SINGLETON_HOLDER.INSTANCE;
    }

    /**
     * generating CarsOrderedByNameReport
     */

    public void generateCarsOrderedByNameReport(List<Car> carList){
        StringBuilder reportContent = new StringBuilder();

        //build header report
        reportContent.append("CODE_ID");
        reportContent.append(",");
        reportContent.append("NAME");
        reportContent.append(",");
        reportContent.append("ENGINE_CAPACITY");
        reportContent.append(",");
        reportContent.append("ENGINE_TYPE");
        reportContent.append("\n");

        carList.forEach(car -> {
            reportContent.append(car.getCodeId());
            reportContent.append(",");
            reportContent.append(car.getName());
            reportContent.append(",");
            reportContent.append(car.getEngine().getCapacity());
            reportContent.append(",");
            reportContent.append(car.getEngine().getEngineType());
            reportContent.append("\n");
        });

        String fileExtension = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String filePath = reportsPath + fileExtension + ".csv";

        try {
            Files.createFile(Paths.get(filePath));
            Files.write(Paths.get(filePath), reportContent.toString().getBytes());
            System.out.println("Report was generated to : " + filePath);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
