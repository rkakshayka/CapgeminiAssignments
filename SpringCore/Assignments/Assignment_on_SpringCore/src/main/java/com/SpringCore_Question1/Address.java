package com.SpringCore_Question1;

class Address {
    String country;
    String state;
    String city;
    int zip;
    int street;

    public Address(String country, String state, String city, int zip, int street) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public int getZip() {
        return zip;
    }
    public int getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "{Country:- "+getCountry()+", City:-"+getCity()+", State:-"+getState()+", Zipcode:-"+getZip()+", Street:-"+getStreet()+"}";
    }
}


