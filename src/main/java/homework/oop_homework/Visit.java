package homework.oop_homework;

public class Visit {
    double productBuyAmount;
    double servicesBuyAmmount;
    Customer customer = new Customer();

    public Visit(double productBuyAmount, double servicesBuyAmmount) {
        this.productBuyAmount = productBuyAmount;
        this.servicesBuyAmmount = servicesBuyAmmount;
    }

    public Visit() {
    }

    public double getProductBuyAmount() {
        return productBuyAmount;
    }

    public void setProductBuyAmount(double productBuyAmount) {
        this.productBuyAmount = productBuyAmount;
    }

    public double getServicesBuyAmmount() {
        return servicesBuyAmmount;
    }

    public void setServicesBuyAmmount(double servicesBuyAmmount) {
        this.servicesBuyAmmount = servicesBuyAmmount;
    }
    public double getAmountAfterDiscount() {

       // ????? return (productBuyAmount - (productBuyAmount / 100 * 10)) + (servicesBuyAmmount - (productBuyAmount / 100 * customer.discountRate));
        return 0;
    }
}
