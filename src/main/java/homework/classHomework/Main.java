package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.resArea);
        System.out.println(triangle.IsAllSidesEqual());
        System.out.println(triangle.IsTwoSidesEqual());

        Triangle triangle1 = new Triangle(4,6,5,0);
        System.out.println(triangle1.resArea);
        System.out.println(triangle1.IsAllSidesEqual());
        System.out.println(triangle1.IsTwoSidesEqual());
    }
}
