package service;

import model.Car;
import model.Engine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static List<Car> cars = new ArrayList<>();

    private CarService(){
        Engine audiEngine = new Engine("2.0", "TDI");
        Engine volkswagenEngine = new Engine("1.4", "TSI");
        Engine citroenEngine = new Engine("1.6", "TFSI");

        Car audiA4 = new Car("Audi A4",100, audiEngine);
        Car volkswagenGolf5 = new Car("Volkswagen Golf5",110, volkswagenEngine);
        Car citroenC5 = new Car("Citroen C5",107, citroenEngine);

        cars.add(audiA4);
        cars.add(volkswagenGolf5);
        cars.add(citroenC5);
    }

    private static class SINGLETON_HOLDER{
        private static final CarService INSTANCE = new CarService();
    }

    public static CarService getInstance() {
        return SINGLETON_HOLDER.INSTANCE;
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("###  S-a adaugat masina... " + car);
    }

    public List<Car> getAllCars() {
        System.out.println("### Retrieving cars..." + cars);
        return cars;
    }

    public List<Car> getCarsOrderedByName(){
        List<Car> sortedByNameCars = cars.stream()
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toList());
        System.out.println("### Retrieving cars sorted by name..." + sortedByNameCars);
        return  sortedByNameCars;
    }

    public List<Car> getCarsOrderedByCodeId(){
        List<Car> sortedByCodeIdCars = cars.stream()
                .sorted(Comparator.comparing(Car::getCodeId))
                .collect(Collectors.toList());
        System.out.println("### Retrieving cars sorted by codeId..." + sortedByCodeIdCars);
        return  sortedByCodeIdCars;
    }

    public List<Car> getCarsOrderedByEngineCapacity(){
        List<Car> sortedByEngineCapacityCars = cars.stream()
                .sorted(Comparator.comparing(o -> o.getEngine().getCapacity()))
                .collect(Collectors.toList());
        System.out.println("### Retrieving cars sorted by capacity..." + sortedByEngineCapacityCars);
        return  sortedByEngineCapacityCars;
    }

}
