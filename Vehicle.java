public class Vehicle {
    private String model;
    private int mileage;
    private boolean engineRunning;

    /**
     * Constructor: All vehicles start with 0 miles and engine off.
     */
    public Vehicle(String model) {
        // TODO: Initialize variables
        mileage = 0;
        engineRunning = false;
        model = "";
    }

    public void startEngine() {
        // TODO: Set engineRunning to true
        engineRunning = true;
    }

    /**
     * Increases mileage if the engine is running.
     */
    public void drive(int distance) {
        // TODO: Logic to add distance only if engineRunning is true
        distance = 0;
        if(engineRunning)
            distance++;
    }
    public String toString() {
        // TODO: Return model, mileage, and status
        if(engineRunning)
            return "You are driving a " + model +". It has " + mileage + " miles. The engine is running.";
        else
            return "You are driving a " + model +". It has " + mileage + " miles. The engine is not running.";
    }
}
