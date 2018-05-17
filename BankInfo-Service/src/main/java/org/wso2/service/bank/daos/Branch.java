package org.wso2.service.bank.daos;

public class Branch {
    private String name;
    private String location;
    private String availability;
    private String phone;
    private String address;

    public Branch(String name, String location, String availability, String phone, String address) {
        this.name = name;
        this.location = location;
        this.availability = availability;
        this.phone = phone;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getAvailability() {
        return availability;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

}
