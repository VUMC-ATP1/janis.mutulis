package objects;

public class Employee {
    String name;
    byte age;
    boolean isCool;
    int birthYear;
    double salary;

    public Employee(String name, byte age, boolean isCool, int birthYear, double salary) {
        this.name = name;
        this.age = age;
        this.isCool = isCool;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public Employee() {
    }
}
