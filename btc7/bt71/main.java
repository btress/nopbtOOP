package bt71;

import java.util.Date;
public class main {
    public static void main(String[] args) {
        Date visitDate = new Date();
        Visit visit = new Visit("Alice", visitDate);
        visit.setServiceExpense(100.0);
        visit.setProductExpense(50.0);
        visit.customer.setMember(true);
        visit.customer.setMemberType("Premium");
        System.out.println(visit);
    }
}
