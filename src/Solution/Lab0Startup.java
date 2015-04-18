/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution;

/**
 *
 * @author Taylor
 */
import java.util.Date;


public class Lab0Startup {
    private String lastName;
    private String firstName;
    private Date hireDate;
    private int vacationDays;
    private String ssn;
    private boolean b;
    

    
    public static void main(String[] args) {
        Lab0Startup start = new Lab0Startup();

        lab0.Employee emp = new lab0.Employee(
            "Jim",
            "Smith",
            "3333333333",
            start.hireDate,
            start.vacationDays);
         
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        System.out.println(fullNameInCaps + " Is Name!");
        
    }
}
