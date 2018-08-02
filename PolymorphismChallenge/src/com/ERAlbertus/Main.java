package com.ERAlbertus;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public void startEngine () {
        System.out.println("Engine started");
    }

    public void accelerate () {
        System.out.println("Car accelerates");
    }

    public void brake () {
        System.out.println("car decelerates");
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


}

class WRX extends Car {
    public WRX () {
        super(4, "WRX");
    }

    @Override
    public void startEngine () {
        System.out.println("VRRRRRRRRROOOOM => 2.0L Boxer motor fires up");
    }

    @Override
    public void accelerate () {
        System.out.println("0 to 60 in 6.2 seconds");
    }

    @Override
    public void brake () {
        System.out.println("60 to 0 in 110 ft");
    }
}

class BMW_335d extends Car {
    public BMW_335d() {
        super(6, "335d");
    }

    @Override
    public void startEngine() {
        System.out.println("PRRRRRRRRRRRRRR=> 3.0L I-6 turbodiesel fires up");
    }

    @Override
    public void accelerate() {
        System.out.println("0 to 60 in 6.0 seconds");
    }

    @Override
    public void brake() {
        System.out.println("60 to 0 in 107 ft");
    }
}

class EVO extends Car {
    public EVO() {
        super(4, "EVO");
    }

    @Override
    public void startEngine() {
        System.out.println("RRRRRRRRRRRRRRRRRRRRRRR=> 2.0L I-4 turbo fires up");
    }

    @Override
    public void accelerate() {
        System.out.println("0 to 60 in 5.2 seconds");
    }

    @Override
    public void brake() {
        System.out.println("60 to 0 in 115 ft");
    }
}

public class Main {
    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new WRX();
            case 2:
                return new BMW_335d ();
            case 3:
                return new EVO();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
        Car newCar = new Car(8, "basic");
        newCar.startEngine();
        newCar.accelerate();
        newCar.brake();
        for(int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() );
            car.startEngine();
            car.accelerate();
            car.brake();
        }
    }
}
