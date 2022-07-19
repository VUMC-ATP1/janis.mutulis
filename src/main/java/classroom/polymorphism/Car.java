package classroom.polymorphism;

public class Car extends Vehicle{
    public void drift(){
        System.out.println("I can drift!");
    }

    @Override
    public void move() {
        System.out.println("You call move() from: " + this.getClass().getName());
        System.out.println("Engine started!");
    }
}
