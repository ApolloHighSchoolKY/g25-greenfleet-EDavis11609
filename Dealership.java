import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(new Vehicle());
        inventory.add(new ElectricCar());
        
        System.out.println("--- End of Day Report ---");
        // TODO: Loop through inventory. 
        for(Vehicle car: inventory)
        {
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
            if(car instanceof ElectricCar)
            {
                ElectricCar eCar = (ElectricCar)car;

                System.out.println("The battery is at " + eCar.batteryPercent + " percent.");
                if(eCar.batteryPercent<10.0)
                    System.out.println("You need to charge your car. Re-routing to nearest charging station");
                System.out.println("Optimal battery charge. Continue travel");
            }
        }
    }
}
