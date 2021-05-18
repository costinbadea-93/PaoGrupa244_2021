package model;

public class Engine {
    private String capacity;
    private String engineType;

    public Engine(String capacity, String engineType) {
        this.capacity = capacity;
        this.engineType = engineType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity='" + capacity + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
