public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    
    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }//this is a parameterized constructor

    

    Car( int numberofSeats) {
        this("Black");
        this.noOfSeats = numberofSeats;
    }
    Car() {
        this(4);
        
        currentFuelInLiters = 5;// this is a default constructor, which is calling the parameterized constructor using this() keyword
    
    
    }// this is a default constructor, which is calling the parameterized constructor using this() keyword

    
    public Car start() {
        int pop = 5;
        if (currentFuelInLiters == 0) {
            System.out.println(pop);
            System.out.println("Car is out if fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started.. bruhhhh.....");
        }
        return this;// self reference is returned to the caller, so that the caller can call the next method on the same object
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInLiters +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
    @Override
        protected void finalize() throws Throwable {
        System.out.println("Car object is being garbage collected");
         
    }
    
    // not use because new versions of java is used a best code practices, and it is not recommended to use finalize method, because it is not guaranteed to be called, and it can cause performance issues if used improperly.
    // not use finalize method because it is not guaranteed to be called, and it can cause performance issues if used improperly.
    // this is a finalize method, which is called by the garbage collector when the object is being collected, and it prints a message to the console. It is used to perform any cleanup operations before the object is removed from memory.


System.GC();// is a method that is used to request the garbage collector to run, and it is not guaranteed to be called, and it can cause performance issues if used improperly. It is not recommended to use System.GC() method, because it can cause performance issues if used improperly, and it is not guaranteed to be called.

}