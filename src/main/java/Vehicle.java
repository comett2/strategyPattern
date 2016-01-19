public class Vehicle {
    private String maxSpeed;
    private String maxPassangers;
    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.startEngine();
    }
}
