package model;

public class Car {
    private String name;
    private int codeId;
    private Engine engine;

    public Car(String name, int codeId, Engine engine) {
        this.name = name;
        this.codeId = codeId;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", codeId=" + codeId +
                ", engine=" + engine +
                '}';
    }
}
