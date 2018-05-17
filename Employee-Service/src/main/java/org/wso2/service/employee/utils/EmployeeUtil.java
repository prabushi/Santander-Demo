package org.wso2.service.employee.utils;

import org.wso2.service.employee.daos.Employee;
import org.wso2.service.employee.daos.EmployeeOnboardRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prabushi on 5/17/18.
 */
public class EmployeeUtil {
    private static List<Employee> employees = new ArrayList<>();
    public static Employee addNewEmployee(EmployeeOnboardRequest employeeOnboardRequest) {

        Employee employee = new Employee();

        employee.setUsername(employeeOnboardRequest.getUsername());
        employee.setName(employeeOnboardRequest.getName());
        employee.setLastName(employeeOnboardRequest.getLastName());
        employee.setAccount(employeeOnboardRequest.getAccount());
        employee.setAccountNumber(employeeOnboardRequest.getAccountNumber());
        employee.setAddress(employeeOnboardRequest.getAddress());
        employee.setDob(employeeOnboardRequest.getDob());
        employee.setEmail(employeeOnboardRequest.getEmail());
        employee.setPosition(employeeOnboardRequest.getPosition());
        employee.setRecruitmentDate(employeeOnboardRequest.getRecruitmentDate());
        employees.add(employee);
        return employee;
    }

    public static List<Employee> getEmployees() {
        return employees;
    }
}
