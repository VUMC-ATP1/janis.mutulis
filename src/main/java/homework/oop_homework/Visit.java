package homework.oop_homework;

import java.time.LocalDate;
import java.util.Date;

public class Visit {
    Customer customer;
    LocalDate date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, LocalDate date) {
        name = customer.getName();
        date = LocalDate.now();
    }
    public String getName(){
    return customer.getName();
    }
    public double getServiceExpense(){
        DiscountRate serviceExpanseDiscountRate = new DiscountRate();
       return serviceExpense * serviceExpanseDiscountRate.getServiceDiscountRate(customer.getName());
    }
    public double setServiceExpense(double ex){
        serviceExpense = ex;
        return serviceExpense;
    }
    public double getProductExpense(){
        DiscountRate productExpanseDiscountRate = new DiscountRate();
        return serviceExpense * productExpanseDiscountRate.getServiceDiscountRate(customer.getName());
    }
    public double setProductExpense(double ex){
        productExpense = ex;
        return productExpense;
    }
    public double getTotalExpense(){
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}

