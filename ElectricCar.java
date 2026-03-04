public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        // TODO: Set batteryPercent to 100.0
        super(model);
        batteryPercent = 100.0;
    }
    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        // TODO: Call super.drive() 
        // TODO: Calculate battery loss
        super.drive(distance);

        double decrease = distance/5.0;

        batteryPercent -= decrease;

        if(batteryPercent<0)
            batteryPercent=0;
    }
    public void charge() {
        batteryPercent = 100.0;
    }
    public double getBattery()
    {
        return batteryPercent;
    }
}
