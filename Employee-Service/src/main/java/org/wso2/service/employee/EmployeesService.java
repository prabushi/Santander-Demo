package org.wso2.service.employee;

import org.wso2.msf4j.Microservice;
import org.wso2.service.employee.daos.Employee;
import org.wso2.service.employee.daos.EmployeeOnboardRequest;
import org.wso2.service.employee.daos.Status;
import org.wso2.service.employee.utils.EmployeeUtil;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employees") public class EmployeesService implements Microservice {

    @GET @Path("/{action}") public Response getEmployees(@PathParam("action") String action) {
        List<Employee> employeeList = EmployeeUtil.getEmployees();
        if (employeeList != null && employeeList.size() > 0) {
            return Response.status(Response.Status.OK).entity(employeeList).type(MediaType.APPLICATION_JSON).build();
        } else {
            Status status = new Status("Could not find any Employee detail !!");
            return Response.status(Response.Status.OK).entity(status).type(MediaType.APPLICATION_JSON).build();
        }
    }

}
