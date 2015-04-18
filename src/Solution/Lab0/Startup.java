/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution.Lab0;

/**
 *
 * @author Taylor
 */
import java.util.Date;


public class Startup {
    private String lastName;
    private String firstName;
    private Date hireDate;
    private int vacationDays;
    private String ssn;
    private boolean b;
    

    
    public static void main(String[] args) {
        Startup start = new Startup();

        Employee emp = new Employee(
            "Jim",
            "Smith",
            "000-00-0000",
            start.hireDate,
            start.vacationDays);
         
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        System.out.println(fullNameInCaps + " Is Name!");
        
    }
}
