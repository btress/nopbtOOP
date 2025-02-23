package bt71;

import java.util.Date;

public class Visit {
    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }


    public double getTotalExpense() {

        String memberType =customer.getMemberType();
        System.out.println(customer.getMemberType());

        if (memberType == null) {
            memberType = "";
        }
        double serviceDiscount = DiscountRate.getServiceDiscountRate(memberType);
        double productDiscount = DiscountRate.getProductDiscountRate(memberType);

        return (serviceExpense * (1 - serviceDiscount)) + (productExpense * (1 - productDiscount));
    }


    @Override
    public String toString() {
        return "Visit{customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense + ", totalExpense=" + getTotalExpense() + "}";
    }
}
