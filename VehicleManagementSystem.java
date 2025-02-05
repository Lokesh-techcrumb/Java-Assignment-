class Vehicle{

    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayinfo(){
        System.out.print("Make: " + make + ", Model: " + model + ", year: " + year);
    }
}

class Car extends Vehicle{
    private int numDoors;

    public Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println(", Number of Doors: " + numDoors);
    }
}

class Bike extends Vehicle{
    private boolean hasGear;

    public Bike(String make, String model, int year, boolean hasGear){
        super(make, model, year);
        this.hasGear = hasGear;
    }

    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println(", Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

    
public class VehicleManagementSystem {

    public static void main(String[] args) {
        Car Suv = new Car("Toyota", "SUV", 2000, 4);

        Bike Platina = new Bike("Bajaj", "Platina", 2022, true);

        System.out.println("Car Details: ");
        Suv.displayinfo();

        System.out.println("Bike Details: ");
        Platina.displayinfo();

    }
}