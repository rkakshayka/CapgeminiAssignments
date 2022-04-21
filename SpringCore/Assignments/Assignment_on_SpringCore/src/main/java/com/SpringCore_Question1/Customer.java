package com.SpringCore_Question1;

class Customer{
    private int customerId;
    private String customerName;
    private long customerContact;
    private Address customerAddress;

    public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }
    public void showDetails(){
        System.out.println("Name:-"+getCustomerName()+" ID:-"+getCustomerId()+" Contact:-"+getCustomerContact()+" Address:-"+getCustomerAddress());
    }

    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public long getCustomerContact() {
        return customerContact;
    }
    public Address getCustomerAddress() {
        return customerAddress;
    }
}

