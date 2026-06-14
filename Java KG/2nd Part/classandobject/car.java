public class car {
    
   
    int noOfWheels;

    String color;

    float maxSpeed;

    float curerrFuelLiter;

    int noofSeats;

    // There All This Is Instanace Properties

    public void drive() {
        System.out.println("Car Is Driving");
        curerrFuelLiter -= 1;
    }

    public void addFuel(float fuel) {
        curerrFuelLiter += fuel;
        
    }

    public float getCurerrFuelLiter() {
        return curerrFuelLiter;
    }
// there all instance method
     

}
