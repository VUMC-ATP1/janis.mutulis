package homework.oop_homework;

public class Customer {
    int id;
    String name;
    DiscountRate discountRate = new DiscountRate();

    public Customer(int id, String name, DiscountRate discountRate) {
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
    }

    public Customer() {
    }
}
