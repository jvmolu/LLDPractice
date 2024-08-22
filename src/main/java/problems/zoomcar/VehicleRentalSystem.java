package problems.zoomcar;

import java.util.ArrayList;

public class VehicleRentalSystem {

    ArrayList<Store> stores;
    ArrayList<Customer> customers;

    public VehicleRentalSystem() {
        stores = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public void removeStore(Store store) {
        stores.remove(store);
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void updateCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.getUserId().equals(customer.getUserId())) {
                c = customer;
            }
        }
    }



}
