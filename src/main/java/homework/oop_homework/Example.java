package homework.oop_homework;

import java.time.LocalDate;

public class Example {
    public static void main(String[] args) {
    Customer customer = new Customer("Līga");
    customer.setMember(true);
    customer.setMemberType("Gold");
        System.out.println(customer.toString());

    Visit visit = new Visit("Visit",LocalDate.now());
    visit.setServiceExpense(50.00);
    visit.setProductExpense(60.00);
    visit.getProductExpense();
    visit.getServiceExpense();
    visit.getTotalExpense();
        System.out.println(visit.toString());


    }

}
