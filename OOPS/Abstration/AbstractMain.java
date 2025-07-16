abstract class Vehicle {
    abstract void start();
    abstract void drive();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Starting the engine...");
    }

    @Override
    void drive() {
        System.out.println("Driving the car...");
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.drive();
    }
}
