public class driver {
    
public static void main(String[] args) {
    car c1 = new car();
    c1.noOfWheels = 4;
    c1.color = "Red";
    c1.maxSpeed = 200.0f;
    c1.curerrFuelLiter = 50.0f;
    c1.noofSeats = 5;

    System.out.println("Car Details:");
    System.out.println("Number of Wheels: " + c1.noOfWheels);
    System.out.println("Color: " + c1.color);
    System.out.println("Max Speed: " + c1.maxSpeed + " km/h");
    System.out.println("Current Fuel: " + c1.getCurerrFuelLiter() + " liters");
    System.out.println("Number of Seats: " + c1.noofSeats);

    // Driving the car
    c1.drive();
    System.out.println("Current Fuel after driving: " + c1.getCurerrFuelLiter() + " liters");

    // Adding fuel
    c1.addFuel(20.0f);
    System.out.println("Current Fuel after adding fuel: " + c1.getCurerrFuelLiter() + " liters");
}
}

// object is used to car class instance
// and we can access all the properties 
// and methods of the car class using that 
// object.