package org.wso2.service.bank;

import org.wso2.service.bank.daos.Branch;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import org.wso2.msf4j.Microservice;
import com.google.gson.Gson;
import org.wso2.msf4j.Microservice;
import org.wso2.service.bank.daos.Status;

@Path("/bank")
public class BankInformation implements Microservice {
    private List<Branch> branches = new ArrayList<>();

    public BankInformation() {
        //String name, String location, String availability, String phone, String address
        branches.add(new Branch("Borella South", "Colombo", "8 a.m. - 1.30 p.m.", "+94124567890", "No. 123, Borella South, Colombo 08"));
        branches.add(new Branch("Bambalapitiya", "Colombo", "8 a.m. - 3.30 p.m.", "+94124567345", "No. 234, Bambalapitiya, Colombo 05"));
        branches.add(new Branch("Kolpity", "Colombo", "10 a.m. - 2.00 p.m.", "+941246789890", "No. 789, Kolpity, Colombo 03"));
        branches.add(new Branch("Borella North", "Colombo", "8 a.m. - 1.30 p.m.", "+94124563390", "No. 89, Borella North, Colombo 08"));
        branches.add(new Branch("Gampaha", "Gampaha", "9 a.m. - 3.30 p.m.", "+94127773390", "No. 23, Hospital Rd., Gampaha"));
    }

    @GET @Path("/branches/{location}") public Response getAppointment(@PathParam("location") String location) {
        return this.listBranches(location);
    }

    private Response listBranches(String location) {

        List<Branch> tempBranches = new ArrayList<>();
        for (int i = 0; i < branches.size(); i++) {
            Branch brn = branches.get(i);
            if (brn.getLocation().equalsIgnoreCase(location)) {
                tempBranches.add(brn);
            }
        }
        if (tempBranches != null && tempBranches.size() > 0) {
            return Response.status(Response.Status.OK) .entity(tempBranches).type(MediaType.APPLICATION_JSON).build();
        } else {
            Status status = new Status("Could not find any branches located at " +location);
            return Response.status(Response.Status.OK) .entity(status).type(MediaType.APPLICATION_JSON).build();
        }

    }
}
