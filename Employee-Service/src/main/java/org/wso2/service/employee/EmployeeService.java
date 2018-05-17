package org.wso2.service.employee;

import org.wso2.msf4j.Microservice;
import org.wso2.service.employee.daos.Employee;
import org.wso2.service.employee.daos.EmployeeOnboardRequest;
import org.wso2.service.employee.daos.Status;
import org.wso2.service.employee.utils.EmployeeUtil;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employee") public class EmployeeService implements Microservice {

    @POST @Path("/onboard") public Response OnboradEmployee(EmployeeOnboardRequest employeeOnboardRequest) {
        EmployeeUtil.addNewEmployee(employeeOnboardRequest);
        Status status = new Status("Successfully onboarded the employee !!");
        return Response.status(Response.Status.OK).entity(status).type(MediaType.APPLICATION_JSON).build();
    }

    @GET @Path("/list") public Response getEmployees() {
        List<Employee> employeeList = EmployeeUtil.getEmployees();
        if (employeeList != null && employeeList.size() > 0) {
            return Response.status(Response.Status.OK).entity(employeeList).type(MediaType.APPLICATION_JSON).build();
        } else {
            Status status = new Status("Could not find any Employee detail !!");
            return Response.status(Response.Status.OK).entity(status).type(MediaType.APPLICATION_JSON).build();
        }
    }

}
