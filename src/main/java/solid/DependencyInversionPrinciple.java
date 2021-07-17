package solid;

public class DependencyInversionPrinciple {
    /**
     *  High-level modules should not depend on low-level modules. Both should depend on abstractions.
     *  Abstractions should not depend on details. Details should depend on abstractions.
     */
}

class Driver {
    Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive() {
        car.run();
    }
}

interface Car {
    void run();
}

class SportsCar implements Car {
    public void run() {
        System.out.println("fast!");
    }
}

class Truck implements Car {
    public void run() {
        System.out.println("powerful!");
    }
}
