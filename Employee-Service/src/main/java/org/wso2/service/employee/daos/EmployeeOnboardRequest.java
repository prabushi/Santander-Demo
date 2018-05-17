package org.wso2.service.employee.daos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by prabushi on 5/17/18.
 */
@XmlRootElement
public class EmployeeOnboardRequest {
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

    public EmployeeOnboardRequest(String username, String name, String lastName, String position, String dob,
            String account, String email, String contact, String address, String recruitmentDate, String accountNumber) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.dob = dob;
        this.account = account;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.recruitmentDate = recruitmentDate;
        this.accountNumber = accountNumber;
    }

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
