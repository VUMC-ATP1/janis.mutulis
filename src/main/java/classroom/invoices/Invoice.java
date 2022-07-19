package classroom.invoices;

public class Invoice {
    int id;
    Customer customer = new Customer(400045679,"SIA MIA",9);
    double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
    public int getCustomerID() {
        return customer.id;
    }
    public String getCustomerName() {
        return customer.name;
    }
    public int getCustomerDiscount() {
        return customer.discount;
    }
    public double getAmountAfterDiscount() {
        return amount - (amount / 100 * customer.discount);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + "ID: " + customer.id +
                ", amount=" + amount +
                '}';
    }
}
