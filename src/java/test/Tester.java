/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Houssem
 */
@Path("test")
public class Tester {

    @GET
    public String get() {
        return "getCalled";
    }

    //works
//    @POST
//    public String post(String s) {
////        List< Person> persons = new ArrayList<>();
////        persons.add(new Person("A", "Z", "AA", 10));
////        persons.add(new Person("A", "Z", "AA", 10));
////        persons.add(new Person("A", "Z", "AA", 10));
////        persons.add(new Person("A", "Z", "AA", 10));
////        persons.add(new Person("A", "Z", "AA", 10));
////        persons.add(new Person("A", "Z", "AA", 10));
////        persons.add(new Person());
////        persons.add(new Person());
////        persons.add(new Person());
//        return "   and the postCalled   " + s;
//  }  
//not yet because of list of entities
//    @POST
//    public String post(List<Person> persons) {
//        return "postCalled   ";
//    }
    @POST
    public String post(List<Person> persons) {
        return "postCalled  + " +persons;
    }
}
