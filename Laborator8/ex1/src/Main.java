import model.Car;
import service.CarService;
import service.ReportGeneratorService;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarService carService = CarService.getInstance();
        ReportGeneratorService reportGeneratorService = ReportGeneratorService.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose one of the following options: ");

        while (true) {
            System.out.println("1.List all cars from the system");
            System.out.println("2.List all cars from the system sorted by name");
            System.out.println("3.List all cars from the system sorted by codeId");
            System.out.println("4.List all cars from the system bu engine capacity");
            System.out.println("5.Generate report with all cars ordered by name");
            System.out.println("6.Generate report with all cars ordered by engine capacity");
            System.out.println("0.Close program");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println(carService.getAllCars());
                    break;
                case "2":
                    System.out.println(carService.getCarsOrderedByName());
                    break;
                case "3":
                    System.out.println(carService.getCarsOrderedByCodeId());
                    break;
                case "4":
                    System.out.println(carService.getCarsOrderedByEngineCapacity());
                    break;
                case "5":
                    List<Car> orderedByNameCars = carService.getCarsOrderedByName();
                    reportGeneratorService.generateCarsOrderedByNameReport(orderedByNameCars);
                    break;
                case "6":
                    List<Car> orderedByCapacityCars = carService.getCarsOrderedByEngineCapacity();
                    reportGeneratorService.generateCarsOrderedByNameReport(orderedByCapacityCars);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Invalid Option!!!");
            }
        }
    }
}
