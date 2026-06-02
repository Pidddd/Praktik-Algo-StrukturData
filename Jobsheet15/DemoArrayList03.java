package Jobsheet15;

import java.util.ArrayList;

public class DemoArrayList03 {
    public static void main(String[] args) {
        ArrayList<Customer03> customers = new ArrayList<>();

        Customer03 customer1 = new Customer03(1, "Zakia");
        Customer03 customer2 = new Customer03(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer03(4, "Cica"));
        customers.add(2, new Customer03(100, "Rosa"));

        System.out.println(customers.indexOf(customer2)); 

        Customer03 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer03> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer03(201, "Della"));
        newCustomers.add(new Customer03(202, "Victor"));
        newCustomers.add(new Customer03(203, "Sarah"));
        
        customers.addAll(newCustomers);

        System.out.println(customers);
    }
}
