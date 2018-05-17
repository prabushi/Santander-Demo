package org.wso2.service.employee.daos;

/**
 * "username": "Nirmala",
 * "name": "Nirmala",
 * "lastName" : "Liyanaarachchi",
 * "position": "Software Engineer",
 * "dob" : "1991-02-08",
 * "account" : "Integration-Team",
 * "email" : "nirmalan@wso2.com",
 * "contact" : "94123456789",
 * "address": "1200, Kelaniya",
 * "recruitmentDate" : "2018-05-16"
 */
public class Employee {
    private String username;
    private String name;
    private String lastName;
    private String position;
    private String dob;
    private String account;
    private String email;
    private String contact;
    private String address;
    private String recruitmentDate;
    private String accountNumber;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getDob() {
        return dob;
    }

    public String getAccount() {
        return account;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getRecruitmentDate() {
        return recruitmentDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRecruitmentDate(String recruitmentDate) {
        this.recruitmentDate = recruitmentDate;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }
}
