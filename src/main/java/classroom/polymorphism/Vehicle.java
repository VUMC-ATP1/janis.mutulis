package classroom.polymorphism;

public class Vehicle {
    public void move(){
        System.out.println("You call move() from: " + this.getClass().getName());
    }
}
