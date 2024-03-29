package academy.devdojo.javaoneforall.javacore.Kenumaration.test;

import academy.devdojo.javaoneforall.javacore.Kenumaration.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Kenumaration.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.Kenumaration.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        // passing attributes(objects) from the Enumeration CustomerType(COMPANY and INDIVIDUAL)
        // passing attributes(objects) from the Enumeration PaymentType(CREDIT, DEBIT)
        Customer customer1 = new Customer("Tsubasa", CustomerType.INDIVIDUAL, PaymentType.CREDIT);
        Customer customer2 = new Customer("Akira", CustomerType.COMPANY, PaymentType.DEBIT);
        // only objects which pass for the validation of data inside the constructor are
        // going be fulfill

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculationDiscount(100));
        System.out.println(PaymentType.CREDIT.calculationDiscount(100));

        // for (CustomerType value : CustomerType.values()) {
        //     System.out.println(value);
        // }

        // All enumerations will provide to you some methods like:
        // values() -> that will return all the enumerations inside this Class
        // valuesOf() -> that will return the enumaration which contain this values

        CustomerType customerType = CustomerType.valueOf("INDIVIDUAL");
        System.out.println(customerType.getReportValue());

        CustomerType customerType2 = CustomerType.getByReportValue("ComPany");
        System.out.println(customerType2.getReportValue());

    }
}
