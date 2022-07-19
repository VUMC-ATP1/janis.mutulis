package classroom.polymorphism;

public class Example {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,20);
        calculator.add(20,30,50);
        calculator.add(1.22,2.33);

        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Vehicle car = new Car();
        car.move();

        Car driftCar = new Car();
        driftCar.drift();

    }
}
