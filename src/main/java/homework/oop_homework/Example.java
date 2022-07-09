package homework.oop_homework;

public class Example {
    public static void main(String[] args) {
        Customer customer = new Customer(123,"Jana",new DiscountRate());
        customer.discountRate.getLevelGold();
        Visit visit = new Visit();
        visit.setProductBuyAmount(0);
        visit.setServicesBuyAmmount(100);
    }
}
